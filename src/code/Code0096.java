package code;

/**
 * @Author czgggggggg
 * @Date 2022/4/13
 * @Description
 */
public class Code0096 {
    public static void main(String[] args) {
        System.out.println(numTrees(3));//5
        System.out.println(numTrees(1));//1
    }
    public static int numTrees(int n) {
        int[] G = new int[n + 1];
        G[0] = 1;
        G[1] = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j <= i - 1; j++) {
                G[i] += G[j] * G[i - j - 1];
            }
        }
        return G[n];
    }
}
