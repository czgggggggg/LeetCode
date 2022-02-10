package code;

/**
 * @Author czgggggggg
 * @Date 2022/2/10
 * @Description
 */
public class Code1356 {
    public static void main(String[] args) {
        int[] arr1 = {0,1,2,3,4,5,6,7,8};
        int[] res1 = sortByBits(arr1);
        for(int res : res1)
            System.out.print(res + " ");
        System.out.println();

        int[] arr2 = {1024,512,256,128,64,32,16,8,4,2,1};
        int[] res2 = sortByBits(arr2);
        for(int res : res2)
            System.out.print(res + " ");
        System.out.println();

        int[] arr3 = {10000,10000};
        int[] res3 = sortByBits(arr3);
        for(int res : res3)
            System.out.print(res + " ");
        System.out.println();

        int[] arr4 = {2,3,5,7,11,13,17,19};
        int[] res4 = sortByBits(arr4);
        for(int res : res4)
            System.out.print(res + " ");
        System.out.println();

        int[] arr5 = {10,100,1000,10000};
        int[] res5 = sortByBits(arr5);
        for(int res : res5)
            System.out.print(res + " ");
        System.out.println();

        int[] arr6 = {0};
        int[] res6 = sortByBits(arr6);
        for(int res : res6)
            System.out.print(res + " ");
        System.out.println();
    }

    public static int[] sortByBits(int[] arr) {
        int n = arr.length;
        int[] oneCount = new int[n];

        for(int i = 0; i < n; i++){
            oneCount[i] = oneCount(arr[i]);
        }

//        Arrays.sort(arr);
        int tmp;
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if(oneCount[i] > oneCount[j]){
                    tmp = oneCount[i];
                    oneCount[i] = oneCount[j];
                    oneCount[j] = tmp;
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }else if(oneCount[i] == oneCount[j]){
                    if(arr[i] > arr[j]){
                        tmp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tmp;
                    }
                }
            }
        }

        return arr;
    }

    public static int oneCount(int num){
        int count = 0;
        while(num != 0){
            if(num % 2 == 1)
                count++;
            num /= 2;
        }
        return count;
    }
}
