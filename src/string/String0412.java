package string;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author czgggggggg
 * @Date 2021/9/6
 * @Description
 */
public class String0412 {
    public static void main(String[] args) {
        List<String> strings = fizzBuzz(15);
        Iterator<String> iterator = strings.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    public static List<String> fizzBuzz(int n) {
        List<String> strings = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            if(i % 3 != 0 && i % 5 != 0){
                strings.add(String.valueOf(i));
            }else if(i % 3 == 0 && i % 5 != 0){
                strings.add("Fizz");
            }else if(i % 3 != 0 && i % 5 == 0){
                strings.add("Buzz");
            }else if(i % 3 == 0 && i % 5 == 0){
                strings.add("FizzBuzz");
            }
        }

        return strings;
    }
}
