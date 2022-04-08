package code;

/**
 * @Author czgggggggg
 * @Date 2022/4/8
 * @Description
 */
public class Code0287 {
    public static void main(String[] args) {
        int[] nums1 = {1,3,4,2,2};
        System.out.println(findDuplicate(nums1));//2
        int[] nums2 = {3,1,3,4,2};
        System.out.println(findDuplicate(nums2));//3
        int[] nums3 = {3,1,5,6,3,4,2,7,8};
        System.out.println(findDuplicate(nums3));//3
        int[] nums4 = {3,3,4,2,1};
        System.out.println(findDuplicate(nums4));//3
        int[] nums5 = {4,2,1,3,3};
        System.out.println(findDuplicate(nums5));//3
    }
    public static int findDuplicate(int[] nums) {
        int n = nums.length;
        int i;
        int tmp, old_tmp;
        for(i = 0; i < n; i++){
            if(nums[i] == i + 1)
                continue;
            else{
                tmp = nums[i];
                nums[i] = -1;
                while(true){
                    if(tmp == nums[tmp - 1]){
                        return tmp;
                    }
                    if(nums[tmp - 1] == -1){
                        nums[tmp - 1] = tmp;
                        break;
                    }
                    old_tmp = tmp;
                    tmp = nums[tmp - 1];
                    if(tmp == old_tmp){
                        break;
                    }
                    nums[old_tmp - 1] = old_tmp;
                }
            }
        }

        return -1;
    }
}
