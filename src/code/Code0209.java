package code;

/**
 * @Author czgggggggg
 * @Date 2022/2/2
 * @Description
 */
public class Code0209 {
    public static void main(String[] args) {
        int target1 = 7;
        int[] sum1 = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(target1,sum1));
        //2

        int target2 = 4;
        int[] sum2 = {1,4,4};
        System.out.println(minSubArrayLen(target2,sum2));
        //1

        int target3 = 11;
        int[] sum3 = {1,1,1,1,1,1,1,1};
        System.out.println(minSubArrayLen(target3,sum3));
        //0

        int target4 = 1;
        int[] sum4 = {1};
        System.out.println(minSubArrayLen(target4,sum4));
        //1
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int i, j;
        int sum = 0;
        int n = nums.length;
        int count = 0;
        int min = Integer.MAX_VALUE;

        j = 0;
        for(i = 0; i < n ; i++){
            for(; j < n; j++){
                sum += nums[j];
                count++;
                if(sum >= target){
                    min = Math.min(min, count);

                    sum -= nums[i];
                    sum -= nums[j];//因为下一轮还要执行一次sum += nums[j];
                    count -= 2;
                    break;
                }
            }
        }

        if(min == Integer.MAX_VALUE)
            return 0;
        return min;
    }
}
//思路图：
//[_,_,_,_,_,_,_,_,_,_]
// _
// _ _
// _ _ _
// _ _ _ _
//   _ _ _
//   _ _ _ _
//   _ _ _ _ _
//     _ _ _ _
//     _ _ _ _ _





