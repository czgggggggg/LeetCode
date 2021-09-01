package array;

/**
 * @Author czgggggggg
 * @Date 2021/9/1
 * @Description
 */
public class Array1313 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4};
        int[] result1 = decompressRLElist(nums1);
        for(int x : result1)
            System.out.print(x + " ");
        System.out.println();
        int[] nums2 = {1,1,2,3};
        int[] result2 = decompressRLElist(nums2);
        for(int x : result2)
            System.out.print(x + " ");
        System.out.println();
        int[] nums3 = {5,1};
        int[] result3 = decompressRLElist(nums3);
        for(int x : result3)
            System.out.print(x + " ");
        System.out.println();
    }

    public static int[] decompressRLElist(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i += 2){
            count += nums[i];
        }
        int[] result = new int[count];
        int k = 0;
        for(int i = 0; i < nums.length; i += 2){
            for(int j = 0; j < nums[i]; j++){
                result[k++] = nums[i + 1];
            }
        }
        return result;
    }
}
