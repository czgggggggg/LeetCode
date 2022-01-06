package code;

/**
 * @Author czgggggggg
 * @Date 2022/1/6
 * @Description
 */
public class Code0035 {
    public static void main(String[] args) {
        int[] nums1 = {2,0,2,1,1,0};
        sortColors(nums1);//0 0 1 1 2 2
        int[] nums2 = {2,0,1};
        sortColors(nums2);//0 1 2
        int[] nums3 = {0};
        sortColors(nums3);//0
        int[] nums4 = {1};
        sortColors(nums4);//1
    }
    public static void sortColors(int[] nums) {
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for(int num : nums){
            if(num == 0)
                count1++;
            else if(num == 1)
                count2++;
            else
                count3++;
        }

        int index = 0;
        while(count1-- > 0)
            nums[index++] = 0;
        while(count2-- > 0)
            nums[index++] = 1;
        while(count3-- > 0)
            nums[index++] = 2;

//        for(int num : nums){
//            System.out.print(num + " ");
//        }
//        System.out.println();
    }
}
