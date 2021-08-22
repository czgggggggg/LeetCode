package array;

import java.util.HashSet;

/**
 * @Author czgggggggg
 * @Date 2021/8/22
 * @Description
 */
public class Array575 {
    public static void main(String[] args) {
//        int[] candies = {1,1,2,2,3,3};
        int[] candies = {1,1,2,3};
        System.out.println(distributeCandies(candies));
    }
    public static int distributeCandies(int[] candyType) {
        HashSet<Integer> intSet = new HashSet<>();
        for(int i = 0; i < candyType.length; i++){
            if(!intSet.contains(candyType[i]))
                intSet.add(candyType[i]);
        }
        int num = intSet.size();
        if(num >= candyType.length / 2)
            return candyType.length / 2;
        else
            return num;
    }
}
