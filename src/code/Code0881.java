package code;

import java.util.Arrays;

/**
 * @Author czgggggggg
 * @Date 2022/1/7
 * @Description
 */
public class Code0881 {
    public static void main(String[] args) {
        int[] people1 = {1,2};
        System.out.println(numRescueBoats(people1,3));//1
        int[] people2 = {3,2,2,1};
        System.out.println(numRescueBoats(people2,3));//3
        int[] people3 = {3,5,3,4};
        System.out.println(numRescueBoats(people3,5));//4

        int[] people4 = {1};
        System.out.println(numRescueBoats(people4,5));//1
    }
    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int n = people.length;
        int count = 0;//需要的救生船的数量
        int i = 0;
        int j = n - 1;
        while (i <= j){
            if(people[i] + people[j] <= limit){
                i++;
                j--;
            }else{
                j--;
            }
            count++;
        }
        return count;
    }
}
