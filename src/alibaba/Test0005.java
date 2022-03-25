package alibaba;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author czgggggggg
 * @Date 2022/3/25
 * @Description
 */
public class Test0005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[][] nums = new int[t][5];
        for(int i = 0; i < t; i++){
            for(int j = 0; j < 5; j++){
                nums[i][j] = sc.nextInt();
            }
        }
        int count;
        for(int i = 0; i < t; i++){
            count = 0;
            Arrays.sort(nums[i]);
            while(nums[i][1] != 0){
                nums[i][1]--;
                nums[i][2]--;
                nums[i][3]--;
                nums[i][4]--;
                count++;
                Arrays.sort(nums[i]);
            }
            System.out.println(count);
        }
    }
}
//2
//3 4 2 5 3
//2 2 2 2 0