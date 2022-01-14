package code;

/**
 * @Author czgggggggg
 * @Date 2022/1/14
 * @Description
 */
public class Code0031 {
    public static void main(String[] args) {
        int[] nums1 = {1,4,3,2};
        nextPermutation(nums1);//2 1 3 4
        int[] nums2 = {2,4,3,1};
        nextPermutation(nums2);//3 1 2 4
        int[] nums3 = {3,4,2,1};
        nextPermutation(nums3);//4 1 2 3

        int[] nums4 = {2,3,1};
        nextPermutation(nums4);//3 1 2
        int[] nums5 = {2,3};
        nextPermutation(nums5);//3 2

        int[] nums6 = {1,2,3};
        nextPermutation(nums6);//1 3 2
        int[] nums7 = {3,2,1};
        nextPermutation(nums7);//1 2 3
        int[] nums8 = {1,1,5};
        nextPermutation(nums8);//1 5 1
        int[] nums9 = {1};
        nextPermutation(nums9);//1

        int[] nums10 = {1,5,1};
        nextPermutation(nums10);//5 1 1
        int[] nums11 = {5,1,1};
        nextPermutation(nums11);//1 1 5

        //通过测试用例：147 / 265
        int[] nums12 = {2,2,7,5,4,3,2,2,1};
        nextPermutation(nums12);//7 2 5 4 2 2 2 1 3 -> 2 3 1 2 2 2 4 5 7
    }
    public static void nextPermutation(int[] nums) {
        int len = nums.length;
        int tmp;

        boolean isDown = true;//是否为非递增序列的标志
        for(int i = 0; i < len - 1; i++){
            if(nums[i] < nums[i + 1]){
                isDown = false;
                break;
            }
        }

        if(isDown){//开始就是非递增序列的情况  3,2,1 -> 1,2,3
            //全部反转
            for(int i = 0; i < len/2 ; i++){
                tmp = nums[i];
                nums[i] = nums[len - 1 - i];
                nums[len - 1 - i] = tmp;
            }
        }else{
            if(nums[len - 2] < nums[len - 1]){
                tmp = nums[len - 1];
                nums[len - 1] = nums[len - 2];
                nums[len - 2] = tmp;
            }//这个分支就过滤掉了一半的情况
            else{
                for(int i = len - 2; i >= 0; i--){
                    if(nums[i + 1] > nums[i]){//定位i   例如1432中i就是1所在的位置
//                        System.out.println("test1---" + nums[i] + "---" + nums[len - 1]);
                        //交换
                        for(int j = len - 1; j > i; j--){
                            if(nums[j] > nums[i]){
//                            System.out.println("test2---" + nums[j]);
                                tmp = nums[i];
                                nums[i] = nums[j];
                                nums[j] = tmp;
                                break;//
                            }
                        }
                        //反转
                        for(int j = i + 1; j <= (i + len)/2; j++){//((i + 1) + (len - 1)) / 2 = (i + len)/2
                            tmp = nums[j];
                            nums[j] = nums[i + len - j];
                            nums[i + len - j] = tmp;
                        }
                        break;//第一次提交错误的地方，少了break。
                    }
                }
            }
        }

        //测试
//        for(int num : nums)
//            System.out.print(num + " ");
//        System.out.println();
    }
}

//我的极简思路：
//分支1：
//  4 3 2 1  数组元素全部降序 -> 将数组元素全部升序 -> 1 2 3 4
//分支2.1：
//  2 4 1 3    最后两个数升序 -> 将最后两个数降序 -> 2 4 3 1
//  2 4 3 1
//分支2.2：
//  2 4 3 1    4 3 1降序  交换2、3（3是比2大的数中最小的） -> 3 4 2 1 -> 将4 2 1升序 -> 3 1 2 4
//  3 1 2 4


//执行结果：
//解答错误
//显示详情
//添加备注
//
//通过测试用例：
//147 / 265
//输入：
//[2,2,7,5,4,3,2,2,1]
//输出：
//[7,2,5,4,2,2,2,1,3]
//预期结果：
//[2,3,1,2,2,2,4,5,7]

