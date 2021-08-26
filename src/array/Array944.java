package array;

/**
 * @Author czgggggggg
 * @Date 2021/8/26
 * @Description
 */
public class Array944 {
    public static void main(String[] args) {
        String[] str1 = {"abc", "bce", "cae"};
        System.out.println(minDeletionSize(str1));
        String[] str2 = {"a","b"};
        System.out.println(minDeletionSize(str2));
        String[] str3 = {"zyx","wvu","tsr"};
        System.out.println(minDeletionSize(str3));
        String[] str4 = {"a"};
        System.out.println(minDeletionSize(str4));
    }
    public static int minDeletionSize(String[] strs) {
        int m = strs.length;
        int n = strs[0].length();
        int num = 0;
        for(int j = 0; j < n; j++){
            for(int i = 0; i < m - 1; i++){
                if(strs[i].charAt(j) > strs[i + 1].charAt(j)){
                    num++;
                    break;
                }
            }
        }
        return num;
    }
}
