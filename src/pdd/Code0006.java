package pdd;

import java.util.*;

/**
 * @Author czgggggggg
 * @Date 2022/4/10
 * @Description
 */
public class Code0006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();//存放已经成立的颜色
        HashSet<Integer> set = new HashSet<>();//存放已经出现的颜色
        HashMap<Integer, List<Integer>> map2 = new HashMap<>();

        for(int i = 0; i < n; i++){
            //第一次出现
            if(!set.contains(arr[i])){
                List<Integer> list2 = new ArrayList<>();
                list2.add(i);

                set.add(arr[i]);
                //开始判断是否成立
                int dis = 0;//间隔
                boolean tag = false;
                for(int j = i + 1; j < n;){
                    if(arr[j] == arr[i] && !tag){
                        dis = j - i;
                        tag = true;//已经确定间隔
                    }
                    if(tag){
                        if(arr[j] != arr[i]){
//                            tag2 = false;
//                            break;
                        }else{
                            list2.add(arr[i]);
                            j += dis;
                        }

                    }else{
                        j++;
                    }
                }
                boolean tag2 = true;
                if(list2.size() == 1)
                    map.put(arr[i], dis);
                else{
                    Iterator<Integer> iterator = list2.iterator();
                    Integer pre = iterator.next();
                    while(iterator.hasNext()){
                        Integer cur = iterator.next();
                        if(cur - pre != dis){
                            tag2 = false;
                            break;
                        }
                        pre = cur;
                    }
                    if(tag2){
                        map.put(arr[i], dis);
                    }
                }
            }
        }


        Iterator<Integer> iterator = map.keySet().iterator();
        int size = map.keySet().size();
        int[] tmp = new int[size];

        int t = 0;
        while(iterator.hasNext()){
            Integer next = iterator.next();
            tmp[t++] = next;
        }

        Arrays.sort(tmp);

        System.out.println(size);
        for(int i = 0; i < size; i++){
            System.out.println(tmp[i] + " " + map.get(tmp[i]));
        }


    }
}
//11
//0 3 1 2 1 0 1 2 1 4 9