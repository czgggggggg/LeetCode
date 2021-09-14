package string;

/**
 * @Author czgggggggg
 * @Date 2021/9/14
 * @Description
 */
public class String1796 {
    public static void main(String[] args) {
        System.out.println(secondHighest("dfa12321afd"));//2
        System.out.println(secondHighest("abc1111"));//-1

        System.out.println(secondHighest("a1cdw"));//-1
        System.out.println(secondHighest("asd2ad1cd"));//1
        System.out.println(secondHighest("dc3we2cd1cdsd"));//2
        System.out.println(secondHighest("41c3d2"));//3
    }
    public static int secondHighest(String s) {
        int max = -1;
        int old_max = -1;

        char ch;
        for(int i = 0; i < s.length(); i++){
            ch = s.charAt(i);
            if(ch >= 48 && ch <= 57){
                if(ch - 48 > max){
                    old_max = max;
                    max = ch - 48;
                }
                else if(ch - 48 < max){//ch - 48 == max不考虑
                    if(ch - 48 > old_max)
                        old_max = ch - 48;
                }
            }
        }

        return old_max;
    }
}
