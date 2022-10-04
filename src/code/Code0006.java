package code;

/**
 * @Author czgggggggg
 * @Date 2022/2/3
 *       2022/10/4
 * @Description
 */
public class Code0006 {
    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));//PAHNAPLSIIGYIR
        System.out.println(convert("PAYPALISHIRING", 4));//PINALSIGYAHRPI
        System.out.println(convert("A", 1));//A
        System.out.println(convert("A", 2));//A
        System.out.println(convert("ABCDE", 2));
    }
    public static String convert(String s, int numRows) {
        int n = s.length();
        if(numRows == 1){
            return s;
        }
        //确定二维数组列数
        int m = 0;
        int sum = 0;
        while (sum <= n){
            if(m % (numRows - 1) == 0){
                sum += numRows;
            }else{
                sum++;
            }
            m++;
        }
        char[][] chars = new char[numRows][m];
        for(int p = 0; p < numRows; p++) {
            for (int q = 0; q < m; q++) {
                chars[p][q] = '-';
            }
        }
        //计算
        int i = 0, j = 0;
        int cur = 0;
        boolean flag = true;//方向
        while (cur < n){
            chars[i][j] = s.charAt(cur);
            cur++;
            if(i == 0){
                i++;
                flag = true;
            }else if(i == numRows - 1){
                i--;
                j++;
                flag = false;
            }else{
                if(flag){
                    i++;
                }else{
                    i--;
                    j++;
                }
            }
        }
        //拼接结果
        StringBuffer sb = new StringBuffer();
        for(int p = 0; p < numRows; p++){
            for(int q = 0; q < m; q++){
                if(chars[p][q] != '-'){
                    sb.append(chars[p][q]);
                }
            }
        }
        return sb.toString();
    }
}
//P     I    N
//A   L S  I G
//Y A   H R
//P     I

//4 1 1 4 1 1
//0 1 2 3 4 5