package math;

/**
 * @Author czgggggggg
 * @Date 2021/9/17
 * @Description
 */
public class Math0292 {
    public static void main(String[] args) {
        System.out.println(canWinNim(4));
        System.out.println(canWinNim(1));
        System.out.println(canWinNim(2));
    }
    public static boolean canWinNim(int n) {
        if(n % 4 == 0)
            return false;
        return true;
    }
}
//1 2 3   true
//4 (123)(321)   false
//5 (123)()   走1，谁先到4谁输
//
//123 true
//4 + 123 -> 567 true
//8 - 123 -> 765 8false
//8 + 123 -> 9/10/11 true
//12 - 123 -> 11/10/9 false




