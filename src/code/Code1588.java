package code;

/**
 * @Author czgggggggg
 * @Date 2022/1/8
 * @Description
 */
public class Code1588 {
    public static void main(String[] args) {
        int[] arr1 = {1,4,2,5,3};
        System.out.println(sumOddLengthSubarrays(arr1));//58
        int[] arr2 = {1,2};
        System.out.println(sumOddLengthSubarrays(arr2));//3
        int[] arr3 = {10,11,12};
        System.out.println(sumOddLengthSubarrays(arr3));//66
        int[] arr4 = {1};
        System.out.println(sumOddLengthSubarrays(arr4));//1
    }
    public static int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int k = (n + 1) / 2;

        int tmp[][] = new int[n][k];

        //初始化
        for(int i = 0; i < n; i++)
            tmp[i][0] = arr[i];  //1
        for(int i = 0; i < n; i++){
            for(int j = 1; j < k; j++)
                tmp[i][j] = 0;
        }

        //t = 0 -> 1 || t = 1 -> 3 || t = 2 -> 5 ... t -> 2 * t + 1
        for(int t = 1; t < k; t++){
            for(int i = 0; i < n; i++){
                if(i + 2 * t < n){//i + t * 2 + 1 - 1 = i + 2 * t
                    tmp[i][t] = tmp[i][t - 1] + arr[i + 2 * t - 1] + arr[i + 2 * t];
//                    System.out.println("---" + tmp[i][t - 1] + "---" + arr[i + 2 * t - 1] + "---" + arr[i + 2 * t]);
                }
            }
        }

        int res = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < k; j++){
                res += tmp[i][j];
            }
        }

        return res;
    }
}
//1,4,2,5,3

//1 -> 1
//2 -> 1
//3 -> 1\3
//4 -> 1\3
//5 -> 1\3\5