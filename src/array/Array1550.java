package array;

/**
 * @Author czgggggggg
 * @Date 2021/9/5
 * @Description
 */
public class Array1550 {
    public static void main(String[] args) {
        int[] arr1 = {2,6,4,1};
        System.out.println(threeConsecutiveOdds(arr1));
        int[] arr2 = {1,2,34,3,4,5,7,23,12};
        System.out.println(threeConsecutiveOdds(arr2));
    }
    public static boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        for(int x : arr){
            if(x % 2 == 1){
                count++;
                if(count == 3)
                    return true;
            }else{
                count = 0;//偶数重置为0
            }
        }
        return false;
    }
}
