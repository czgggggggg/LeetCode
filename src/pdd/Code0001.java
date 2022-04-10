package pdd;

import java.util.*;

/**
 * @Author czgggggggg
 * @Date 2022/4/10
 * @Description
 */
public class Code0001 {
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

        for(int i = 0; i < n; i++){
            //第一次出现
            if(!set.contains(arr[i])){
                set.add(arr[i]);
                //开始判断是否成立
                int dis = 0;//间隔
                boolean tag = false;
                boolean tag2 = true;
                for(int j = i + 1; j < n;){
                    if(arr[j] == arr[i] && !tag){
                        dis = j - i;
                        tag = true;//已经确定间隔
                        list.add(arr[i]);
                    }
                    if(tag){
                        if(arr[j] != arr[i]){
                            tag2 = false;
                            break;
                        }else{
                            j += dis;
                        }
                    }else{
                        j++;
                    }
                }
                if((tag && tag2) || (!tag)){
                    map.put(arr[i], dis);
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
//3
//1 2 1
//2
//1 2
//2 0

//9
//1 2 1 1 2 1 1 2 3
//2
//2 3
//3 0

//7
//1 2 1 0 1 2 1
//3
//0 0
//1 2
//2 4

//9
//3 1 2 1 0 1 2 1 4
//0 0
//1 2
//2 4
//3 0
//4 0

//10
//0 3 1 2 1 0 1 2 1 4
//5
//0 5
//1 2
//2 4
//3 0
//4 0

//11
//0 3 1 2 1 0 1 2 1 4 9
//
