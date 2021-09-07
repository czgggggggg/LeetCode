package string;

import java.util.HashSet;

/**
 * @Author czgggggggg
 * @Date 2021/9/7
 * @Description
 */
public class String0771 {
    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA","aAAbbbb"));//3
        System.out.println(numJewelsInStones("z","ZZ"));//0
        System.out.println(numJewelsInStones("z","ZZz"));//1
        System.out.println(numJewelsInStones("","ZZ"));//0
        System.out.println(numJewelsInStones("z",""));//0
    }
    public static int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < jewels.length(); i++){
            set.add(jewels.charAt(i));
        }

        int count = 0;
        for(int i = 0; i < stones.length(); i++){
            if(set.contains(stones.charAt(i)))
                count++;
        }

        return count;
    }
}
