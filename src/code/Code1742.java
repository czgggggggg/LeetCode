package code;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @Author czgggggggg
 * @Date 2022/2/8
 * @Description
 */
public class Code1742 {
    public static void main(String[] args) {
        System.out.println(countBalls(1,10));//2
        System.out.println(countBalls(5,15));//2
        System.out.println(countBalls(19,28));//2

        System.out.println(countBalls(1,1));//1
    }

    public static int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int toNum;
        for(int i = lowLimit; i <= highLimit; i++){
            toNum = changeNumber(i);
            if(!map.keySet().contains(toNum)){
                map.put(toNum, 1);
            }else{
                map.put(toNum, map.get(toNum) + 1);
            }
        }

        int max = 0;
        Iterator<Integer> iterator = map.keySet().iterator();
        while(iterator.hasNext()){
            Integer next = iterator.next();
            if(map.get(next) > max){
                max = map.get(next);
            }
        }

        return max;
    }

    public static int changeNumber(int num){
        int res = 0;
        while(num != 0){
            res += (num % 10);
            num /= 10;
        }
        return res;
    }
}
//997 998 999 1000 1001 1002
//25 26 27 1 2 3