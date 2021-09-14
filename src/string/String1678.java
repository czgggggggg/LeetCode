package string;

/**
 * @Author czgggggggg
 * @Date 2021/9/14
 * @Description
 */
public class String1678 {
    public static void main(String[] args) {
        System.out.println(interpret("G()(al)"));
        System.out.println(interpret("G()()()()(al)"));
        System.out.println(interpret("(al)G(al)()()G"));
    }
    public static String interpret(String command) {
        String result = "";
        char ch;
        for(int i = 0; i < command.length(); i++){
            ch = command.charAt(i);
            if(ch == 'G')
                result += ch;
            else if(ch == '('){
                if(command.charAt(i + 1) == 'a'){
                    result += "al";
                    i += 3;
                }else{
                    result += 'o';
                    i++;
                }
            }
        }

        return result;
    }
}
