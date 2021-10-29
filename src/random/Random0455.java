package random;

import java.util.Arrays;

/**
 * @Author czgggggggg
 * @Date 2021/10/29
 * @Description
 */
public class Random0455 {
    public static void main(String[] args) {
        //1
//        int[] g = {1,2,3};
//        int[] s = {1,1};
        //2
//        int[] g = {1,2};
//        int[] s = {1,2,3};
        //0
//        int[] g = {1,2};
//        int[] s = {};

        int[] g = {1,2,3,3,6,7,7,9,10};
//        int[] s = {1,1,1,1,1,1};//1
//        int[] s = {1,1,1,2,7,10};//4
//        int[] s = {1,1,1,2,10,10};//4
//        int[] s = {2,7,10};//3
        int[] s = {2,2,2};//2
        System.out.println(findContentChildren(g,s));
    }
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int count = 0;
        int index = 0;
        for(int i = 0; i < g.length; i++){
            if(index >= s.length)
                break;
            if(g[i] <= s[index]){
                count++;
                index++;
            }
            else{
                i--;
                index++;
            }
        }

        return count;
    }
}
