package code;

/**
 * @Author czgggggggg
 * @Date 2022/1/13
 * @Description
 */
public class Code1903 {
    public static void main(String[] args) {
        System.out.println(largestOddNumber("52"));//5
        System.out.println(largestOddNumber("4206"));//null
        System.out.println(largestOddNumber("35427"));//35427

        System.out.println(largestOddNumber("1234567"));//1234567
        System.out.println(largestOddNumber("12345678"));//1234567
        System.out.println(largestOddNumber("12345678888888888"));//1234567
        System.out.println(largestOddNumber("8818828838848858868878888888888"));//881882883884885886887
    }
    public static String largestOddNumber(String num) {
        char ch;
        for(int i = num.length() - 1; i >= 0; i--){
            ch = num.charAt(i);
            if(ch == '1' || ch == '3' || ch == '5' || ch == '7' || ch == '9'){
                if(i == num.length() - 1)
                    return num;
                else{
                    StringBuilder sb = new StringBuilder(num).delete(i + 1, num.length());
                    return sb.toString();
                }
            }
        }
        return "";
    }
}
//执行结果：
//解答错误
//显示详情
//添加备注
//
//通过测试用例：
//166 / 196
//输入：
//"4206"
//输出：
//null
//预期结果：
//""