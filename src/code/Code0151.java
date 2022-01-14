package code;

/**
 * @Author czgggggggg
 * @Date 2022/1/14
 * @Description
 */
public class Code0151 {
    public static void main(String[] args) {
        String str1 = "the sky is blue";
        System.out.println(reverseWords(str1));//blue is sky the
        String str2 = "  hello world  ";
        System.out.println(reverseWords(str2));//world hello
        String str3 = "a good   example";
        System.out.println(reverseWords(str3));//example good a
        String str4 = "  Bob    Loves  Alice   ";
        System.out.println(reverseWords(str4));//Alice Loves Bob
        String str5 = "Alice does not even like bob";
        System.out.println(reverseWords(str5));//bob like even not does Alice

//        String str6 = " ";//无效的例子
//        System.out.println(reverseWords(str6));//
        String str7 = "a";
        System.out.println(reverseWords(str7));//a
    }
    public static String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length;

        int slow, fast;
        for(slow = 1, fast = 1; fast < n; fast++){
            while(fast < n){
                if(chars[fast] != ' ' || (chars[fast] == ' ' && chars[fast - 1] != ' ')){
                    chars[slow] = chars[fast];
                    slow++;
                }
                fast++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < slow; i++)
            sb.append(chars[i]);
        String str = sb.toString();

        sb = new StringBuilder();
        String[] splits = (String[]) str.split(" ");
        for(int i = splits.length - 1; i >= 0; i--){
            sb.append(splits[i] + " ");
        }
        String res = sb.toString().trim();

        return res;
    }
}
