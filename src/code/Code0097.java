package code;

/**
 * @Author czgggggggg
 * @Date 2021/12/16
 * @Description
 */
public class Code0097 {
    public static void main(String[] args) {
        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbcbcac";
        System.out.println(isInterleave(s1,s2,s3));

//        String s1 = "aabcc";
//        String s2 = "dbbca";
//        String s3 = "aadbbbaccc";
//        System.out.println(isInterleave(s1,s2,s3));

//        String s1 = "";
//        String s2 = "";
//        String s3 = "";
//        System.out.println(isInterleave(s1,s2,s3));
    }
    public static boolean isInterleave(String s1, String s2, String s3) {
        int n = s1.length(), m = s2.length(), t = s3.length();

        if (n + m != t) {
            return false;
        }

        boolean[][] f = new boolean[n + 1][m + 1];

        f[0][0] = true;
        for (int i = 0; i <= n; ++i) {
            for (int j = 0; j <= m; ++j) {
                int p = i + j - 1;
                if (i > 0) {
                    f[i][j] = f[i][j] || (f[i - 1][j] && s1.charAt(i - 1) == s3.charAt(p));
                }
                if (j > 0) {
                    f[i][j] = f[i][j] || (f[i][j - 1] && s2.charAt(j - 1) == s3.charAt(p));
                }
            }
        }

        return f[n][m];
    }
}
