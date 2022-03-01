package competition;

/**
 * @Author czgggggggg
 * @Date 2022/3/1
 * @Description
 */
public class Code281_1 {
    public static void main(String[] args) {
        System.out.println(countEven(4));//2
        System.out.println(countEven(30));//14
        System.out.println(countEven(1));//0
        System.out.println(countEven(1000));//499
    }
    public static int countEven(int num) {
        int count = 0;
        for(int i = 1; i <= num; i++){
            if(isEven(i))
                count++;
        }
        return count;
    }
    public static boolean isEven(int num){
        int res = 0;
        while(num != 0){
            res += (num % 10);
            num /= 10;
        }
        if(res % 2 != 0)
            return false;
        return true;
    }
}
//90.77%、99.83%