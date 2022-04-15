package xiecheng;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @Author czgggggggg
 * @Date 2022/4/14
 * @Description
 */
public class Test0005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();

        HashMap<Integer,int[]> map = new HashMap<>();
        char ch;
        for(int i = 0; i < str.length(); i++){
            ch = str.charAt(i);
            if(!map.keySet().contains(nums[i])){
                if(ch == 'R'){
                    map.put(nums[i],new int[]{1,0});
                }else{//B
                    map.put(nums[i],new int[]{0,1});
                }
            }else{
                int[] ints = map.get(nums[i]);
                if(ch == 'R'){
                    ints[0]++;
                    map.put(nums[i], ints);
                }else{//B
                    ints[1]++;
                    map.put(nums[i], ints);
                }
            }
        }

        Iterator<Integer> iterator = map.keySet().iterator();
        long sum = 0;
        while(iterator.hasNext()){
            Integer next = iterator.next();
            int[] ints = map.get(next);
            sum += (ints[0] * ints[1]);
        }

        System.out.println(sum);
    }
}
