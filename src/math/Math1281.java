package math;

/**
 * @Author czgggggggg
 * @Date 2021/9/22
 * @Description
 */
public class Math1281 {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
        System.out.println(subtractProductAndSum(4421));
        System.out.println(subtractProductAndSum(1));
        System.out.println(subtractProductAndSum(100000));
    }
    public static int subtractProductAndSum(int n) {
        int multiNum = 1;
        int addNum = 0;

        int tmp;
        while(n != 0){
            tmp = n % 10;
            multiNum *= tmp;
            addNum += tmp;
            n /= 10;
        }

        return multiNum - addNum;
    }
}
