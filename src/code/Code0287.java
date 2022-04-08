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

    //v0.2
    //官方题解：对nums数组建图，每个位置 i 连一条 i -> nums[i] 的边。从而将问题转换为求解图中环的入口点问题。
    public static int findDuplicate(int[] nums) {
        int slow = 0, fast = 0;
        do{
            slow = nums[slow];//慢指针走一步
            fast = nums[nums[fast]];//快指针走两步
        }while(slow != fast);
        //此时到达第一次的相遇点
        slow = 0;
        while(slow != fast){
            slow = nums[slow];//慢指针走一步
            fast = nums[fast];//快指针走一步
        }
        return slow;//此时到达第二次的相遇点，也就是环的入口点，其数组索引位置就是重复数字，因为数组中有两个位置指向当前位置。
    }

    //v0.1
//    public static int findDuplicate(int[] nums) {
//        int n = nums.length;
//        int i;
//        int tmp, old_tmp;
//        for(i = 0; i < n; i++){
//            if(nums[i] == i + 1)
//                continue;
//            else{
//                tmp = nums[i];
//                nums[i] = -1;
//                while(true){
//                    if(tmp == nums[tmp - 1]){
//                        return tmp;
//                    }
//                    if(nums[tmp - 1] == -1){
//                        nums[tmp - 1] = tmp;
//                        break;
//                    }
//                    old_tmp = tmp;
//                    tmp = nums[tmp - 1];
//                    if(tmp == old_tmp){
//                        break;
//                    }
//                    nums[old_tmp - 1] = old_tmp;
//                }
//            }
//        }
//
//        return -1;
//    }
}
