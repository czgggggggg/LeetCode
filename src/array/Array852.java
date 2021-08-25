package array;

/**
 * @Author czgggggggg
 * @Date 2021/8/25
 * @Description
 */
public class Array852 {
    public static void main(String[] args) {
        int[] arr1 = {0,1,0};
        System.out.println(peakIndexInMountainArray(arr1));
        int[] arr2 = {0,2,1,0};
        System.out.println(peakIndexInMountainArray(arr2));
        int[] arr3 = {0,10,5,2};
        System.out.println(peakIndexInMountainArray(arr3));
        int[] arr4 = {3,4,5,1};
        System.out.println(peakIndexInMountainArray(arr4));
        int[] arr5 = {24,69,100,99,79,78,67,36,26,19};
        System.out.println(peakIndexInMountainArray(arr5));
        int[] arr6 = {3,5,3,2,0};
        System.out.println(peakIndexInMountainArray(arr6));
        int[] arr7 = {0,2,3,5,3};
        System.out.println(peakIndexInMountainArray(arr7));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int mid;
        while(low <= high){
            mid = (low + high) / 2;
            if(mid == 0){//第一次提交没有AC的原因：没有考虑mid == 0或者mid == arr.length - 1的情况，导致数组越界。
                if(arr[1] > arr[0] && arr[1] > arr[2])
                    return 1;
            }
            else if(mid == arr.length - 1){
                if(arr[arr.length - 2] > arr[arr.length - 1] && arr[arr.length - 2] > arr[arr.length - 3])
                    return arr.length - 2;
            }else{
                if(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]){
                    return mid;
                }else if(arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]){
                    low = mid + 1;
                }else if(arr[mid] < arr[mid - 1] && arr[mid] > arr[mid + 1]){
                    high = mid - 1;
                }
            }
        }
        return 0;//一定不会执行到这条语句。
    }
}
