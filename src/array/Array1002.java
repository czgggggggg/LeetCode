package array;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author czgggggggg
 * @Date 2021/8/27
 * @Description
 */
public class Array1002 {
    public static void main(String[] args) {
        String[] words1 = {"bella","label","roller"};
        List<String> ans1 = commonChars(words1);
        for(String str1 : ans1){
            System.out.print(str1 + " ");
        }
        System.out.println();
        String[] words2 = {"cool","lock","cook"};
        List<String> ans2 = commonChars(words2);
        for(String str2 : ans2){
            System.out.print(str2 + " ");
        }
        System.out.println();
        String[] words3 = {"c"};
        List<String> ans3 = commonChars(words3);
        for(String str3 : ans3){
            System.out.print(str3 + " ");
        }
    }
    public static List<String> commonChars(String[] words) {
        int[][] tmp_arr = new int[words.length][26];
        for(int i = 0; i < tmp_arr.length; i++){
            for(int j = 0; j < 26; j++){
                tmp_arr[i][j] = 0;//初始化为0
            }
        }
        for(int i = 0; i < words.length; i++){
            for(int j = 0; j < words[i].length(); j++){
                tmp_arr[i][words[i].charAt(j) - 97]++;
            }
        }

        List<String> ans = new ArrayList<>();
        boolean b;
        for(int j = 0; j < 26; j++){
            b = true;
            int min = Integer.MAX_VALUE;
            for(int i = 0; i < tmp_arr.length; i++){
                if(tmp_arr[i][j] != 0){
                    if(min > tmp_arr[i][j]){
                        min = tmp_arr[i][j];
                    }
                }else{
                    b = false;
                }
            }
            if(b){//没有在所有字符串中都出现则不考虑
                for(int i = 0; i < min; i++){
                    ans.add(String.valueOf((char) (97 + j)));
                }
            }
        }

        return ans;
    }
}
