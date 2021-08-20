package array;

/**
 * @Author czgggggggg
 * @Date 2021/8/20
 * @Description
 */
public class Array167 {
    public static void main(String[] args) {
        int[] numbers1 = {2,7,11,15};
        int target1 = 9;
        numbers1 = twoSum(numbers1, target1);
        int[] numbers2 = {2,3,4};
        int target2 = 6;
        numbers2 = twoSum(numbers2, target2);
        int[] numbers3 = {-1,0};
        int target3 = -1;
        numbers3 = twoSum(numbers3, target3);
        int[] numbers4 = {5,25,75};
        int target4 = 100;
        numbers4 = twoSum(numbers4, target4);
        System.out.println("[" + numbers1[0] + "," + numbers1[1] + "]");
        System.out.println("[" + numbers2[0] + "," + numbers2[1] + "]");
        System.out.println("[" + numbers3[0] + "," + numbers3[1] + "]");
        System.out.println("[" + numbers4[0] + "," + numbers4[1] + "]");
    }
    //002双指针  //参考别人的题解
    public static int[] twoSum(int[] numbers, int target) {
        int i =0, j = numbers.length - 1;
        int[] results = new int[2];
        int sum;
        while(i < j){
            sum = numbers[i] + numbers[j];
            if(sum == target){
                results[0] = i + 1;
                results[1] = j + 1;
                break;
            }
            else if(sum > target){
                j--;
            }else if(sum < target){
                i++;
            }
        }
        return results;
    }

    //001暴力解法
//    public static int[] twoSum(int[] numbers, int target) {
//        int[] results = new int[2];
//        int tag = 0;
//        for(int i = 0; i < numbers.length - 1; i++){
//            for(int j = i + 1; j < numbers.length; j++){
//                if(numbers[i] + numbers[j] == target){
//                    results[0] = i + 1;
//                    results[1] = j + 1;
//                    tag = 1;
//                    break;//跳出内层循环
//                }
//            }
//            if(tag == 1)
//                break;//继续跳出外层循环
//        }
//        return results;
//    }

}


//[1,2,3,6,10,11,18,19]   16
//[1,2,3,6,10,11,18,19]
//[1,2,3,6,10,11]
//[3,6,10,11]
