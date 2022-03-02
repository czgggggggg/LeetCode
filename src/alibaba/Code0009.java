package alibaba;

import java.util.Scanner;

/**
 * @Author czgggggggg
 * @Date 2022/3/2
 * @Description
 */
public class Code0009 {
    public static void main(String[] args) {
//        int[] nums = {1,2,1,2,3};
//        int m = 2;
//        int[] nums = {1,1,1,1,1};
//        int m = 1;
//        int[] nums = {2,1,3,1,4,1,5};
//        int m = 2;
//        System.out.println(func(nums,m));

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(func(nums,m));
    }
    public static int func(int[] nums, int m){
        int res = 0;
        int n = nums.length;
        int count;

//        if(m == 1){
//            count = 0;
//            for(int i = 0; i < n; i++){
//                count += ()
//            }
//        }

        for(int i = 0; i < n; i++){
            count = 1;
            for(int j = i + 1; j < n; j++){
                if(nums[j] == nums[i]){
                    count++;
                }
                if(count == m){
                    res += (n - j);
                    break;
                }
            }
        }

        return res;
    }
}
