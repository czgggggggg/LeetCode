package string;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author czgggggggg
 * @Date 2021/9/14
 * @Description
 */
public class String1773 {
    public static void main(String[] args) {
        List<String> list1_1 = new ArrayList<>();
        list1_1.add("phone");
        list1_1.add("blue");
        list1_1.add("pixel");
        List<String> list1_2 = new ArrayList<>();
        list1_2.add("computer");
        list1_2.add("silver");
        list1_2.add("lenovo");
        List<String> list1_3 = new ArrayList<>();
        list1_3.add("phone");
        list1_3.add("gold");
        list1_3.add("iphone");
        List<List<String>> items1 = new ArrayList<>();
        items1.add(list1_1);
        items1.add(list1_2);
        items1.add(list1_3);
        System.out.println(countMatches(items1,"color","silver"));

        List<String> list2_1 = new ArrayList<>();
        list2_1.add("phone");
        list2_1.add("blue");
        list2_1.add("pixel");
        List<String> list2_2 = new ArrayList<>();
        list2_2.add("computer");
        list2_2.add("silver");
        list2_2.add("phone");
        List<String> list2_3 = new ArrayList<>();
        list2_3.add("phone");
        list2_3.add("gold");
        list2_3.add("iphone");
        List<List<String>> items2 = new ArrayList<>();
        items2.add(list2_1);
        items2.add(list2_2);
        items2.add(list2_3);
        System.out.println(countMatches(items2,"type","phone"));
    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int tag = 0;
        if("type".equals(ruleKey))
            tag = 1;
        else if("color".equals(ruleKey))
            tag = 2;
        else if("name".equals(ruleKey))
            tag = 3;

        int count = 0;
        int count1;
        Iterator<List<String>> iterator = items.iterator();
        while(iterator.hasNext()){
            List<String> list = iterator.next();
            count1 = 0;
            Iterator<String> iterator1 = list.iterator();
            while(iterator1.hasNext()){
                String str = iterator1.next();
                count1++;
                if(count1 == tag){
                    if(str.equals(ruleValue)){
                        count++;
                    }
                    break;
                }
            }
        }

        return count;
    }
}
