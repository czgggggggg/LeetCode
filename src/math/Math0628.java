package math;

import java.util.Arrays;

/**
 * @Author czgggggggg
 * @Date 2021/9/18
 * @Description
 */
public class Math0628 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4};//24
        System.out.println(maximumProduct(nums1));
        int[] nums2 = {-1,0,1,2,3};//6
        System.out.println(maximumProduct(nums2));
        int[] nums3 = {-1,1,2,3};//6
        System.out.println(maximumProduct(nums3));
        int[] nums4 = {-2,-1,1,2};//4
        System.out.println(maximumProduct(nums4));
        int[] nums5 = {-3,-2,-1,1,2};//12
        System.out.println(maximumProduct(nums5));
        int[] nums6 = {-3,-2,-1,0};//0
        System.out.println(maximumProduct(nums6));
        int[] nums7 = {-4,-3,-2,-1};//-6
        System.out.println(maximumProduct(nums7));
        int[] nums8 = {-3,-2,-1,0,1,2,3};//18
        System.out.println(maximumProduct(nums8));
        int[] nums9 = {-100,-99,1,101,102};//1009800
        System.out.println(maximumProduct(nums9));
        int[] nums10 = {-100,-99,100,101,102};//1030200
        System.out.println(maximumProduct(nums10));
        int[] nums11 = {-1,1,2};//-2
        System.out.println(maximumProduct(nums11));
        System.out.println("------------------");
        System.out.println(-100*-99*102);
        System.out.println(100*101*102);

//        int[] nums12 = {1,2,3,4};
//        System.out.println(maximumProduct(nums12));
    }
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;

        //001、002版本需要这段注释掉的代码
//        int count1 = 0;//负数的个数
//        int count2 = 0;//0的个数
//        int count3 = 0;//正数的个数
//        for(int i = 0; i < len; i++){
//            if(nums[i] < 0)
//                count1++;
//            else if(nums[i] == 0)
//                count2++;
//            else if(nums[i] > 0)
//                break;//先立即退出
//        }
//        count3 = len - count1 - count2;


        //003版本
        return Math.max(nums[0] * nums[1] * nums[len - 1],nums[len - 1] * nums[len - 2] * nums[len - 3]);

        //002版本
//        if(count1 >= 2)
//            return Math.max(nums[0] * nums[1] * nums[len - 1],nums[len - 1] * nums[len - 2] * nums[len - 3]);
//        else
//            return nums[len - 1] * nums[len - 2] * nums[len - 3];

        //001版本
//        //分情况讨论：
//        if(count2 + count3 == len)//都是正数或0
//            return nums[len - 1] * nums[len - 2] * nums[len - 3];
//        else if(count1 + count2 == len){//都是负数或0
//            return nums[len - 1] * nums[len - 2] * nums[len - 3];
//        }else{//正数和负数同时存在（当然也可能存在0）
//            if(count1 == 1){//只有1个负数
//                return nums[len - 1] * nums[len - 2] * nums[len - 3];
//            }else if(count1 >= 2){//有大于等于2个负数
//                return Math.max(nums[0] * nums[1] * nums[len - 1],nums[len - 1] * nums[len - 2] * nums[len - 3]);
//            }
//        }
//
//        return 0;//一定不会执行这条语句
    }
}
//1,[2,3,4]
//-1,0,[1,2,3]
//-1,[1,2,3]
//[-1,1,2]
//[-2,-1],1,2   //负负得正
//[-3,-2],-1,1,[2]
//-3,[-2,-1,0]
//-4,[-3,-2,-1]
//[-3,-2],-1,0,1,2,[3]
//[-100,-99],1,101,[102]
//-100,-99,[100,101,102]
