package test;

/**
 * @Author czgggggggg
 * @Date 2021/9/11
 * @Description
 */
public class TestTime {
    public static void main(String[] args) {
        printChars(0,27, 181);//时间
        printChars(1,198, 600);//leetcode
        printChars(2,3, 14);//JavaEE
        printChars(3,0, 20);//SSM框架
        printChars(4,59, 302);//《黑马---并发》
        printChars(5,83,184);//《黑马---JVM》
        printChars(6,196, 388);//《Redis设计与实现》
        printChars(7,45, 436);//《Java虚拟机实战》
    }
//    public static char[] timeGoing(int x, int y){
//        char[] chars = new char[102];
//        chars[0] = '[';
//        chars[101] = ']';
//        for(int i = 1; i <= 100; i++){
//            if(i <= 100*x/y)
//                chars[i] = '*';
//            else
//                chars[i] = '-';
//        }
//
//        return chars;
//    }
    public static void printChars(int tag, int x, int y){
        switch(tag){
            case 0:
                System.out.printf("//时间                         %03d/%03d    ",x,y);
                break;
            case 1:
                System.out.printf("leetcode                     %03d/%03d    ",x,y);
                break;
            case 2:
                System.out.printf("JavaEE                        %03d/%03d    ",x,y);
                break;
            case 3:
                System.out.printf("SSM框架                     %03d/%03d    ",x,y);
                break;
            case 4:
                System.out.printf("《黑马---并发》          %03d/%03d    ",x,y);
                break;
            case 5:
                System.out.printf("《黑马---JVM》          %03d/%03d    ",x,y);
                break;
            case 6:
                System.out.printf("《Redis设计与实现》   %03d/%03d    ",x,y);
                break;
            case 7:
                System.out.print("《Java虚拟机实战》     036/436    ");
                break;
        }


        char[] chars = new char[102];
        chars[0] = '[';
        chars[101] = ']';
        for(int i = 1; i <= 100; i++){
            if(i <= 100*x/y)
                chars[i] = '*';
            else
                chars[i] = '-';
        }
        for(int i = 0; i < chars.length; i++)
            System.out.print(chars[i]);
        System.out.println();
    }
}