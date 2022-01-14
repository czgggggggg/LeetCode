package code;

/**
 * @Author czgggggggg
 * @Date 2022/1/14
 * @Description
 */
public class Code0080 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};//1 1 2 2 3
//        int[] nums = {0,0,1,1,1,1,2,3,3};//0 0 1 1 2 3 3
//        int[] nums = {1};//1
//        int[] nums = {1,2};//1 2
//        int[] nums = {1,1};//1 1
//        int[] nums = {1,1,1};//1 1
//        int[] nums = {1,1,1,1,1,2,3,3,3,3,3};//1 1 2 3 3
//        int[] nums = {1,2,2,2,2,2,3};//1 2 2 3
        int res = removeDuplicates(nums);
        for(int i = 0; i < res; i++)
            System.out.print(nums[i] + " ");
        System.out.println();
    }
    public static int removeDuplicates(int[] nums) {
        int i, j;
        int count = 0;
        int curNum = nums[0];//当前的数字

        for(i = 0, j = 0; j < nums.length; j++){
            if(nums[j] == curNum){
                count++;
                if(count <= 2){
                    nums[i] = nums[j];
                    i++;
                }else{
                    //i保存不动
                }
            }else{
                curNum = nums[j];
                count = 1;//count重置
                nums[i] = nums[j];
                i++;
            }
        }

        return i;//注意此处不要减一
    }
}
//1 1 1 2 2 3
//0,0,1,1,1,1,2,3,3