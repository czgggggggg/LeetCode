package math;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author czgggggggg
 * @Date 2021/9/18
 * @Description
 */
public class Math0728 {
    public static void main(String[] args) {
        List<Integer> list = selfDividingNumbers(1, 22);
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext())
            System.out.print(iterator.next() + " ");
        System.out.println();
    }
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i = left; i <= right; i++){
            if(isZCS(i))
                list.add(i);
        }
        return list;
    }
    public static boolean isZCS(int num){
        int tmp = num;
        while(num != 0){
            if(num % 10 == 0)//自除数不允许包含0
                return false;
            if((tmp % (num % 10)) != 0)//因为有前面的判断处理，所以这里不会发生除零异常。
                return false;
            num /= 10;
        }
        return true;
    }
}
