package code;

/**
 * @Author czgggggggg
 * @Date 2022/4/10
 * @Description
 */
public class Code0406 {
    public static void main(String[] args) {
//        int[][] people = {{4,4},{5,0},{5,2},{6,1},{7,0},{7,1}};
//        int[][] res = reconstructQueue(people);
//        for(int i = 0; i < res.length; i++){
//            System.out.print("[" + res[i][0] + "," + res[i][1] + "]");
//        }
//        System.out.println();//[5,0][7,0][5,2][6,1][4,4][7,1]


        int[][] people = {{6,0},{5,0},{4,0},{3,2},{2,2},{1,4}};
        int[][] res = reconstructQueue(people);
        for(int i = 0; i < res.length; i++){
            System.out.print("[" + res[i][0] + "," + res[i][1] + "]");
        }
        System.out.println();//[4,0][5,0][2,2][3,2][1,4][6,0]
    }

    //v0.2 根据普通用户评论思路写的代码
    public static int[][] reconstructQueue(int[][] people) {
        int n = people.length;
        int[][] res = new int[n][2];

        //排序：h升序、k降序
        int tmp1, tmp2;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(people[j][0] > people[j + 1][0]){
                    tmp1 = people[j][0];
                    people[j][0] = people[j + 1][0];
                    people[j + 1][0] = tmp1;
                    tmp2 = people[j][1];
                    people[j][1] = people[j + 1][1];
                    people[j + 1][1] = tmp2;
                }
                else if(people[j][0] == people[j + 1][0]){
                    if(people[j][1] < people[j + 1][1]){
                        tmp1 = people[j][0];
                        people[j][0] = people[j + 1][0];
                        people[j + 1][0] = tmp1;
                        tmp2 = people[j][1];
                        people[j][1] = people[j + 1][1];
                        people[j + 1][1] = tmp2;
                    }
                }
            }
        }

        //res初始化
        for(int i = 0; i < n; i++){
            res[i][0] = -1;
        }

        int count;
        for(int i = 0; i < n; i++){
            count = 0;
            for(int t = 0; t < n; t++){
                if(res[t][0] == -1){
                    if(count == people[i][1]){
                        res[t][0] = people[i][0];
                        res[t][1] = people[i][1];
                        break;
                    }
                    count++;
                }
            }
        }

        return res;
    }

    //v0.1 尝试
//    public static int[][] reconstructQueue(int[][] people) {
//        int n = people.length;
//        int[][] res = new int[n][2];
//
//        int tmp1, tmp2;
//        for(int i = 0; i < n - 1; i++){
//            for(int j = 0; j < n - i - 1; j++){
//                if(people[j][0] > people[j + 1][0]){
//                    tmp1 = people[j][0];
//                    people[j][0] = people[j + 1][0];
//                    people[j + 1][0] = tmp1;
//                    tmp2 = people[j][1];
//                    people[j][1] = people[j + 1][1];
//                    people[j + 1][1] = tmp2;
//                }else if(people[j][0] == people[j + 1][0]){
//                    if(people[j][1] > people[j + 1][1]){
//                        tmp1 = people[j][0];
//                        people[j][0] = people[j + 1][0];
//                        people[j + 1][0] = tmp1;
//                        tmp2 = people[j][1];
//                        people[j][1] = people[j + 1][1];
//                        people[j + 1][1] = tmp2;
//                    }
//                }
//            }
//        }
//
//        for(int i = 0; i < n; i++){
//            System.out.println(people[i][0] + " " + people[i][1]);
//        }
//
//        return res;
//    }
}
//输入：people = [[7,0],[4,4],[7,1],[5,0],[6,1],[5,2]]
//输出：[[5,0],[7,0],[5,2],[6,1],[4,4],[7,1]]


//[4,4] [5,0] [5,2] [6,1] [7,0] [7,1]
//[5,0] [7,0] [5,2] [6,1] [4,4] [7,1]