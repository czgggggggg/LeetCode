package code;

/**
 * @Author czgggggggg
 * @Date 2022/1/3
 * @Description
 */
public class Code1342 {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
        System.out.println(numberOfSteps(8));
        System.out.println(numberOfSteps(123));

        System.out.println(numberOfSteps(0));
    }
    public static int numberOfSteps(int num) {
        int ans = 0;
        while(num != 0){
            if(num % 2 == 0){
                num /= 2;
            }else{
                num -= 1;
            }
            ans++;
        }
        return ans;
    }
}
