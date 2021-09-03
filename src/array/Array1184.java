package array;

/**
 * @Author czgggggggg
 * @Date 2021/9/3
 * @Description
 */
public class Array1184 {
    public static void main(String[] args) {
//        int[] distance1 = {1,2,3,4};
//        int start1 = 0;
//        int destination1 = 1;
//        System.out.println(distanceBetweenBusStops(distance1,start1,destination1));
//        int[] distance2 = {1,2,3,4};
//        int start2 = 0;
//        int destination2 = 2;
//        System.out.println(distanceBetweenBusStops(distance2,start2,destination2));
//        int[] distance3 = {1,2,3,4};
//        int start3 = 0;
//        int destination3 = 3;
//        System.out.println(distanceBetweenBusStops(distance3,start3,destination3));
//        int[] distance4 = {0};
//        int start4 = 0;
//        int destination4 = 0;
//        System.out.println(distanceBetweenBusStops(distance4,start4,destination4));
        int[] distance5 = {7,10,1,12,11,14,5,0};
        int start5 = 7;
        int destination5 = 2;
        System.out.println(distanceBetweenBusStops(distance5,start5,destination5));
    }
    public static int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int dis1 = 0;//顺时针距离
        int dis2 = 0;//逆时针距离
        int current;

        //只有一个车站的情况
        if(start == destination)
            return 0;

        //顺时针累加
        current = start;
        while(true){
            current = (current + 1) % distance.length;
            if(current == 0){
                dis1 += distance[distance.length - 1];
            }else{
                dis1 += distance[current - 1];
            }
            if(current == destination){
                break;
            }
        }

        //逆时针累加
        current = start;
        while(true){
            if(current - 1 >= 0){
                current--;
                dis2 += distance[current];
            }else{
                current = distance.length - 1;
                dis2 += distance[current];
            }
            if(current == destination){
                break;
            }

        }

        return Math.min(dis1,dis2);
    }
}
//0---1---2---3---4---5---6---7---0
//  7   10  1   12  11  14  5   0
//7,10,1,12,11,14,5,0

/*
执行用时：
0 ms
, 在所有 Java 提交中击败了
100.00%
的用户
内存消耗：
38 MB
, 在所有 Java 提交中击败了
91.79%
的用户
 */