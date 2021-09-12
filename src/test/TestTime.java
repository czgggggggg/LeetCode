package test;

/**
 * @Author czgggggggg
 * @Date 2021/9/11
 * @Description
 */
public class TestTime {
    public static void main(String[] args) {
//        char[] chars = timeGoing(126, 600);
//        char[] chars = timeGoing(11, 181);
//        char[] chars = timeGoing(59, 302);
        char[] chars = timeGoing(55, 184);
//        char[] chars = timeGoing(196, 388);
//        char[] chars = timeGoing(36,436);
//        char[] chars = timeGoing(3, 14);
//        char[] chars = timeGoing(0, 20);
        for(int i = 0; i < chars.length; i++)
            System.out.print(chars[i]);
        System.out.println();
//        System.out.println(30+31+30+31+31+28);
    }
    public static char[] timeGoing(int x, int y){
        char[] chars = new char[102];
        chars[0] = '[';
        chars[101] = ']';
        for(int i = 1; i <= 100; i++){
            if(i <= 100*x/y)
                chars[i] = '*';
            else
                chars[i] = '-';
        }

        return chars;
    }
}
