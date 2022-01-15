package code;

/**
 * @Author czgggggggg
 * @Date 2022/1/15
 * @Description
 */
public class Code1925 {
    public static void main(String[] args) {
        System.out.println(countTriples(5));
//        System.out.println(countTriples(10));
    }
    public static int countTriples(int n) {
        int res = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                for(int k = Math.max(i, j) + 1; k <= n; k++){
                    if(i * i + j * j == k * k){
//                        System.out.println("test1---" + i + " " + j + " " + k);
                        res++;
                        break;
                    }
                }
            }
        }
        return res;
    }
}
