package code;

/**
 * @Author czgggggggg
 * @Date 2022/3/23
 * @Description 2022/8/13再做
 */
public class Code0396 {
    public static void main(String[] args) {
        System.out.println(maxRotateFunction(new int[]{4,3,2,6}));
        System.out.println(maxRotateFunction(new int[]{100}));
    }
    public static int maxRotateFunction(int[] nums) {
        int n = nums.length;
        if(n == 1){
            return 0;
        }
        int[] diff = new int[n];
        for(int i = 0; i < n - 1; i++){
            diff[i] = nums[i] - nums[i + 1];
        }
        diff[n - 1] = nums[n - 1] - nums[0];

        //计算F(0)
        int max = 0;
        int f = 0;
        for(int i = 0; i < n; i++){
            f += i * nums[i];
            max = f;
        }
//        System.out.println("f: " + f);

        //v0.1
//        for (int i = 1; i < n; i++){
//            int tmp = i;
//            for (int j = 0; j < n; j++){
//                f += (diff[j] * tmp);
//                tmp++;
//                tmp %= n;
//            }
//            max = Math.max(f, max);
////            System.out.println("f: " + f);
//        }

        //v0.2
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += nums[i];
        }
        for(int k = 1; k < n; k++){
            f = f + sum - n * nums[n - k];
//            System.out.println("f: " + f);
            max = Math.max(f, max);
        }

        return max;
    }
}
//nums = [4,3,2,6]