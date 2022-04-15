package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author czgggggggg
 * @Date 2022/4/12
 * @Description
 */
public class Test3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("苹果");
        list.add("西瓜");
        List<String> list2 = Collections.unmodifiableList(list);
        list.add("橘子");
        System.out.println(list);
        System.out.println(list2);
    }
}
