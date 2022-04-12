package code;

/**
 * @Author czgggggggg
 * @Date 2022/4/12
 * @Description
 */
public class Code0581 {
    public static void main(String[] args) {
        int[] nums1 = {2,6,4,8,10,9,15};
        System.out.println(findUnsortedSubarray(nums1));//5
        int[] nums2 = {1,2,3,4};
        System.out.println(findUnsortedSubarray(nums2));//0
        int[] nums3 = {1};
        System.out.println(findUnsortedSubarray(nums3));//0

        int[] nums4 = {1,2,3,4,5,6,7};
        System.out.println(findUnsortedSubarray(nums4));//0
        int[] nums5 = {2,1,3,4,5,7,6};
        System.out.println(findUnsortedSubarray(nums5));//7
        int[] nums6 = {1,3,4,3,6,5,6};
        System.out.println(findUnsortedSubarray(nums6));//4
        //1,3,5,4,2
        int[] nums7 = {1,3,5,4,2};
        System.out.println(findUnsortedSubarray(nums7));//4
        int[] nums8 = {1,1,1,7,8,9,6,5,4,1,1,1,2,3};
        System.out.println(findUnsortedSubarray(nums8));//11
        int[] nums9 = {1,1,1,1,7,8,9,6,5,4,1,1,1,2,3};
        System.out.println(findUnsortedSubarray(nums9));//11
        int[] nums10 = {1,1,1,7,8,9,6,5,4,1,1,1,1,2,3};
        System.out.println(findUnsortedSubarray(nums10));//12
    }

    //v0.2
    public static int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        if(n == 1)
            return 0;

        //找出无序子数组的左右边界
        int l = -1, r = n;
        for(int i = 1; i < n; i++){
            if(nums[i - 1] > nums[i]){
                l = i - 1;//无序子数组的左边界
                break;
            }
        }
        for(int i = n - 1; i >= 1; i--){
            if(nums[i - 1] > nums[i]){
                r = i;//无序子数组的右边界
                break;
            }
        }

        if(l == -1){//r一定为n
            return 0;
        }else{
            //找出无序子数组中的最小值和最大值
            int min = nums[l];
            int max = nums[r];
            for(int i = l; i <= r; i++){
                min = Math.min(min, nums[i]);
                max = Math.max(max, nums[i]);
            }
            //找到无序子数组中的最小值和最大值在数组全部排序的情况下的位置（要考虑重复元素的可能）
            l--;
            while(l >= 0){
                if(min >= nums[l]){
                    break;
                }
                l--;
            }
            l++;
            r++;
            while(r < n){
                if(max <= nums[r]){
                    break;
                }
                r++;
            }
            r--;
            return r - l + 1;
        }
    }

    //v0.1 过了71%的样例
//    public static int findUnsortedSubarray(int[] nums) {
//        int n = nums.length;
//        if(n == 1)
//            return 0;
//
//        int l = -1, r = n;
//        for(int i = 1; i < n; i++){
//            if(nums[i - 1] > nums[i]){
//                l = i;
//                break;
//            }
//        }
//        for(int i = n - 1; i >= 1; i--){
//            if(nums[i - 1] > nums[i]){
//                r = i - 1;
//                break;
//            }
//        }
//
//        if(l == -1){//r一定为n
//            return 0;
//        }else{
//            int res1 = 0, res2 = 0;//初始值为0没有实际意义
//            for(int i = 0; i < n; i++){
//                if(nums[l] < nums[i]){
//                    res1 = i;
//                    break;
//                }
//            }
//            for(int i = n - 1; i >= 0; i--){
//                if(nums[i] < nums[r]){
//                    res2 = i;
//                    break;
//                }
//            }
//            return res2 - res1 + 1;
//        }
//    }
}


//18min
//通过测试用例：
//218 / 307
//输入：
//[1,3,5,4,2]
//输出：
//3
//预期结果：
//4