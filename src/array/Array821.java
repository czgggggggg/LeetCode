package array;

/**
 * @Author czgggggggg
 * @Date 2021/8/25
 * @Description
 */
public class Array821 {
    public static void main(String[] args) {
        String s1 = "loveleetcode";//3 2 1 0 1 0 0 1 2 2 1 0
        char c1 = 'e';
        int[] ans1 = shortestToChar(s1,c1);
        for(int i = 0; i < ans1.length; i++){
            System.out.print(ans1[i] + " ");
        }
        System.out.println();
        String s2 = "eeeaaa";//0 0 0 1 2 3        //"aaaeaaa";//3 2 1 0 1 2 3       //"eaeae";//0 1 0 1 0
        char c2 = 'e';
        int[] ans2 = shortestToChar(s2,c2);
        for(int i = 0; i < ans2.length; i++){
            System.out.print(ans2[i] + " ");
        }
        System.out.println();
        String s3 = "aaab";//3 2 1 0
        char c3 = 'b';
        int[] ans3 = shortestToChar(s3,c3);
        for(int i = 0; i < ans3.length; i++){
            System.out.print(ans3[i] + " ");
        }
    }
    public static int[] shortestToChar(String s, char c) {
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == c){
                count++;
            }
        }
        int[] arr = new int[count];
        count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == c){//第一次提交错误的地方，没注意在这里把c写死成样例中的'e'了。
                arr[count++] = i;
            }
        }

        int tmp = 0;
        int[] ans = new int[s.length()];
        for(int i = 0; i < s.length(); i++){
            if(i <= arr[tmp]){
                if(tmp == 0){
                    ans[i] = Math.abs(arr[tmp] - i);
                }else{
                    ans[i] = Math.min(Math.abs(arr[tmp] - i), Math.abs(arr[tmp - 1] - i));
                }
            }
            else{
                tmp++;
                if(tmp == arr.length){//针对"aaaeaaa"这种情况
                    tmp--;//防止第42行代码  if(i <= arr[tmp]){  越界。
                    ans[i] = Math.abs(arr[arr.length - 1] - i);
                }else{
                    if(i <= arr[tmp]){
                        ans[i] = Math.min(Math.abs(arr[tmp] - i), Math.abs(arr[tmp - 1] - i));
                    }
                }
            }
        }
        return ans;
    }
}
//[1,_,_,1,_,_,_1,_,_,1,_,_1]
//