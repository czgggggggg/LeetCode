package jzOffer.offer01_10;
/**
* @Author czgggggggg
* @Date 2021/2/9
* @Description 青蛙跳台阶问题
* @Since version-1.0
*/
public class Offer10_2 {
    public static void main(String[] args) {
        System.out.println(numWays(2));
        System.out.println(numWays(7));
        System.out.println(numWays(0));
    }
    //分析:
    //1 -> 1, 2 -> 2,
    //numWays(n) -> numWays(n - 1) + numWays( n - 2)
    //numWays(n - 1),再跳一次1级台阶
    //numWays(n - 2),再跳一次2级台阶
    //和斐波那契数的原理一样
    public static int numWays(int n) {
        if(n == 0)
            return 1;//此处n == 0的情况没有什么实际意义.
        else if(n == 1)
            return 1;
        else{
            int var1 = 1;
            int var2 = 1;
            int tmp;
            while(--n != 0){
                tmp = var2;
                var2 = (var1 + var2) % 1000000007;
                var1 = tmp;
            }
            return var2;
        }
    }
}
