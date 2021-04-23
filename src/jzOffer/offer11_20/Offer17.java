package jzOffer.offer11_20;
/**
* @Author czgggggggg
* @Date 2021/2/15
* @Description 打印从1到最大的n位数
* @Since version-1.0
*/
public class Offer17 {
    public static void main(String[] args) {
        int[] arr = printNumbers(1);
        System.out.print("[");
        for(int i = 0; i < arr.length - 1; i++){
            System.out.print(arr[i] + ",");
        }
        System.out.println(arr[arr.length - 1] + "]");
    }
    public static int[] printNumbers(int n) {
        int num = 1;
        while(n != 0){
            num *= 10;
            n--;
        }
        int[] arr = new int[num - 1];
        for(int i = 0; i < num - 1; i++){
            arr[i] = i + 1;
        }
        return arr;
    }
}
