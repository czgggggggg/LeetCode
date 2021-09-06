package string;

/**
 * @Author czgggggggg
 * @Date 2021/9/6
 * @Description
 */
public class String0434 {
    public static void main(String[] args) {
        System.out.println(countSegments("Hello, my name is John"));//5
        System.out.println(countSegments("Hello,my name is John"));//4
        System.out.println(countSegments("       Hello, my name is John     "));//5
        System.out.println(countSegments(",./.   Hello, my name is John    /"));//7
        System.out.println(countSegments(""));//0
        System.out.println(countSegments(" "));//0
        System.out.println(countSegments("a"));//1
    }
    public static int countSegments(String s) {
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != ' '){
                if(i == 0)
                    sum++;
                else{
                    if(s.charAt(i - 1) == ' '){
                        sum++;
                    }
                }
            }
        }

        return sum;
    }
}
