package string;

/**
 * @Author czgggggggg
 * @Date 2021/9/14
 * @Description
 */
public class String1816 {
    public static void main(String[] args) {
        System.out.println(truncateSentence("Hello how are you Contestant",4));
        System.out.println(truncateSentence("What is the solution to this problem",4));
        System.out.println(truncateSentence("chopper is not a tanuki",5));

        System.out.println(truncateSentence("a",1));
        System.out.println(truncateSentence("a bc def g",1));
        System.out.println(truncateSentence("a bc def g",2));
        System.out.println(truncateSentence("a bc def g",3));
        System.out.println(truncateSentence("a bc def g",4));
    }
    public static String truncateSentence(String s, int k) {
        String result = "";

        char ch;
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            ch = s.charAt(i);
            if(ch != ' ')
                result += ch;
            else{
                count++;
                if(k > count){
                    result += ' ';
                }else{
                    break;
                }
            }
        }

        return result;
    }
}
