package interview2;

/**
 * @Author czgggggggg
 * @Date 2022/2/27
 * @Description 微软笔试题3
 */
public class Microsoft0003 {
    public static void main(String[] args) {
        int[] A1 = {5,2,4,6,3,7};
        System.out.println(solution(A1));//5
        int[] A2 = {1,2,3,4,5,4,3,2,1};
        System.out.println(solution(A2));//4
        int[] A3 = {1,3,3,4,5,4,2,2,1};
        System.out.println(solution(A3));//5
        int[] A4 = {1,3,3,4,5,2,3,2,1};
        System.out.println(solution(A4));//4
    }
    public static int solution(int[] A) {
        int res = Integer.MAX_VALUE;
        int n = A.length;

        for(int i = 1; i < n - 3; i++){
            for(int j = i + 2; j < n - 1; j++){
                if(Math.abs(A[i] + A[j]) < res){
                    res = Math.abs(A[i] + A[j]);
                }
            }
        }

        return res;
    }
}
