package string;

/**
 * @Author czgggggggg
 * @Date 2021/9/8
 * @Description
 */
public class String1108 {
    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
        System.out.println(defangIPaddr("255.100.50.0"));
    }
    public static String defangIPaddr(String address) {
        String newStr = "";
        for(int i = 0; i < address.length() ;i++){
            if(address.charAt(i) == '.')
                newStr += "[.]";
            else
                newStr += address.charAt(i);
        }
        return newStr;
    }
}
