package math.math01_10;

/**
 * @Author czgggggggg
 * @Date 2021/6/25
 * @Description 9. 回文数
 */
public class Math03 {
    public static void main(String[] args) {
//        int x = 12321;//true
//        int x = -12321;//false
//        int x = 0;//true
//        int x = 123211;//false
//        int x = (int) Math.pow(2,31) - 1;//2147483646不是回文数
        int x = -(int) Math.pow(2,31);//-2147483647不是回文数
        if(isPalindrome(x)){
            System.out.println(x + "是回文数。");
        }else{
            System.out.println(x + "不是回文数");
        }
    }

    public static boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        int tmp = x;
        int count = 0;
        while(x != 0){
            x /= 10;
            count++;
        }

        int[] arr = new int[count];
        x = tmp;
        count = 0;
        while(x != 0){
            arr[count] = x % 10;
            x /= 10;
            count++;
        }

        for(int i = 0; i < count / 2; i++){
            if(arr[i] != arr[arr.length - i - 1])
                return false;
        }
        return true;
    }
}
