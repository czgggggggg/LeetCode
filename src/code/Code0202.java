package code;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author czgggggggg
 * @Date 2022/1/18
 * @Description
 */
public class Code0202 {
    public static void main(String[] args) {
//        System.out.println(changeNum(19));
//        System.out.println(changeNum(82));
//        System.out.println(changeNum(68));
//        System.out.println(changeNum(100));

//        System.out.println(isHappy(19));//true
//        System.out.println(isHappy(2));//true
//        System.out.println(isHappy(1));//true
//        System.out.println(isHappy(7));//true

//        System.out.println(changeNum(7));

//        System.out.println(isHappy(1111111));//true
//        System.out.println(isHappy(4));//false
        System.out.println(isHappy(5));
    }



    public static boolean isHappy(int n) {
//        n = changeNum(n);//第一次提交错误的地方，要先changeNum一次，比如 7->49->...->1
        int tmp = n;

//        while(n >= 10){
        while(n > 3){//第二次提交错误的地方
            n = changeNum(n);
            System.out.println(n);
            if(n == tmp)//第三次提交错误的地方
                return false;
        }
        if(n == 1)
            return true;
        return false;
    }
    public static int changeNum(int num){
        int res = 0;
        while(num != 0){
            res += ((num % 10) * (num % 10));
            num /= 10;
        }
        return res;
    }













    //官方题解
//    private static Set<Integer> cycleMembers =
//            new HashSet<>(Arrays.asList(4, 16, 37, 58, 89, 145, 42, 20));
//
//    public static int getNext(int n) {
//        int totalSum = 0;
//        while (n > 0) {
//            int d = n % 10;
//            n = n / 10;
//            totalSum += d * d;
//        }
//        return totalSum;
//    }
//
//
//    public static boolean isHappy(int n) {
//        while (n != 1 && !cycleMembers.contains(n)) {
//            n = getNext(n);
//        }
//        return n == 1;
//    }
}






//执行结果：
//解答错误
//显示详情
//添加备注
//
//通过测试用例：
//400 / 402
//输入：
//7
//输出：
//false
//预期结果：
//true

//执行结果：
//解答错误
//显示详情
//添加备注
//
//通过测试用例：
//401 / 402
//输入：
//1111111
//输出：
//false
//预期结果：
//true

//执行结果：
//超出时间限制
//显示详情
//添加备注
//
//最后执行的输入：
//4

//执行结果：
//超出时间限制
//显示详情
//添加备注
//
//最后执行的输入：
//5