package code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @Author czgggggggg
 * @Date 2022/1/6
 * @Description
 */
public class Code0539 {
    public static void main(String[] args) {
//        List<String> timePoints = new ArrayList<>();
//        timePoints.add("23:59");
//        timePoints.add("00:00");
//        System.out.println(findMinDifference(timePoints));//1

//        List<String> timePoints = new ArrayList<>();
//        timePoints.add("00:00");
//        timePoints.add("23:59");
//        timePoints.add("00:00");
//        System.out.println(findMinDifference(timePoints));//0

//        List<String> timePoints = new ArrayList<>();
//        timePoints.add("23:59");
//        timePoints.add("00:00");
//        timePoints.add("12:00");
//        timePoints.add("5:30");
//        timePoints.add("19:58");
//        System.out.println(findMinDifference(timePoints));//1

//        List<String> timePoints = new ArrayList<>();
//        timePoints.add("00:01");
//        timePoints.add("23:59");
//        System.out.println(findMinDifference(timePoints));//2

        List<String> timePoints = new ArrayList<>();
        timePoints.add("00:01");
        timePoints.add("12:00");
        timePoints.add("12:03");
        timePoints.add("23:59");
        System.out.println(findMinDifference(timePoints));//2
    }
    public static int findMinDifference(List<String> timePoints) {
        Iterator<String> iterator = timePoints.iterator();
        String str;
        int[] times = new int[timePoints.size()];
        int i = 0;
        while (iterator.hasNext()){
            str = iterator.next();
            String[] splits = str.split(":");
            times[i++] = Integer.valueOf(splits[0]) * 60 + Integer.valueOf(splits[1]);
        }

        Arrays.sort(times);

//        for (int t = 0; t < times.length; t++){
//            System.out.println(times[t]);
//        }
        int min = 720;
        int dif;
        for(int t = 0; t < times.length - 1; t++){
            dif = times[t + 1] - times[t];
            if(dif > 720)
                dif = 1440 - dif;
            if(dif < min)
                min = dif;
        }
        //首尾比较
        dif = times[times.length - 1] - times[0];
        if(dif > 720)
            dif = 1440 - dif;
        if(dif < min)
            min = dif;

        return min;
    }
}
