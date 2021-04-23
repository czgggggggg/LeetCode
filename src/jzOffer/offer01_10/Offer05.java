package jzOffer.offer01_10;

/**
* @Author czgggggggg
* @Date 2021/1/17
* @Description 替换空格
*/
public class Offer05 {
    public static void main(String[] args) {
        String s = "We are happy.";
        System.out.println(replaceSpace(s));
    }
    public static String replaceSpace(String s) {
        int length = s.length();
        String str = new String();
        for(int i = 0; i < length; i++){
            if(s.charAt(i) == ' '){
                str += "%20";
            }
            else{
                str += s.charAt(i);
            }
        }
        return str;
    }
}
