package array;

/**
 * @Author czgggggggg
 * @Date 2021/8/31
 * @Description
 */
public class Array1299 {
    public static void main(String[] args) {
        int[] arr1 = {17,18,5,4,6,1};
        int[] result1 = replaceElements(arr1);
        for(int x1 : result1)
            System.out.print(x1 + " ");
        System.out.println();
        int[] arr2 = {1};
        int[] result2 = replaceElements(arr2);
        for(int x2 : result2)
            System.out.print(x2 + " ");
        System.out.println();
        int[] arr3 = {5,4,3,2,1};
        int[] result3 = replaceElements(arr3);
        for(int x3 : result3)
            System.out.print(x3 + " ");
        System.out.println();
        int[] arr4 = {1,2,3,4,5};
        int[] result4 = replaceElements(arr4);
        for(int x4 : result4)
            System.out.print(x4 + " ");
        System.out.println();
    }
    public static int[] replaceElements(int[] arr) {
        int[] result = new int[arr.length];
        result[arr.length - 1] = -1;
        int max = arr[arr.length - 1];
        for(int i = arr.length - 2; i >= 0; i--){
            result[i] = max;
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return result;
    }
}
