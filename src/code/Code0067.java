package code;

/**
 * @Author czgggggggg
 * @Date 2022/2/22
 * @Description
 */
public class Code0067 {
    public static void main(String[] args) {
        System.out.println(addBinary("11","1"));//100
        System.out.println(addBinary("1010","1011"));//10101
        System.out.println(addBinary("1111","1111"));//11110
        System.out.println(addBinary("0","0"));//0
    }
    public static String addBinary(String a, String b) {
        char ch1, ch2;
        int jinwei = 0;//进位1，不进位0
        StringBuilder sb = new StringBuilder();

        int index1 = a.length() - 1;
        int index2 = b.length() - 1;

        while(index1 >= 0 || index2 >= 0){
            if(index1 < 0){
                ch1 = '0';
                ch2 = b.charAt(index2);
            }else if(index2 < 0){
                ch1 = a.charAt(index1);
                ch2 = '0';
            }else{
                ch1 = a.charAt(index1);
                ch2 = b.charAt(index2);
            }
            if(ch1 == '0' && ch2 == '0'){
                if(jinwei == 0){
                    sb.append('0');
                }else{//jinwei == 1
                    sb.append('1');
                    jinwei = 0;
                }
            }else if((ch1 == '0' && ch2 == '1') || (ch1 == '1' && ch2 == '0')){
                if(jinwei == 0){
                    sb.append('1');
                }else{
                    sb.append('0');
                }
            }else{//ch1 == '1' && ch2 == '1'
                if(jinwei == 0){
                    sb.append('0');
                    jinwei = 1;
                }else{
                    sb.append('1');
                }
            }
            index1--;
            index2--;
        }
        if(jinwei == 1)
            sb.append('1');

        return sb.reverse().toString();
    }
}
