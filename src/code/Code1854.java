package code;

import java.util.Arrays;

/**
 * @Author czgggggggg
 * @Date 2022/2/11
 * @Description
 */
public class Code1854 {
    public static void main(String[] args) {
        int[][] logs1 = {{1993,1999},{2000,2010}};
        System.out.println(maximumPopulation(logs1));//1993

        int[][] logs2 = {{1950,1961},{1960,1971},{1970,1981}};
        System.out.println(maximumPopulation(logs2));//1960

        int[][] logs3 = {{1950,1950}};
        System.out.println(maximumPopulation(logs3));//1950
    }
    public static int maximumPopulation(int[][] logs) {
        int[] count = new int[100];
        Arrays.fill(count,0);
        int n = logs.length;

        for(int i = 0; i < n; i++){
            for(int j = logs[i][0]; j <= logs[i][1] - 1; j++){
                count[j - 1950]++;
            }
        }

        int res = 1950;
        int max = 0;
        for(int i = 0; i < 100; i++){
            if(max < count[i]){
                max = count[i];
                res = i + 1950;
            }
        }

        return res;
    }
}
//[1950,2050]
//[1950,2049]
//0-99
