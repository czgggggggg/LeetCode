package code;

/**
 * @Author czgggggggg
 * @Date 2021/12/16
 * @Description
 */
public class Codeoo96 {
    public static void main(String[] args) {
        System.out.println(numTrees(1));//1
        System.out.println(numTrees(2));//2
        System.out.println(numTrees(3));//5
    }
    public static int numTrees(int n) {
        int[] G = new int[n + 1];
        G[0] = 1;
        G[1] = 1;

        for(int i = 2; i <= n; i++){
            for(int j = 1; j <= i; j++){
                G[i] += G[j - 1] * G[i - j];
            }
        }

        return G[n];
    }
}
