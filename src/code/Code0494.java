package code;

/**
 * @Author czgggggggg
 * @Date 2022/2/21
 * @Description
 */
public class Code0494 {
    public static void main(String[] args) {
//        int[] nums = {1,1,1,1,1};
//        int target = 3;
//        System.out.println(findTargetSumWays(nums,target));
        //5

        int[] nums = {1};
        int target = 1;
        System.out.println(findTargetSumWays(nums,target));
        //1
    }
    public static int findTargetSumWays(int[] nums, int target) {
        int res = 0;
        int sum = 0;
        int preIndex = -1;
        int n = nums.length;

        res = dfs(res,sum,preIndex,n,nums,target);

        return res;
    }

    public static int dfs(int res, int sum, int preIndex, int n, int[] nums, int target) {
        if(preIndex == n - 1){
            if(sum == target)
                res++;
            return res;
        }

        for(int i = 0; i <= 1; i++){
            if(i == 0){
                sum = sum - nums[preIndex + 1];
                preIndex++;
                res = dfs(res,sum,preIndex,n,nums,target);
                preIndex--;
                sum = sum + nums[preIndex + 1];
            }else{//i == 1
                sum = sum + nums[preIndex + 1];
                preIndex++;
                res = dfs(res,sum,preIndex,n,nums,target);
                preIndex--;
                sum = sum - nums[preIndex + 1];
            }
        }

        return res;
    }
}
