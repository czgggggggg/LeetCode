package array;

/**
 * @Author czgggggggg
 * @Date 2021/8/20
 * @Description
 */
public class Array268 {
    public static void main(String[] args) {
        int[] num1 = {3,0,1};
        System.out.println(missingNumber(num1));
        int[] num2 = {0,1};
        System.out.println(missingNumber(num2));
        int[] num3 = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(num3));
        int[] num4 = {0};
        System.out.println(missingNumber(num4));
        int[] num5 = {1,2};
        System.out.println(missingNumber(num5));
    }
    public static int missingNumber(int[] nums) {
        int out = -1;
        int tmp = -1;
        boolean isFirst;
        int old_tmp;
        for(int i = 0; i < nums.length; i++){
            isFirst = true;
            if(nums[i] == -1 || nums[i] == i){
                continue;
            }else{//nums[i] != -1 && num[i] != i
//                if(nums[i] != i){
                    if(nums[i] == nums.length){
                        out = nums[i];
                        nums[i] = -1;
//                        System.out.println("out---" + out);
                    }
                    else if(nums[i] != nums.length && nums[i] != -1){
                        while (tmp != -1 || isFirst){
//                            System.out.println("test");
//                            System.out.println("nums[i] = " + nums[i]);
//                            System.out.println("nums[nums[i]] = " + nums[nums[i]]);
                            if(isFirst){
                                tmp = nums[nums[i]];
                                nums[nums[i]] = nums[i];
                                nums[i] = -1;
                                isFirst = false;
                            }
                            if(tmp != -1){
//                            System.out.println("tmp = " + tmp);
                                old_tmp = tmp;            //7
                                if(tmp == nums.length){
                                    tmp = out;
                                    out = old_tmp;
                                }else{
                                    tmp = nums[tmp];          //0
                                    nums[old_tmp] = old_tmp;  //7
                                }
                            }
                        }
                    }
//                }
            }
        }
        int result = -1;
        if(out == -1)
            result = nums.length;
        else{
            for(int i = 0; i < nums.length; i++){
                if(nums[i] == -1){
                    result = i;
                    break;
                }
            }
        }
        return result;
    }
}
//[9,6,4,2,3,5,7,0,1] [_]
//[_,6,4,2,3,5,7,0,1] [9]
//[_,_,4,2,3,5,6,0,1] [9] tmp = 7
//[_,_,4,2,3,5,6,7,1] [9] tmp = 0
//[0,_,4,2,3,5,6,7,1] [9]
//[0,_,_,2,4,5,6,7,1] [9] tmp = 3
//[0,_,_,3,4,5,6,7,1] [9] tmp = 2
//[0,_,2,3,4,5,6,7,1] [9]
//[0,1,2,3,4,5,6,7,_] [9]

//最简单和容易理解的方法。
//[9,6,4,2,3,5,7,0,1] [_] -> sum1
//[0,1,2,3,4,5,6,7,8] [9] -> sum2
//result = sum2 - sum1