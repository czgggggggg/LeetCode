package array;

/**
 * @Author czgggggggg
 * @Date 2021/8/19
 * @Description
 */
public class Array35 {
    public static void main(String[] args) {
        int[] nums1 = {1,3,5,6};
        int target1 = 5;
        int[] nums2 = {1,3,5,6};
        int target2 = 2;
        int[] nums3 = {1,3,5,6};
        int target3 = 7;
        int[] nums4 = {1,3,5,6};
        int target4 = 0;
        int[] nums5 = {1};
        int target5 = 0;
        int[] nums6 = {1};//第一次提交没有通过的样例
        int target6 = 1;
        int[] nums7 = {1,3};//第二次提交没有通过的样例
        int target7 = 0;
        System.out.println(searchInsert(nums1, target1));
        System.out.println(searchInsert(nums2, target2));
        System.out.println(searchInsert(nums3, target3));
        System.out.println(searchInsert(nums4, target4));
        System.out.println(searchInsert(nums5, target5));
        System.out.println(searchInsert(nums6, target6));
        System.out.println(searchInsert(nums7, target7));
    }
    public static int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        if(nums.length == 1 && nums[0] == target)//第一次提交没有注意到的地方
            return 0;
        while(low <= high){//第二次提交错误的地方，判断条件low!=high改为low<=high
            mid = (low + high) / 2;
            if(nums[mid] == target)
                return mid;
            if(nums[mid] > target)
                high = mid - 1;
            if(nums[mid] < target)
                low = mid + 1;
        }
        //此时low>high，并且数组中依然没有找到target（存在不存在此时能否判定？）
        //第三次提交还是错误，下面的分类比较迷。//理解的还不透彻。
        int result = -1;
        if(low < 0){
            result = low + 1;
        }
        else if(low == 0){
            if(nums[low] > target)
                result = 0;
            else if(nums[low] == target)
                result = low;
            else
                result = low + 1;
        }
        else if(low > 0 && low <= nums.length - 1){
            if(nums[low - 1] < target && nums[low] > target)
                result = low;
        }
        else//low > nums.length - 1
            result = low;
        return result;
    }
}
//思路：采用二分查找