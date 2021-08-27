package array;

import java.util.Arrays;

/**
 * @Author czgggggggg
 * @Date 2021/8/27
 * @Description
 */
public class Array1046 {
    public static void main(String[] args){
        int[] stones1 = {2,7,4,1,8,1};
        System.out.println(lastStoneWeight(stones1));
        int[] stones2 = {1,1,1,100};
        System.out.println(lastStoneWeight(stones2));
    }
    public static int lastStoneWeight(int[] stones) {
        int disappear_count = 0;
        int num = stones.length;
        while(num - disappear_count >= 2){//至少还剩下两块石头，还可以继续操作
            Arrays.sort(stones);
            if(stones[num - 1] == stones[num - 2]){
                stones[num - 1] = 0;
                stones[num - 2] = 0;
                disappear_count += 2;//两块都消失
            }else{
                stones[num - 1] -= stones[num - 2];
                stones[num - 2] = 0;
                disappear_count++;//最小的那块石头消失
            }
        }
        Arrays.sort(stones);//注意，最后一次排序操作还是需要的。因为情况：[1,1,1]->[1,0,0]，此时stone[num - 1]不是最后剩下的石头的重量

        int ans = 0;
        if(num - disappear_count == 1)
            ans = stones[num - 1];

        return ans;
    }
}
