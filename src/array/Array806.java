package array;

/**
 * @Author czgggggggg
 * @Date 2021/8/25
 * @Description
 */
public class Array806 {
    public static void main(String[] args) {
        int[] width1 = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String s1 = "abcdefghijklmnopqrstuvwxyz";
        int[] ans1 = numberOfLines(width1,s1);
        System.out.println(ans1[0] + "---" + ans1[1]);
        int[] width2 = {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String s2 = "bbbcccdddaaa";
        int[] ans2 = numberOfLines(width2,s2);
        System.out.println(ans2[0] + "---" + ans2[1]);
        int[] width3 = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String s3 = "a";
        int[] ans3 = numberOfLines(width3,s3);
        System.out.println(ans3[0] + "---" + ans3[1]);
    }
    public static int[] numberOfLines(int[] widths, String s) {
        int n = 1; //行数
        int num = 0; //最后一行占用单位
        for(int i = 0; i < s.length(); i++){
            num += widths[s.charAt(i) - 97];
            if(num > 100) {
                n++;
                num = widths[s.charAt(i) - 97];
            }
        }

        int[] ans = new int[2];
        ans[0] = n;
        ans[1] = num;
        return ans;
    }
}
