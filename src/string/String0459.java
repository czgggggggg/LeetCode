package string;

/**
 * @Author czgggggggg
 * @Date 2021/9/6
 * @Description
 */
public class String0459 {
    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("a"));//false
        System.out.println(repeatedSubstringPattern("abab"));//true
        System.out.println(repeatedSubstringPattern("aba"));//false
        System.out.println(repeatedSubstringPattern("abcabcabcabc"));//true
        System.out.println(repeatedSubstringPattern("abcabcabcabcabc"));//true
        System.out.println(repeatedSubstringPattern("ababa"));//false
        System.out.println(repeatedSubstringPattern("aaaaaaaaaaaaaaaaaaaaaaaaa"));//true
        System.out.println(repeatedSubstringPattern("aaaaaaaaab"));//false
        System.out.println(repeatedSubstringPattern("aaaaaaaaabaaaaaaaaab"));//true
    }
    public static boolean repeatedSubstringPattern(String s) {
        int j, k;
        boolean result = false;
        for(int i = 1;i <= s.length()/2;i++){
            if(s.length() % i != 0){
                continue;
            }
            k = s.length()/i;
            boolean tag = false;
            for(int i1 = 0; i1 < i; i1++){
                int first = s.charAt(i1);
                for(int i2 = 0; i2 < k; i2++){
                    if(first != s.charAt(i1 + i * i2)){
                        tag = true;
                        break;
                    }
                }
                if(tag)
                    break;
            }

            if(tag){
//                System.out.println("test1");
                continue;
            }
            else{
//                System.out.println("test2");
                result = true;
                break;
            }
        }
        return result;
    }
}
//abcabcabc
//i = 3  j = i k = 3
//s.charAt(0 + i * 0) = s.charAt(0 + i * 1) = s.charAt(0 + i * 2)
//s.charAt(1 + i * 0) = s.charAt(1 + i * 1) = s.charAt(1 + i * 2)
//s.charAt((j - 1) + i * 0) = s.charAt((j - 1) + i * 1) = s.charAt((j - 1) + i * 2)
//abcdabcdabcdabcdabcd
//i = 4  j = 4 k = 5       k = s.length()/i && i * k == s.length()
//s.charAt(0 + i * 0) = s.charAt(0 + i * 1) = s.charAt(0 + i * 2) = s.charAt(0 + i * 3) = s.charAt(0 + i * 4)
//s.charAt(1 + i * 0) = s.charAt(1 + i * 1) = s.charAt(1 + i * 2) = s.charAt(1 + i * 3) = s.charAt(0 + i * 4)
//s.charAt(2 + i * 0) = s.charAt(2 + i * 1) = s.charAt(2 + i * 2) = s.charAt(2 + i * 3) = s.charAt(0 + i * 4)
//s.charAt((j - 1) + i * 0) = s.charAt((j - 1) + i * 1) = s.charAt((j - 1) + i * 2) = s.charAt((j - 1) + i * 3) = s.charAt((j - 1) + i * 4)


//0 1 2 -> 1
//0 1 2 3 -> 2
//0 1 2 3 4 -> 2
//0 1 2 3 4 5 -> 3