package math;

/**
 * @Author czgggggggg
 * @Date 2021/9/22
 * @Description
 */
public class Math0868 {
    public static void main(String[] args) {
        System.out.println(binaryGap(22));
        System.out.println(binaryGap(5));
        System.out.println(binaryGap(6));
        System.out.println(binaryGap(8));
        System.out.println(binaryGap(1));

        System.out.println(binaryGap(9));//1001
        System.out.println(binaryGap(8));//1000
        System.out.println(binaryGap(17));//10001
        System.out.println(binaryGap(16));//10000
        System.out.println(binaryGap(19));//10011
    }
    public static int binaryGap(int n) {
        int result = 0;
        int tmp1 = 0;
        int tmp2 = 0;
        boolean isFirst = true;

        int r;
        while(n != 0){
            r = n % 2;
            if(r == 0){
                tmp2++;
            }else if(r == 1){
                tmp2++;
                if(isFirst){
                    isFirst = false;
                }else{
                    result = Math.max(result,tmp2 - tmp1);
                }
                tmp1 = tmp2;
            }
            n /= 2;
        }

        return result;
    }
}
