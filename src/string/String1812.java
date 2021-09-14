package string;

import java.util.HashMap;

/**
 * @Author czgggggggg
 * @Date 2021/9/14
 * @Description
 */
public class String1812 {
    public static void main(String[] args) {
        System.out.println(squareIsWhite("a1"));
        System.out.println(squareIsWhite("h3"));
        System.out.println(squareIsWhite("c7"));

        System.out.println(squareIsWhite("a1"));
        System.out.println(squareIsWhite("a2"));
        System.out.println(squareIsWhite("b1"));
        System.out.println(squareIsWhite("h7"));
        System.out.println(squareIsWhite("h8"));
        System.out.println(squareIsWhite("g8"));
        System.out.println(squareIsWhite("f8"));
    }
    public static boolean squareIsWhite(String coordinates) {
        HashMap<Character,Integer> hashMap = new HashMap<>();
        hashMap.put('a',1);
        hashMap.put('b',2);
        hashMap.put('c',3);
        hashMap.put('d',4);
        hashMap.put('e',5);
        hashMap.put('f',6);
        hashMap.put('g',7);
        hashMap.put('h',8);
        boolean[][] map = new boolean[8][8];
        for(int i = 0; i < 8; i++){
            if(i % 2 == 0){
                for(int j = 0; j < 8; j += 2){
                    map[i][j] = false;
                }
                for(int j = 1; j < 8; j += 2){
                    map[i][j] = true;
                }
            }else{
                for(int j = 0; j < 8; j += 2){
                    map[i][j] = true;
                }
                for(int j = 1; j < 8; j += 2){
                    map[i][j] = false;
                }
            }
        }

        return map[hashMap.get(coordinates.charAt(0)) - 1][coordinates.charAt(1) - 48 - 1];
    }
}
