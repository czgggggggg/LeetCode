package interview2;

/**
 * @Author czgggggggg
 * @Date 2022/2/27
 * @Description 微软笔试题1
 */
public class Microsoft0001 {
    public static void main(String[] args) {
        int[] D1 = {5,8,2,7};
        System.out.println(solution(D1,3));
        int[] D2 = {5,8,2,7};
        System.out.println(solution(D2,4));
        int[] D3 = {5,8,2,7};
        System.out.println(solution(D3,2));
        int[] D4 = {1,1,1,1};
        System.out.println(solution(D4,2));
    }
    public static int solution(int[] D, int X) {
        int min = D[0];
        int max = D[0];
        int res = 0;

        for(int i = 1; i < D.length; i++){
            if(D[i] < min){
                min = D[i];
            }
            if(D[i] > max){
                max = D[i];
            }
            if(max - min > X){
                res++;
                min = D[i];
                max = D[i];
            }
        }
        res++;

        return res;
    }
}
