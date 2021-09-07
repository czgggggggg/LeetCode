package string;

import java.util.*;

/**
 * @Author czgggggggg
 * @Date 2021/9/7
 * @Description
 */
public class String0599 {
    public static void main(String[] args) {
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
        String[] result1 = findRestaurant(list1, list2);
        for(String str : result1)
            System.out.print(str + "---");
        System.out.println();//Shogun---
        String[] list3 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list4 = {"KFC", "Shogun", "Burger King"};
        String[] result2 = findRestaurant(list3, list4);
        for(String str : result2)
            System.out.print(str + "---");
        System.out.println();//Shogun---
        String[] list5 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list6 = {"Tapioca Express","KFC", "Shogun", "Burger King"};
        String[] result3 = findRestaurant(list5, list6);
        for(String str : result3)
            System.out.print(str + "---");
        System.out.println();//Tapioca Express---
        String[] list7 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list8 = {"Burger King", "Tapioca Express", "Shogun", "KFC"};
        String[] result4 = findRestaurant(list7, list8);
        for(String str : result4)
            System.out.print(str + "---");
        System.out.println();//Shogun---Tapioca Express---Burger King---
    }
    public static String[] findRestaurant(String[] list1, String[] list2) {
        List<String> list = new ArrayList<>();

        HashMap<String,Integer> hashMap = new HashMap<>();
        for(int i = 0; i < list2.length; i++){
            hashMap.put(list2[i],i);
        }

        int min_index_sum = Integer.MAX_VALUE;
        int index_sum;
        for(int i = 0; i < list1.length; i++){
            if(hashMap.keySet().contains(list1[i])){
                index_sum = i + hashMap.get(list1[i]);
                if(index_sum < min_index_sum){
                    min_index_sum = index_sum;
                    list.clear();
                    list.add(list1[i]);
                }else if(index_sum == min_index_sum){
                    list.add(list1[i]);
                }
            }
        }

        String[] result = new String[list.size()];
        int count = 0;
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            result[count++] = iterator.next();
        }

        return result;
    }
}
