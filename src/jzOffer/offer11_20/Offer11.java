package jzOffer.offer11_20;
/**
* @Author czgggggggg
* @Date 2021/2/9
* @Description 旋转数组的最小数字
* @Since version-1.0
*/
public class Offer11 {
    public static void main(String[] args) {
        int[] numbers1 = {3, 4, 5, 1, 2};
        System.out.println(minArray(numbers1));
        int[] numbers2 = {2, 2, 2, 0, 1};
        System.out.println(minArray(numbers2));
        int[] numbers3 = {0, 1, 2, 3, 4};
        System.out.println(minArray(numbers3));
    }
    //分析:
    //[3,4,5,1,2] [2,2,2,0,1] [0,1,2,3,4]
    public static int minArray(int[] numbers) {
        for(int i = 0; i < numbers.length - 1; i++){//旋转数组的元素非递增的情况
            if(numbers[i] > numbers[i + 1]){
                return numbers[i + 1];
            }
        }
        return numbers[0];//旋转数组的元素递增的情况
    }
}
