package code;

/**
 * @Author czgggggggg
 * @Date 2022/3/11
 * @Description
 */
public class Code0376 {
    public static void main(String[] args) {
        int[] nums1 = {1,7,4,9,2,5};
        System.out.println(wiggleMaxLength(nums1));//6
        int[] nums2 = {1,17,5,10,13,15,10,5,16,8};
        System.out.println(wiggleMaxLength(nums2));//7
        int[] nums3 = {1,2,3,4,5,6,7,8,9};
        System.out.println(wiggleMaxLength(nums3));//2
        int[] nums4 = {1};
        System.out.println(wiggleMaxLength(nums4));//1
        int[] nums5 = {1,2};
        System.out.println(wiggleMaxLength(nums5));//2
        int[] nums6 = {1,1};
        System.out.println(wiggleMaxLength(nums6));//1
        int[] nums7 = {1,1,1};
        System.out.println(wiggleMaxLength(nums7));//1
        int[] nums8 = {1,1,2,1,1};
        System.out.println(wiggleMaxLength(nums8));//3
        int[] nums9 = {1,1,1,1,2};
        System.out.println(wiggleMaxLength(nums9));//2
        int[] nums10 = {1,2,1};
        System.out.println(wiggleMaxLength(nums10));//3
    }

    //v0.2
    public static int wiggleMaxLength(int[] nums) {
        int n = nums.length;
        if(n == 1)
            return 1;
        if(n == 2){
            if(nums[0] != nums[1])
                return 2;
            else
                return 1;
        }

        //-------------------------//

        int tag = 1;
        int startNum = nums[0];
        int curNum = nums[0];
        int count = 1;
        for(int i = 1; i < n; i++){
            if(tag == 1){//向上
                if(nums[i - 1] <= nums[i]){
                    if(i == n - 1){
                        curNum = nums[i];
                        if(curNum > startNum){
                            count++;
                            break;
                        }
                    }else{
                        curNum = nums[i];
                    }
                }
                else{
                    if(curNum > startNum)
                        count++;
                    //curNum == startNum 则count不变
                    tag = -1;
                    startNum = nums[i - 1];
                    curNum = nums[i];
                    if(i == n - 1){
                        count++;
                    }
                }
            }else{//tag == -1 向下
                if(nums[i - 1] >= nums[i]){
                    if(i == n - 1){
                        curNum = nums[i];
                        if(curNum < startNum){
                            count++;
                            break;
                        }
                    }else{
                        curNum = nums[i];
                    }
                }
                else{
                    if(curNum < startNum)
                        count++;
                    tag = 1;
                    startNum = nums[i - 1];
                    curNum = nums[i];
                    if(i == n - 1){
                        count++;
                    }
                }
            }
        }

        return count;
    }

    //v0.1
//    public static int wiggleMaxLength(int[] nums) {
//        int n = nums.length;
//        if(n == 1)
//            return 1;
//        if(n == 2){
//            if(nums[0] != nums[1])
//                return 2;
//            else
//                return 1;
//        }
//
//        int count = 0;
//        for(int i = 2; i < n; i++){
//            if((nums[i - 2] < nums[i - 1] && nums[i - 1] > nums[i])
//                    ||(nums[i - 2] > nums[i - 1] && nums[i - 1] < nums[i])){
//                count++;
//            }
//        }
//
//        //还要做怎样的处理？
//
//
//        return count;
//    }


    //用户精简代码
//    public static int wiggleMaxLength(int[] nums) {
//        int n = nums.length;
//        if (n < 2) {
//            return n;
//        }
//        int up = 1;
//        int down = 1;
//        for (int i = 1; i < n; i++) {
//            if (nums[i] > nums[i - 1]) {
//                up = down + 1;
//            }
//            if (nums[i] < nums[i - 1]) {
//                down = up + 1;
//            }
//        }
//        return Math.max(up, down);
//    }
}
