package code;

public class Code0134 {
    public static void main(String[] args) {
        int[] gas1 = {1,2,3,4,5};
        int[] cost1 = {3,4,5,1,2};
        System.out.println(canCompleteCircuit(gas1,cost1));//4
        int[] gas2 = {2,3,4};
        int[] cost2 = {3,4,3};
        System.out.println(canCompleteCircuit(gas2,cost2));//-1
    }
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int[] rest = new int[n];

        //不成立的情况
        int allGas = 0;
        int allCost = 0;
        for(int i = 0; i < n; i++){
            rest[i] = gas[i] - cost[i];
            allGas += gas[i];
            allCost += cost[i];
        }
        if(allCost > allGas){
            return -1;
        }

        //成立时，求唯一的索引
        int[] tmp = new int[n];
        int sum = 0;
        int res = 0;
        for(int i = 0; i < n; i++){
            sum += rest[i];
            tmp[i] = sum;
            if(tmp[i] < tmp[res]){
                res = i;
            }
        }

        return (res + 1) % n;
    }
}
