package string;

/**
 * @Author czgggggggg
 * @Date 2021/9/7
 * @Description
 */
public class String0884 {
    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab#c","ad#c"));//true
        System.out.println(backspaceCompare("ab##","c#d#"));//true
        System.out.println(backspaceCompare("a##c","#a#c"));//true
        System.out.println(backspaceCompare("a#c","b"));//false

        System.out.println(backspaceCompare("a","a#####b"));//false
        System.out.println(backspaceCompare("a","a#####a"));//true
    }
    public static boolean backspaceCompare(String s, String t) {
        String newS = newString(s);
        String newT = newString(t);
        if(newS.equals(newT))
            return true;
        else
            return false;
    }

    public static String newString(String s){
        char[] chars = s.toCharArray();
        int index = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if (ch == '#') {
                if(index > 0){//index == 0 则不做处理
                    index--;
                }
            }else{
                chars[index] = ch;
                index++;
            }
        }
        String newS = "";
        for(int i = 0; i < index; i++){
            newS += chars[i];
        }

        return newS;
    }
}
