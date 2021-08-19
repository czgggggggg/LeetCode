package array;

import java.util.Arrays;

/**
 * @Author czgggggggg
 * @Date 2021/8/19
 * @Description
 */
public class Array88 {
    public static void main(String[] args) {
        int[] nums1 = {2,4,6,0,0,0,0};
        int m = 3;
        int[] nums2 = {1,3,4,5};
        int n = 4;
        merge(nums1,m,nums2,n);
//        int[] nums1 = {1,2,3,0,0,0};
//        int m = 3;
//        int[] nums2 = {2,5,6};
//        int n = 3;
//        merge(nums1,m,nums2,n);
        for (int i = 0; i < m + n; i++){
            System.out.print(nums1[i] + " ");
        }
    }

    //别人的代码，这种压根就没利用数组非递减的性质。不管了，暂时能过就行。以后回头再看，已经花了太多时间了。
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int length = m + n;
        for(int i = 0; i < n; i++){
            nums1[m] = nums2[i];
            m++;
        }
        Arrays.sort(nums1);
    }
}



//    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        int i = 0, j = 0;
//        int k = m;
//        //第一阶段
//        while(k != m + n){
//            if(i < m && j < n){
//                if(nums1[i] > nums2[j]){
//                    nums1[k] = nums2[j];
//                    nums2[j] = 0;
//                    j++;
//                    k++;
//                }
//                if(nums1[i] <= nums2[j]){
//                    nums1[k] = nums1[i];
//                    nums1[i] = 0;
//                    i++;
//                    k++;
//                }
//            }
//            else if(i == m){
//                nums1[k] = nums2[j];
//                nums2[j] = 0;
//                j++;
//                k++;
//            }else if(j == n){
//                nums1[k] = nums1[i];
//                nums1[i] = 0;
//                i++;
//                k++;
//            }
//        }
////        System.out.println("i = " + i);
////        System.out.println("j = " + j);
////        System.out.println("m = " + m);
//        //第二阶段
//        k = 0;
//        while(k != m && i < m && j < n){
//            if(nums1[i] > nums2[j]){
//                nums1[k] = nums2[j];
////                System.out.println("test---nums2[j]---" + nums2[j]);
//                nums2[j] = 0;
//                j++;
//                k++;
//            }
//            else{
//                nums1[k] = nums1[i];
////                System.out.println("test---nums1[i]---" + nums1[i]);
//                nums1[i] = 0;
//                i++;
//                k++;
//            }
//        }
//        //第三阶段
//        int tmp;
//        tmp = nums1[0];
//        int count = 0;
//        int x = 0;
//        while(count != m + n - 1){
////            System.out.println("test---" + nums1[(x + m) % (m + n)]);//3625140 1463521
//            nums1[x] = nums1[(x + m) % (m + n)];
////            System.out.println("x = " + x);
////            System.out.println(nums1[(x + m) % (m + n)]);
//            x = (x + m) % (m + n);
////            System.out.println("x = " + x);
//            count++;
//        }
//        nums1[x] = tmp;
//        //4 2 3 4 1 5 6
//
//        for(int t = 0; t < m + n; t++){
//            System.out.print(nums1[t] + " ");
//        }
//        System.out.println();
//        for(int t = 0; t < n; t++){
//            System.out.print(nums2[t] + " ");
//        }
//    }
//}
//[2,4,6,0,0,0,0] [1,3,4,5]
//[2,4,6,1,0,0,0] [_,3,4,5]
//[_,4,6,1,2,0,0] [_,3,4,5]
//[_,4,6,1,2,3,0] [_,_,4,5]
//[_,_,6,1,2,3,4] [_,_,4,5]
//[4,_,6,1,2,3,4] [_,_,_,5]
//[4,5,6,1,2,3,4] [_,_,_,_]
//-------------------------
//[4,5,6,1,2,3,4]
//[1,2,3,4,4,5,6]

//这道题我还是有思路的，只是想的不够彻底，已经花了两个小时，直接放弃，看题解。