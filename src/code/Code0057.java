//package code;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * @Author czgggggggg
// * @Date 2022/2/28
// * @Description
// */
//public class Code0057 {
//    public static void main(String[] args) {
//        int[][] intervals = {{1,3},{6,9}};
//        int[] newInterval = {2,5};
//        //[1,5] [6,9]
//
////        int[][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
////        int[] newInterval = {4,8};
//        //[1,2] [3,10] [12,16]
//
////        int[][] intervals = {};
////        int[] newInterval = {5,7};
//        //[5,7]
//
////        int[][] intervals = {{1,5}};
////        int[] newInterval = {2,3};
//        //[1,5]
//
////        int[][] intervals = {{1,5}};
////        int[] newInterval = {2,7};
//        //[1,7]
//
////        int[][] intervals = {{2,7}};
////        int[] newInterval = {1,5};
//        //[1,7]
//
//        int[][] new_intervals = insert(intervals, newInterval);
//        for(int i = 0; i < new_intervals.length; i++){
//            System.out.print("[" + new_intervals[i][0] + "," + new_intervals[i][1] + "] ");
//        }
//        System.out.println();
//    }
//
//    //v0.3
//    public static int[][] insert(int[][] intervals, int[] newInterval) {
//        int n = intervals.length;
//        int nums1 = 0, nums2 = 0;
//        List<int[]> list = new ArrayList<>();
//
//        int[] nums;
//        for (int i = 0; i < n; i++) {
//            //[a,b] [c,d]
//
//            //情况一：[ ] | a b
//            if (newInterval[0] >= intervals[i][1]) {
//                nums = new int[]{intervals[i][0], intervals[i][1]};
//                list.add(nums);
//            }
//
//            //情况二：[ a ]
//            if (newInterval[0] >= intervals[i][0] && newInterval[0] <= intervals[i][1])
//                nums1 = intervals[i][0];
//
//            //情况三：[   ] a [   ]
//            if (i > 0) {
//                if (newInterval[0] > intervals[i - 1][1] && newInterval[0] < intervals[i][0])
//                    nums1 = newInterval[0];
//            }
//            //a []
//            if(i == 0){
//                if(newInterval[0] < intervals[i][0])
//                    nums1 = newInterval[0];
//            }
//
//            //[ b ]
//            if (newInterval[1] >= intervals[i][0] && newInterval[1] <= intervals[i][1]){
//                nums2 = intervals[i][1];
//                nums = new int[]{nums1, nums2};
//                list.add(nums);
//            }
//
//
//            //[   ] b [   ]
//            if (i > 0) {
//                if (newInterval[1] > intervals[i - 1][1] && newInterval[1] < intervals[i][0]){
//                    nums2 = newInterval[1];
//                    nums = new int[]{nums1, nums2};
//                    list.add(nums);
//                }
//            }
//            if(i == n - 1 && newInterval[1] > intervals[i][1]){
//                nums2 = newInterval[1];
//                nums = new int[]{nums1, nums2};
//                list.add(nums);
//            }
//
//            //c d [   ]
//            if(newInterval[1] < intervals[i][0]){
//                nums = new int[]{intervals[i][0], intervals[i][1]};
//                list.add(nums);
//            }
//        }
//
//        if(n == 0){
//            nums = new int[]{newInterval[0], newInterval[1]};
//            list.add(nums);
//        }
//
//        int new_n = list.size();
//        int count = 0;
//        int[][] new_intervals = new int[new_n][2];
//        for (int i = 0; i < new_n; i++){
//            int[] tmp = list.get(i);
//            new_intervals[count][0] = tmp[0];
//            new_intervals[count][1] = tmp[1];
//            count++;
//        }
//
//        return new_intervals;
//    }
//
//    //v0.2
////    public static int[][] insert(int[][] intervals, int[] newInterval) {
////        int n = intervals.length;
////        int nums1 = 0, nums2 = 0;
////        List<int[]> list = new ArrayList<>();
////
////        int[] nums;
////        for (int i = 0; i < n; i++) {
////            if (newInterval[0] >= intervals[i][1]) {
////                nums = new int[]{intervals[i][0], intervals[i][1]};
////                list.add(nums);
////            }
////
////            if (newInterval[0] >= intervals[i][0] && newInterval[0] <= intervals[i][1])
////                nums1 = intervals[i][0];
////            if (i > 0) {
////                if (newInterval[0] > intervals[i - 1][1] && newInterval[0] < intervals[i][0])
////                    nums1 = newInterval[0];
////            }
////            if (newInterval[1] >= intervals[i][0] && newInterval[1] <= intervals[i][1])
////                nums2 = intervals[i][1];
////            if (i > 0) {
////                if (newInterval[1] > intervals[i - 1][1] && newInterval[1] < intervals[i][0])
////                    nums2 = newInterval[1];
////                nums = new int[]{nums1, nums2};
////                list.add(nums);
////
////                if (newInterval[1] <= intervals[i][0]) {
////                    nums = new int[]{intervals[i][0], intervals[i][1]};
////                    list.add(nums);
////                }
////            }
////        }
////
////        int new_n = list.size();
////        int count = 0;
////        int[][] new_intervals = new int[new_n][2];
////        for (int i = 0; i < new_n; i++){
////            int[] tmp = list.get(i);
////            new_intervals[count][0] = tmp[0];
////            new_intervals[count][1] = tmp[1];
////            count++;
////        }
////
////        return new_intervals;
////    }
//
//
//    //v0.1
////    public static int[][] insert(int[][] intervals, int[] newInterval) {
////        int n = intervals.length;
////        int start = 0, end = 0;
////
////        for(int i = 0; i < n; i++){
////            if(newInterval[0] >= intervals[i][0] && newInterval[0] <= intervals[i][1])
////                start = i;
////            if(newInterval[1] >= intervals[i][0] && newInterval[1] <= intervals[i][1])
////                end = i;
////        }
////
////        int new_n = n - (end - start);
////        int[][] new_intervals = new int[new_n][2];
////        int index = 0;
////        for(int i = 0; i < n; i++){
////            if(i < start || i > end){
////                new_intervals[index][0] = intervals[i][0];
////                new_intervals[index][1] = intervals[i][1];
////                index++;
////            }else{
////                if(i == start)
////                    new_intervals[index][0] = intervals[i][0];
////                else if(i == end){
////                    new_intervals[index][1] = intervals[i][1];
////                    index++;
////                }
////            }
////        }
////
////        return new_intervals;
////    }
//}
//
//

//执行结果：
//解答错误
//显示详情
//添加备注
//
//通过测试用例：
//97 / 156
//输入：
//[[1,5]]
//[5,7]
//输出：
//[[1,5],[1,7]]
//预期结果：
//[[1,7]]