package keep;

/**
 * @Author czgggggggg
 * @Date 2022/4/21
 * @Description
 */
public class Code0004 {
    public static void main(String[] args) {
        System.out.println(strToInt("-101"));//-101
        System.out.println(strToInt("101"));//101
        System.out.println(strToInt("0"));//0
        System.out.println(strToInt("4321"));//4321
    }
    public static int strToInt(String str){
        boolean tag = true;//符号位，默认为正数

        int i = 0;
        if(str.charAt(i) == '-'){
            tag = false;
            i++;
        }

        int num = 0;
        int n = str.length();
        for(; i < n; i++){
            num = (num * 10 + (str.charAt(i) - '0'));
        }

        if(tag)
            return num;
        else
            return num * (-1);
    }
}
