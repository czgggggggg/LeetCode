package code;

/**
 * @Author czgggggggg
 * @Date 2022/2/2
 * @Description
 */
public class Code1732 {
    public static void main(String[] args) {
        int[] gain1 = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain1));
        //1
        int[] gain2 = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(gain2));
        //0
        int[] gain3 = {-100};
        System.out.println(largestAltitude(gain3));
        //0
        int[] gain4 = {100};
        System.out.println(largestAltitude(gain4));
        //100
    }
    public static int largestAltitude(int[] gain) {
        int n = gain.length;
        int max = Math.max(0,gain[0]);

        for(int i = 1; i < n; i++){
            gain[i] += gain[i - 1];
            max = Math.max(max,gain[i]);
        }

        return max;
    }
}
