package alibaba;

import java.util.Arrays;

/**
 * @Author czgggggggg
 * @Date 2022/3/2
 * @Description
 */
public class Code2_0001 {
    public static void main(String[] args) {
//        int n = 5;
//        int k = 3;
//        int[][] a = {{2,11,21},{19,10,1},{20,11,1},{6,15,24},{18,27,36}};
        int n = 3;
        int k = 3;
        int[][] a = {{1,1,1},{1,1,1},{1,1,1},};

        boolean[] visited = new boolean[n];
        Arrays.fill(visited,false);
        int count;
        int res = 0;
        boolean flag;

        for(int i = 0; i < n; i++){
            count = 0;
            if(!visited[i]){
                visited[i] = true;
                for(int j = i + 1; j < n; j++){
                    flag = true;
                    for(int t = 1; t < k; t++){
                        if(a[i][t] + a[j][t] != a[i][t - 1] + a[j][t - 1]){
                            flag = false;
                            break;
                        }
                    }
                    if(flag){
                        count++;
                        visited[j] = true;
                    }
                }
            }

            System.out.println("count = " + count);
            res += count;
        }

        System.out.println("res = " + res);
    }
}
