package code;

/**
 * @Author czgggggggg
 * @Date 2022/3/23
 * @Description
 */
public class Code0004 {
    public static void main(String[] args) {
        int[] nums1_1 = {1,3};
        int[] nums1_2 = {2};
        System.out.println(findMedianSortedArrays(nums1_1,nums1_2));//2.0

        int[] nums2_1 = {1,2};
        int[] nums2_2 = {3,4};
        System.out.println(findMedianSortedArrays(nums2_1,nums2_2));//2.5

        int[] nums3_1 = {1};
        int[] nums3_2 = {};
        System.out.println(findMedianSortedArrays(nums3_1,nums3_2));//1.0

        int[] nums4_1 = {};
        int[] nums4_2 = {1};
        System.out.println(findMedianSortedArrays(nums4_1,nums4_2));//1.0

        int[] nums5_1 = {};
        int[] nums5_2 = {1,2,3,4};
        System.out.println(findMedianSortedArrays(nums5_1,nums5_2));//2.5
    }

    //v0.1 时间复杂度为O(m+n) 不用合并数组
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int mid;
        if((m + n) % 2 == 1){
            mid = (m + n) / 2 + 1;
        }else{
            mid = (m + n) / 2;
        }
        double res = 0;

        int cur = 0;
        int i = 0, j = 0;
        int tmp, tmp2;
        while(i < m || j < n){
            if(i < m && j < n){
                if(nums1[i] < nums2[j]){
                    tmp = nums1[i];
                    i++;
                }
                else{
                    tmp = nums2[j];
                    j++;
                }
            }else{
                if(i < m){
                    tmp = nums1[i];
                    i++;
                }
                else{//j < n
                    tmp = nums2[j];
                    j++;
                }
            }

            cur++;
            //当前为第cur个元素
            if(cur == mid){
                if((m + n) % 2 == 1){
                    res = (double)(tmp);
                    break;
                }else{
                    if(i < m && j < n){
                        if(nums1[i] < nums2[j]){
                            tmp2 = nums1[i];
                        }
                        else{
                            tmp2 = nums2[j];
                        }
                    }else{
                        if(i < m){
                            tmp2 = nums1[i];
                        }
                        else{//j < n
                            tmp2 = nums2[j];
                        }
                    }
                    res = (double)(tmp + tmp2) / 2;
                    break;
                }
            }
        }

        return res;
    }
}
