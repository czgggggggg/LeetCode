package array;

/**
 * @Author czgggggggg
 * @Date 2021/8/25
 * @Description
 */
public class Array682 {
    public static void main(String[] args) {
        String[] ops1 = {"5","2","C","D","+"};
        System.out.println(calPoints(ops1));
        String[] ops2 = {"5","-2","4","C","D","9","+","+"};
        System.out.println(calPoints(ops2));
        String[] ops3 = {"1"};
        System.out.println(calPoints(ops3));
    }
    public static int calPoints(String[] ops) {
        int[] nums = new int[ops.length];
        int index = 0;
        for(int i = 0; i < ops.length; i++){
            if(ops[i].matches("[0-9]+") || ops[i].matches("-[0-9]+")){
                nums[index] = Integer.valueOf(ops[i]);
//                System.out.println("test---int---" + nums[index]);
                index++;
            }else{
                if("+".equals(ops[i])){
                    nums[index] = nums[index - 1] + nums[index - 2];
//                    System.out.println("test---+---" + nums[index]);
                    index++;
                }else if("D".equals(ops[i])){
                    nums[index] = nums[index - 1] * 2;
//                    System.out.println("test---*2---" + nums[index]);
                    index++;
                }else if("C".equals(ops[i])){
                    index--;
                }
            }
        }
        int sum= 0;
        for(int i = 0; i < index; i++){
            sum += nums[i];
        }
        return sum;
    }
}
//判断字符串包含的是纯数字str.matches("[0-9]+")
//整数字符串转化为整数Integer.valueOf()
//int类型的正则匹配表达式