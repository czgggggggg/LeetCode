package LCP;

/**
 * @Author czgggggggg
 * @Date 2022/1/22
 * @Description
 */
public class Code0006 {
    public static void main(String[] args) {
        int[] coins1 = {4,2,1};
        int[] coins2 = {2,3,10};
        int[] coins3 = {1};
        System.out.println(minCount(coins1));
        System.out.println(minCount(coins2));
        System.out.println(minCount(coins3));
    }
    public static int minCount(int[] coins) {
        int res = 0;
        for(int i : coins){
            res += (i / 2);
            if(i % 2 == 1)
                res++;
        }
        return res;
    }
}
