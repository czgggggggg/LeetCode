package xiecheng;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @Author czgggggggg
 * @Date 2022/3/24
 * @Description
 */
public class Test0003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();

        //双指针
        int i = 0, j = 0;
        int len = 1;//当前长度
        int max = 1;//最大长度
//        HashSet<Character> set = new HashSet<>();
        HashMap<Character,Integer> map = new HashMap<>();
        map.put(str.charAt(j),1);
        for(j = 1; j < n; j++){
            if(!map.keySet().contains(str.charAt(j))){
                if(map.keySet().size() == k){
//                    System.out.println((j - i) +  "---" + max);
                    max = Math.max(max, j - i);
                    while(i <= j){
                        map.put(str.charAt(i), map.get(str.charAt(i)) - 1);
                        if(map.get(str.charAt(i)) == 0){
                            map.keySet().remove(str.charAt(i));
                            i++;
                            break;
                        }
                        i++;
                    }
                }
                map.put(str.charAt(j),1);
            }else{
                map.put(str.charAt(j),map.get(str.charAt(j)) + 1);
            }
        }
//        System.out.println((j - i) +  "---" + max);
        max = Math.max(max, j - i);

        System.out.println(max);
    }

}
//17 3
//abbcccaaebcccaebc
//abbcccaa
//   cccaae
//      aaeb
//        ebccc
//         bccca
//          cccae
//             aeb
//              ebc
//8

//5 3
//aabcd
//4