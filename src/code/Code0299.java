package code;

/**
 * @Author czgggggggg
 * @Date 2022/2/18
 * @Description
 */
public class Code0299 {
    public static void main(String[] args) {
        System.out.println(getHint("1807","7810"));
        System.out.println(getHint("1123","0111"));
    }
    public static String getHint(String secret, String guess) {
        int[] nums = new int[10];
        int countA = 0, countB = 0;
        for (int i = 0; i < secret.length(); i++) {
            if(secret.charAt(i) == guess.charAt(i)) countA++;
            else{
                if (nums[guess.charAt(i) - '0']-- > 0) countB++;
                if(nums[secret.charAt(i) - '0']++ < 0) countB++;
            }
        }
        return countA + "A" + countB + "B";
    }
}
