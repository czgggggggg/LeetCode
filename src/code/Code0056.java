package code;

/**
 * @Author czgggggggg
 * @Date 2022/2/20
 * @Description
 */
public class Code0056 {
    public static void main(String[] args) {
        int[][] intervals1 = {{0,3},{6,9},{7,9},{10,15},{13,20},{17,22}};//[0,3][6,9][17,22]
        int[][] res1 = merge(intervals1);
        for(int i = 0; i < res1.length; i++){
            System.out.print("[" + res1[i][0] + "," + res1[i][1] + "]");
        }
        System.out.println();

        int[][] intervals2 = {{8,10},{15,18},{1,3},{2,6},{20,22},{24,30}};//[1,6][8,10][15,18][20,22][24,30]
        int[][] res2 = merge(intervals2);
        for(int i = 0; i < res2.length; i++){
            System.out.print("[" + res2[i][0] + "," + res2[i][1] + "]");
        }
        System.out.println();

        int[][] intervals3 = {{1,3},{2,6},{8,10},{15,18}};//[1,6][8,10][15,18]
        int[][] res3 = merge(intervals3);
        for(int i = 0; i < res3.length; i++){
            System.out.print("[" + res3[i][0] + "," + res3[i][1] + "]");
        }
        System.out.println();

        int[][] intervals4 = {{1,4},{4,5}};//[1,5]
        int[][] res4 = merge(intervals4);
        for(int i = 0; i < res4.length; i++){
            System.out.print("[" + res4[i][0] + "," + res4[i][1] + "]");
        }
        System.out.println();

        int[][] intervals5 = {{0,0}};//[0,0]
        int[][] res5 = merge(intervals5);
        for(int i = 0; i < res5.length; i++){
            System.out.print("[" + res5[i][0] + "," + res5[i][1] + "]");
        }
        System.out.println();
    }
    public static int[][] merge(int[][] intervals) {
        int n = intervals.length;
        int tmp1, tmp2;

        //排序
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - 1 - i; j++){
                if(intervals[j][0] > intervals[j + 1][0]){
                    tmp1 = intervals[j][0];
                    tmp2 = intervals[j][1];
                    intervals[j][0] = intervals[j + 1][0];
                    intervals[j][1] = intervals[j + 1][1];
                    intervals[j + 1][0] = tmp1;
                    intervals[j + 1][1] = tmp2;
                }
            }
        }

        //test
//        for(int i = 0; i < n; i++){
//            System.out.print("[" + intervals[i][0] + "," + intervals[i][1] + "]");
//        }
//        System.out.println();

        //合并处理
        int count = 0;
        int i = 0, j = 1;
        while(j < n){
            if(intervals[j][1] <= intervals[i][1]){//前面的区间包含后面的区间
                j++;
            }else{
                if(intervals[j][0] <= intervals[i][1]){
                    intervals[i][1] = intervals[j][1];
                    j++;
                }else{
                    intervals[count][0] = intervals[i][0];
                    intervals[count][1] = intervals[i][1];
                    count++;
                    i = j;
                    j++;
                }
            }
        }

        if(i + 1 == j){
            intervals[count][0] = intervals[n - 1][0];
            intervals[count][1] = intervals[n - 1][1];
            count++;
        }else{
            intervals[count][0] = intervals[i][0];
            intervals[count][1] = intervals[i][1];
            count++;
        }

        //结果另存为
        int[][] res = new int[count][2];
        for(int t = 0; t < count; t++){
            res[t][0] = intervals[t][0];
            res[t][1] = intervals[t][1];
        }

        return res;
    }
}
