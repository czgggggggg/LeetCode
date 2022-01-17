package code;

import java.util.HashMap;

/**
 * @Author czgggggggg
 * @Date 2022/1/17
 * @Description
 */
public class Code0496 {
    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        int[] res = nextGreaterElement(nums1, nums2);
        for(int i : res)
            System.out.print(i + " ");
        //-1 3 -1

//        int[] nums1 = {2,4};
//        int[] nums2 = {1,2,3,4};
//        int[] res = nextGreaterElement(nums1, nums2);
//        for(int i : res)
//            System.out.print(i + " ");
        //3 -1

//        int[] nums1 = {0};
//        int[] nums2 = {0};
//        int[] res = nextGreaterElement(nums1, nums2);
//        for(int i : res)
//            System.out.print(i + " ");
//        //-1
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int len1 = nums1.length;
        int len2 = nums2.length;

        map.put(nums2[len2 - 1], -1);
        for(int i = len2 - 2; i >= 0; i--){
            if(nums2[i] < nums2[i + 1])
                map.put(nums2[i], nums2[i + 1]);
            else{//nums2[i] > nums2[i + 1]
                if(nums2[i + 1] == -1)
                    map.put(nums2[i], -1);
                else{
                    for(int j = i + 2; j < len2; j++){
                        if(nums2[j] > nums2[i]){
                            map.put(nums2[i], nums2[j]);
                            break;
                        }
                    }
                    if(!map.containsKey(nums2[i]))
                        map.put(nums2[i], - 1);
                }
            }
        }

//        for(int i = 0; i < len2; i++){
//            System.out.print(map.get(nums2[i]) + " ");
//        }
//        System.out.println();

        int[] res = new int[len1];
        for(int i = 0; i < len1; i++)
            res[i] = map.get(nums1[i]);

        return res;
    }
}
//[5,4,3,2,1,6] -> [6,6,6,6,6,-1]
//[6,5,4,3,2,1] -> [-1,-1,-1,-1,-1,-1]
//[5,4,2,3,1,6] -> [6,6,3,6,6,-1]
//[100,10,11] -> [-1,11,-1]