package code;

/**
 * @Author czgggggggg
 * @Date 2022/2/3
 *       2022/10/4
 * @Description
 */
public class Code0043 {
    public static void main(String[] args) {
        System.out.println(multiply("123","456"));//56088
        System.out.println(multiply("1", "1"));//1
        System.out.println(multiply("99999","1"));//99999
        System.out.println(multiply("99999","5"));//499995
        System.out.println(multiply("2","3"));//6
        System.out.println(multiply("1111111111","1111111111"));//1234567900987654321
        System.out.println(multiply("140","721"));//100940
        System.out.println(multiply("99999","99999"));//9999800001
    }
    public static String multiply(String num1, String num2) {
        if("0".equals(num1) || "0".equals(num2)){
            return "0";
        }
        int len1 = num1.length();
        int len2 = num2.length();
        StringBuffer[] sbs = new StringBuffer[len2];
        for(int i = 0; i < len2; i++){
            int number1;
            int number2 = num2.charAt(len2 - i - 1) - '0';
            int tmp;
            int add = 0;
            sbs[i] = new StringBuffer();
            for(int j = 0; j < i; j++){
                sbs[i].append(0);
            }
            for(int j = len1 - 1; j >= 0; j--){
                number1 = num1.charAt(j) - '0';
                tmp = number1 * number2 + add;
                add = tmp / 10;
                tmp = tmp % 10;
                sbs[i].append(tmp);
            }
            if(add != 0){
                sbs[i].append(add);
            }
//            System.out.println(sbs[i].toString());
        }
        //求和
        StringBuffer res = new StringBuffer();
        int add = 0;
        int sum;
        int tmp;
        for(int j = 0; j < sbs[len2 - 1].length(); j++){
            sum = 0;
            for(int i = 0; i < len2; i++){
                if(sbs[i].length() >= j + 1){
                    sum += (sbs[i].charAt(j) - '0');
                }
            }
//            System.out.println("sum: " + sum);
            sum += add;
            add = sum / 10;
            tmp = sum % 10;
//            System.out.println("tmp: " + tmp);
            res.append(tmp);
        }
        while (add > 0){
            tmp = add % 10;
            add = add / 10;
            res.append(tmp);
//            System.out.println("tmp: " + tmp);
        }
        return res.reverse().toString();
    }
}
//输入: num1 = "123", num2 = "456"
//输出: "56088"

//执行结果：
//解答错误
//显示详情
//添加备注
//
//通过测试用例：
//299 / 311
//输入：
//"140"
//"721"
//输出：
//"000940"
//预期结果：
//"100940"