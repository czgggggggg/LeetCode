package math.math01_10;

import java.util.Stack;

/**
 * @Author czgggggggg
 * @Date 2021/8/16
 * @Description
 */
public class Math02{
    public static void main(String[] args) {
        System.out.println(reverse(2147483647));//0
        System.out.println(reverse(-2147483647));//0
        System.out.println(reverse(-10200));//-201
        System.out.println(reverse(-2147483648));//0
        System.out.println(reverse(123));//321
        System.out.println(reverse(-123));//-321
        System.out.println(reverse(120));//21
        System.out.println(reverse(0));//0
        System.out.println(reverse(1534236469));//0
    }
    public static int reverse(int x){  //123
        int rev = 0;
        int digit;
        while(x != 0){  //123                 //12   //1
            if(rev < Integer.MIN_VALUE / 10 || rev > Integer.MAX_VALUE / 10){
                return 0;
            }
            digit = x % 10;  //3              //2    //1
            x /= 10;         //12             //1    //0
            rev = rev * 10 + digit; //3       //32   //321
        }
        return rev;
    }
}








//public class Math02 {
//    public static void main(String[] args) {
////        int x = 2147483647;  //0
////        int x = -2147483647;  //0
////        int x = -10200;  //-201
////        int x = -2147483648;  //0  //更特殊的情况
//
////        int x = 123;  //321
////        int x = -123;  //-321
////        int x = 120;  //21
////        int x = 0;  //0
//
//        int x = 1534236469;
//
//        x = reverse(x);
//        System.out.println("整数反转后的结果：" + x);
//    }
//    public static int reverse(int x){
//        boolean isPositive = true;//标记正数负数
//        if(x < 0){
//            isPositive = false;
//            x = -x;  //更特殊的情况：对于 x = -2147483648的情况，这里就会产生溢出，不过好像对结果没有影响。
//                     //这条语句前后x的值都为-2147483648
////            System.out.println(x);
//        }
//        Stack<Integer> stack1 = new Stack<>();
//        Stack<Integer> stack2 = new Stack<>();//stack1的反转
//        //用栈stack1存储数字
//        while(x != 0){
//            stack1.push(x % 10);
//            x /= 10;
//        }
//        //反转stack1到stack2
//        while (stack1.size() != 0)
//            stack2.push(stack1.pop());
//        //去除stack2顶部的0
//        while (stack2.size() != 0 && stack2.peek() == 0)
//            stack2.pop();
//        //再反转stack2回到stack1
//        while(stack2.size() != 0){
//            stack1.push(stack2.pop());
//        }
//
////        while (stack1.size() != 0){
////            System.out.println(stack1.pop());
////        }
//
//        //重组数字
//        int t = 1;
//        x = 0;
//        while(stack1.size()!=0){
//            int tmp = stack1.pop();
//            int old_x = x;
//            x += tmp * t;//此处可能会出现溢出的情况，由于处理数字的时候我把数字都转换成了整数，
//                                  // 所以一旦出现溢出，x会由正数变为负数。（第一次提交错误的原因：x不一定会由正数变为负数！）
////            if(x < 0){
////                x = 0;//溢出的情况x赋予值0，并立即退出循环。
////                break;
////            }
//            //溢出的正确处理   x=46324351->646324351     646324351%100000000=46324351=x
//            //               x=646324351->1056389759   1056389759%1000000000=56389759!=x
////            System.out.println("---1---");
////            System.out.println("old_x = " + old_x);
////            System.out.println("func(x) = " + func(x));
////            System.out.println("---2---");
////            if(old_x != func(x)){//是否溢出的判断
////                x = 0;
////                break;
////            }
//
//
////            System.out.println("x = " + x);
////            System.out.println("func(x) = " + func(x));
//            t *= 10;
//        }
//        //负数加上负号
//        if(!isPositive)
//            x = -x;
//
//        return x;
//    }
//
////    public static int func(int x){//423  ->  23    //403 -> 3       //1
////
////        if(x >= 0 && x <= 9){
////            return x;
////        }
////
////        int tmp = x;//423                          //403            //1
////        int t = 1;
////        while(tmp / 10 != 0){
////            tmp = tmp / 10;//42 4                  //40  4
////            t *= 10;       //10 100                //10  100
////        }
////        x -= (tmp * t);  //423-(4*100)=23          //403-(4*100)=3  //1-(1*1)=0
////        return x;
////    }
//}
////int类型的数据范围 -2^31 ~ 2^31-1  -2147483648 ~ 2147483647
////考虑正数、0、负数、末尾有0、溢出5种情况
////123 -> 321
////0 -> 0
////-123 -> -321
////10200 -> 201
////2147483647 -> 7463847412  -2147483648 -> -8463847412
////解题思路：用一个栈存放每一个位上的数字（低位到高位），再反转栈（高位到低位），新的栈前面的0都去掉。
////         溢出怎么处理还要思考以下。
//
////第一次提交未通过：1534236469 -> 1056389759  //原因：溢出的处理不对！
////按照我现有的思路已经无法解决溢出问题。经过1h40min，决定放弃，参考题解。