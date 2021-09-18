package math;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @Author czgggggggg
 * @Date 2021/9/18
 * @Description
 */
public class Math0507 {
    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(28));
        System.out.println(checkPerfectNumber(6));
        System.out.println(checkPerfectNumber(496));
        System.out.println(checkPerfectNumber(8128));
        System.out.println(checkPerfectNumber(2));

        System.out.println(checkPerfectNumber(1));
        System.out.println(checkPerfectNumber(12672));
    }
    public static boolean checkPerfectNumber(int num) {
        HashSet<Integer> set = new HashSet<>();

        int tmp = (int)Math.sqrt(num);
        while(tmp != 0){
            if(num % tmp == 0){
                if(tmp != num)
                    set.add(tmp);
                if(num / tmp != num)
                    set.add(num / tmp);
            }
            tmp--;
        }

        int sum = 0;
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
//            System.out.println(iterator.next());
            sum += iterator.next();
        }

        return num == sum;
    }
}
