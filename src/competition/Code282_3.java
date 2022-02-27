//package competition;
//
//import java.util.Arrays;
//
///**
// * @Author czgggggggg
// * @Date 2022/2/27
// * @Description
// */
//public class Code0003 {
//    public static void main(String[] args) {
////        int[] time1 = {1,2,3};
////        int totalTrips1 = 5;
////        System.out.println(minimumTime(time1,totalTrips1));//3
////
////        int[] time2 = {2};
////        int totalTrips2 = 1;
////        System.out.println(minimumTime(time2,totalTrips2));//2
////
////        int[] time3 = {1,2,3};
////        int totalTrips3 = 5;
////        System.out.println(minimumTime(time3,totalTrips3));//3
////        int[] time4 = {1,2,3};
////        int totalTrips4 = 6;
////        System.out.println(minimumTime(time4,totalTrips4));//4
//
////        int[] time5 = {5,10,10};
////        int totalTrips5 = 9;
////        System.out.println(minimumTime(time5,totalTrips5));//25
//
//        int[] time6 = {39,82,69,37,78,14,93,36,66,61,13,58,57,12,70,14,67,75,91,1,34,68,73,50,13,40,81,21,79,12,35,18,71,43,5,50,37,16,15,6,61,7,87,43,27,62,95,45,82,100,15,74,33,95,38,88,91,47,22,82,51,19,10,24,87,38,5,91,10,36,56,86,48,92,10,26,63,2,50,88,9,83,20,42,59,55,8,15,48,25};
//        int totalTrips6 = 4187;
//        System.out.println(minimumTime(time6,totalTrips6));//20591
//
//    }
//
//    //v0.2 折半查找思想
//    public static long minimumTime(int[] time, int totalTrips) {
//        Arrays.sort(time);
//
//        int low = 1;
//        int high = Math.round(totalTrips / time[0]);
//
//        return zheban(low,high,time,totalTrips);
//    }
//    public static long zheban(int low, int high,int[] time, int totalTrips){
//        int mid = (low + high) / 2;
//        if(sum(time,mid) < totalTrips){
//            low = mid;
//            return zheban(low,high,time,totalTrips);
//        }
//        else{//sum(time,mid) >= totalTrips
//            if(sum(time,mid - 1) < totalTrips){
//                high = mid;
//                return zheban(low,high,time,totalTrips);
//            }
//        }
//    }
//
//    public static int sum(int[] time, int res){
//        int sum = 0;
//        for(int i = 0; i < time.length; i++)
//            sum += res / time[i];
//        return sum;
//    }
//
//
//    //v0.1 最小公倍数思路错误，会严重溢出
//    //两次提交错误
////    public static long minimumTime(int[] time, int totalTrips) {
////        int num = 1;//最小公倍数
////        for(int i = 0; i < time.length; i++){
////            System.out.println("test1---" + num + "---" + time[i]);
////            if(num % time[i] != 0)
////                num *= time[i];
////        }
////
////        int x = 0;
////        for(int i = 0; i < time.length; i++){
////            x += (num / time[i]);
////        }
////
////        //此时，x * res >= total * num
////        //也即，res >= total * num / x;
////
////        System.out.println("test---num---" + num);
////        System.out.println("test---x---" + x);
////        System.out.println("test---totalTrips---" + totalTrips);
////
////        int res;
////        if(totalTrips * num % x != 0)
////            res = totalTrips * num / x + 1;
////        else
////            res = totalTrips * num / x;
////
////        //[res,...]
////        int sum;
////        while(true){
////            sum = 0;
////            for(int i = 0; i < time.length; i++){
////                sum += res / time[i];
////            }
////            if(sum >= totalTrips)
////                break;
////            res++;
////        }
////
////        return res;
////    }
//}
