package code;

/**
 * @Author czgggggggg
 * @Date 2022/1/2
 * @Description
 */
public class Code0279 {
    public static void main(String[] args) {
        System.out.println(numSquares(1));//1
        System.out.println(numSquares(2));//2
        System.out.println(numSquares(3));//3
        System.out.println(numSquares(4));//1
        System.out.println(numSquares(5));//2

        System.out.println(numSquares(12));
        System.out.println(numSquares(13));
    }
    public static int numSquares(int n) {
        int[] nums = new int[101];
        for(int i = 1; i <= 100; i++){
            nums[i] = i * i;
        }
        int[] res = new int[n + 1];//res[0]不用

        res[1] = 1;
        for(int i = 2; i <= n; i++){
            int min = i;
            for(int k = 1; k <= 100; k++){
                if(nums[k] == i){
                    res[i] = 1;
                    min = 1;//
                }else if(nums[k] < i){
                    min = Math.min(min,res[i - nums[k]] + 1);
                }else{
                    break;
                }
            }
            res[i] = min;
        }

        return res[n];
    }
}
//1 -> 1
//2 -> 1 + 1
//3 -> 1 + 1 + 1
//4 -> 4
//5 -> 1 + 4
//...
//n ->

//res[103] = min(res[103 - 1], res[103 - 4], ..., res[103 - 100]) + 1

//res[n] =
