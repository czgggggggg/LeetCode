package code;

/**
 * @Author czgggggggg
 * @Date 2022/2/20
 * @Description
 */
public class Code0034 {
    public static void main(String[] args) {
        int[] nums1 = {5,7,7,8,8,10};
        int[] res1 = searchRange(nums1, 8);
        System.out.println("[" + res1[0] + "," + res1[1] + "]");//[3,4]

        int[] nums2 = {5,7,7,8,8,10};
        int[] res2 = searchRange(nums2, 6);
        System.out.println("[" + res2[0] + "," + res2[1] + "]");//[-1,-1]

        int[] nums3 = {};
        int[] res3 = searchRange(nums3, 0);
        System.out.println("[" + res3[0] + "," + res3[1] + "]");//[-1,-1]

        int[] nums4 = {1};
        int[] res4 = searchRange(nums4, 1);
        System.out.println("[" + res4[0] + "," + res4[1] + "]");//[0,0]
    }

    public static int[] searchRange(int[] nums, int target){
        int[] res = new int[2];
        int n = nums.length;

        int index = BinarySearch(nums,target);
        if(index == -1){
            res[0] = -1;
            res[1] = -1;
            return res;
        }else{
            res[0] = index;
            res[1] = index;
            while(res[0] > -1){
                if(nums[res[0]] == target)
                    res[0]--;
                else
                    break;
            }
            while(res[1] < n){
                if(nums[res[1]] == target)
                    res[1]++;
                else
                    break;
            }
            res[0]++;
            res[1]--;
        }

        return res;
    }

    //普通折半查找
    public static int BinarySearch(int[] nums, int tartget){
        int n = nums.length;
        return BinarySearch(nums,tartget,0,n - 1);
    }
    public static int BinarySearch(int[] nums, int target, int low, int high){
        if(low > high)
            return -1;

        int mid = (low + high) / 2;
        if(target == nums[mid])
            return mid;
        else if(target < nums[mid])
            return BinarySearch(nums,target,0,mid - 1);
        else
            return BinarySearch(nums,target,mid + 1, high);
    }
//    //普通折半查找
//    public static boolean BinarySearch(int[] nums, int tartget){
//        int n = nums.length;
//        return BinarySearch(nums,tartget,0,n - 1);
//    }
//    public static boolean BinarySearch(int[] nums, int target, int low, int high){
//        if(low > high)
//            return false;
//
//        int mid = (low + high) / 2;
//        if(target == nums[mid])
//            return true;
//        else if(target < nums[mid])
//            return BinarySearch(nums,target,0,mid - 1);
//        else
//            return BinarySearch(nums,target,mid + 1, high);
//    }
}
