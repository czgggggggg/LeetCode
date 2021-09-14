package string;

/**
 * @Author czgggggggg
 * @Date 2021/9/14
 * @Description
 */
public class String1790 {
    public static void main(String[] args) {
        System.out.println(areAlmostEqual("bank","kanb"));
        System.out.println(areAlmostEqual("attack","defend"));
        System.out.println(areAlmostEqual("kelb","kelb"));
        System.out.println(areAlmostEqual("abcd","dcba"));
        System.out.println(areAlmostEqual("abc","cba"));
        System.out.println(areAlmostEqual("abc","bca"));
        System.out.println(areAlmostEqual("abc","abc"));
    }
    public static boolean areAlmostEqual(String s1, String s2) {
        int count = 0;
        char ch1_1 = 'a', ch1_2 = 'b', ch2_1 = 'c', ch2_2 = 'd';
        boolean isFirst = true;
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                count++;
                if(count == 3)
                    return false;
                if(isFirst){
                    ch1_1 = s1.charAt(i);
                    ch2_1 = s2.charAt(i);
                    isFirst = false;
                }else{
                    ch1_2 = s1.charAt(i);
                    ch2_2 = s2.charAt(i);
                }
            }
        }

        if((ch1_1 == ch2_2 && ch1_2 == ch2_1) || count == 0)
            return true;
        return false;
    }
}
