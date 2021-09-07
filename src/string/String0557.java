package string;

/**
 * @Author czgggggggg
 * @Date 2021/9/7
 * @Description
 */
public class String0557 {
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));//s'teL ekat edoCteeL tsetnoc
        System.out.println(reverseWords(" 123 123 123 "));// 321 321 321
        System.out.println(reverseWords("123 123 123  "));//321 321 321
        System.out.println(reverseWords("  123 123 123"));//  321 321 321
        System.out.println(reverseWords("12345"));//54321
    }
    public static String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int start = -1;
        int end = -1;
        char tmp;
        int count;

        for(int i = 0; i < chars.length; i++){
            if(chars[i] != ' '){
                if(i == 0)
                    start = i;
                else if(i != 0 && chars[i - 1] == ' ')
                    start = i;
                if(i == chars.length - 1){
                    end = i;
                }
                else if(i != chars.length - 1 && chars[i + 1] == ' ')
                    end = i;
            }
            if(chars[i] == ' ' || (chars[i] != ' ' && i == chars.length - 1)){// ||后面的情况不要忽略
                if(start != -1 && end != -1){
                    count = ((end - start) + 1) / 2;//1->0 2->1 3->1 4->2 //count：交换次数
                    for(int k = 0; k < count; k++){
//                        System.out.println("test4");
                        tmp = chars[start + k];
                        chars[start + k] = chars[end - k];
                        chars[end - k] = tmp;
                    }
                }
                //重置操作
                start = -1;
                end = -1;
            }
        }

        String result = "";
        for(int i = 0; i < chars.length; i++){
            result += chars[i];
        }

        return result;
    }
}
//s'teL ekat edoCteeL tsetnoc
//s'teL ekat edoCteeL tsetnoc