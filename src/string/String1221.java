package string;

/**
 * @Author czgggggggg
 * @Date 2021/9/9
 * @Description
 */
public class String1221 {
    public static void main(String[] args) {
        System.out.println(balancedStringSplit("RLRRLLRLRL"));
        System.out.println(balancedStringSplit("RLLLLRRRLR"));
        System.out.println(balancedStringSplit("LLLLRRRR"));
        System.out.println(balancedStringSplit("RLRRRLLRLL"));
    }
    public static int balancedStringSplit(String s) {
        int count_L = 0;
        int count_R = 0;
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'L')
                count_L++;
            else
                count_R++;
            if(count_L == count_R){
                count++;
                count_L = 0;
                count_R = 0;
            }
        }

        return count;
    }
}
