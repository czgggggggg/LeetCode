package array;

/**
 * @Author czgggggggg
 * @Date 2021/8/30
 * @Description
 */
public class Array1287 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,6,6,6,6,7,10};
        System.out.println(findSpecialInteger(arr1));//6
        int[] arr2 = {1};
        System.out.println(findSpecialInteger(arr2));//1
        int[] arr3 = {1,2};
        System.out.println(findSpecialInteger(arr3));//1
        int[] arr4 = {1,2,3,3,4};
        System.out.println(findSpecialInteger(arr4));//3
        int[] arr5 = {1,2,3,4,4};
        System.out.println(findSpecialInteger(arr5));//4
        int[] arr6 = {1,1,2,3,4};
        System.out.println(findSpecialInteger(arr6));//1
    }
    public static int findSpecialInteger(int[] arr) {
        double tag = (double)(arr.length) / 4;
        int currentNumber = arr[0];
        int currentCount = 1;
        if(arr.length <= 3)//这是有问题的
            return arr[0];
        int i = 1;
        while(i < arr.length){
            if(arr[i] == arr[i - 1]){
                currentCount++;
                if(currentCount > tag)
                    return currentNumber;
            }else{
                currentNumber = arr[i];
                currentCount = 1;
            }
            i++;
        }

        return 0;//根据题意，一定不会执行到这条语句。
    }
}
//如果是[1,2,3,4]呢？
//这道题题意不明确