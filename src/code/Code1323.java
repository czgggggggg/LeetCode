package code;

/**
 * @Author czgggggggg
 * @Date 2022/1/9
 * @Description
 */
public class Code1323 {
    public static void main(String[] args) {
        System.out.println(maximum69Number(9669));//9969
        System.out.println(maximum69Number(9996));//9999
        System.out.println(maximum69Number(9999));//9999
        System.out.println();
        System.out.println(maximum69Number(6699));//9699
        System.out.println(maximum69Number(69));//99
        System.out.println(maximum69Number(6));//9
    }
    public static int maximum69Number (int num) {
        int r = 1;
//        int count = 0;
        int tmp = num;

        while(tmp != 0){
            tmp /= 10;
            r *= 10;
//            count++;
        }//num一共count位

        r /= 10;//num 4位 -> r = 1000

        int k;
        int dif = 0;
        tmp = num;
        while(r != 0){
            k = tmp / r;
            tmp -= k * r;
            if(k == 6){
                dif = 3 * r;
                break;
            }
            r /= 10;
        }

        num += dif;

        return num;
    }
}
