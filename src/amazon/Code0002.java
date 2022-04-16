package amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @Author czgggggggg
 * @Date 2022/4/16
 * @Description
 */
public class Code0002 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("101");
        list.add("001");
        list.add("110");
        System.out.println(getMax(list));
    }
    public static int getMax(List<String> list){
        int n = list.size();
        int m = list.get(0).length();
        char[][] arr = new char[n][m];
        int count = 0;
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            char[] chars = next.toCharArray();
            arr[count++] = Arrays.copyOf(chars, m);
        }

        int[] x0 = new int[n];
        int[] x1 = new int[n];
        int[] y0 = new int[m];
        int[] y1 = new int[m];

        int count0, count1;
        for(int i = 0; i < n; i++){
            count0 = 0;
            count1 = 0;
            for(int j = 0; j < m; j++){
                if(arr[i][j] == '0')
                    count0++;
                else
                    count1++;
            }
            x0[i] = count0;
            x1[i] = count1;
        }
        for(int j = 0; j < m; j++){
            count0 = 0;
            count1 = 0;
            for(int i = 0; i < n; i++){
                if(arr[i][j] == '0')
                    count0++;
                else
                    count1++;
            }
            y0[j] = count0;
            y1[j] = count1;
        }

        int max = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                max = Math.max(max,(x1[i] + y1[j]) - (x0[i] + y0[j]));
            }
        }

        return max;
    }
}
