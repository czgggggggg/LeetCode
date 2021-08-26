package array;

/**
 * @Author czgggggggg
 * @Date 2021/8/26
 * @Description
 */
public class Array961 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,3};
        System.out.println(repeatedNTimes(nums1));
        int[] nums2 = {2,1,2,5,3,2};
        System.out.println(repeatedNTimes(nums2));
        int[] nums3 = {5,1,5,2,5,3,5,4};
        System.out.println(repeatedNTimes(nums3));

        int[] nums4 = {3,3,3,3,1,1,1,2,2,3};
        System.out.println(repeatedNTimes(nums4));
        int[] nums5 = {3,3,3,3,1,1,1,2,3,2};
        System.out.println(repeatedNTimes(nums5));
        int[] nums6 = {1,3,1,3,1,3,2,3,2,3};
        System.out.println(repeatedNTimes(nums6));
        int[] nums7 = {1,1,1,2,3,2,3,3,3,3};
        System.out.println(repeatedNTimes(nums7));
    }
    public static int repeatedNTimes(int[] nums) {
        int number = -1;//结果一定不会等于-1
        int tmp = nums[0];
        int tmp_count = 1;
        for(int i = 0; i < nums.length - 1; i++){
            if(tmp != nums[i + 1]){
//                System.out.println("test1---" + tmp + "---" + nums[i + 1]);
                tmp_count--;
                if(tmp_count == 0){
                    if(i + 2 < nums.length){
//                        System.out.println("test2");
                        tmp = nums[i + 2];
                        tmp_count = 1;
//                        System.out.println("test3---" + tmp);
                        i++;//循环条件会再加一
                    }else{
                        //N次元素在tmp和nums[i + 1]之间
                        int count1 = 0;
                        int count2 = 0;
                        for(int k = 0; k < nums.length; k++){
                            if(tmp == nums[k])
                                count1++;
                            else if(nums[i + 1] == nums[k])
                                count2++;
                        }
                        if(count1 * 2 == nums.length)
                            number = tmp;
                        else if(count2 * 2 == nums.length)
                            number = nums[i + 1];
                    }
                }
            }else{
                tmp_count++;
            }
        }
        if(tmp_count > 0)
            number = tmp;
        return number;
    }
}
//[3,3,3,3,1,1,1,2,2,3]
//[3,3,3,3,1,1,1,2,3,2]
//[1,3,1,3,1,3,2,3,2,3]
//[1,1,1,2,3,2,3,3,3,3]
