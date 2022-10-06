package code;

public class Code0137 {
    public static void main(String[] args) {
        int[] nums1 = {2,2,3,2};
        System.out.println(singleNumber(nums1));//3
        int[] nums2 = {0,1,0,1,0,1,99};
        System.out.println(singleNumber(nums2));//99
        int[] nums3 = {1,2,3,1,2,3,1,2,3,4};
        System.out.println(singleNumber(nums3));//4
        int[] nums4 = {1,1,1,2,2,2,3,3,3,4};
        System.out.println(singleNumber(nums4));//4
        int[] nums5 = {-2,-2,-3,-2};
        System.out.println(singleNumber(nums5));//-3
        int[] nums6 = {2,2,-3,2};
        System.out.println(singleNumber(nums6));//-3
        int[] nums7 = {-2,-2,3,-2};
        System.out.println(singleNumber(nums7));//3
        int[] nums8 = {0,0,-3,0};
        System.out.println(singleNumber(nums8));//-3
        int[] nums9 = {-401451,-177656,-2147483646,-473874,-814645,-2147483646,-852036,-457533,-401451,-473874,-401451,-216555,-917279,-457533,-852036,-457533,-177656,-2147483646,-177656,-917279,-473874,-852036,-917279,-216555,-814645,2147483645,-2147483648,2147483645,-814645,2147483645,-216555};
        System.out.println(singleNumber(nums9));//-2147483648
    }
    public static int singleNumber(int[] nums) {
        int n = nums.length;
        int[] arr = new int[32];

        int index;
        int count = 0;//正数的个数
        int integerMinCount = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] > 0){
                count++;
            }else{
                if(nums[i] == Integer.MIN_VALUE){
                    integerMinCount++;
                }else{
                    nums[i] = Math.abs(nums[i]);
                }
            }

            index = 0;
            while (nums[i] > 0){
                if(nums[i] % 2 == 1){
                    arr[index]++;
                }
                index++;
                nums[i] /= 2;
            }
        }

        int res = 0;
        int tmp = 1;

        for(int i = 0; i < arr.length; i++){
            arr[i] %= 3;
            res += (tmp * arr[i]);
            tmp *= 2;
        }

        if(integerMinCount == 1){
            return Integer.MIN_VALUE;
        }

        if(count % 3 == 1){
            return res;
        }else{
            return -1 * res;
        }
    }
}
