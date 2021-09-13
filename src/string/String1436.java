package string;

import java.util.*;

/**
 * @Author czgggggggg
 * @Date 2021/9/13
 * @Description
 */
public class String1436 {
    public static void main(String[] args) {
//        List<List<String>> paths = new ArrayList<>();
//        ArrayList<String> path1 = new ArrayList<>();
//        path1.add("London");
//        path1.add("New York");
//        ArrayList<String> path2 = new ArrayList<>();
//        path2.add("New York");
//        path2.add("Lima");
//        ArrayList<String> path3 = new ArrayList<>();
//        path3.add("Lima");
//        path3.add("Sao Paulo");
//        paths.add(path1);
//        paths.add(path2);
//        paths.add(path3);
//        System.out.println(destCity(paths));

//        List<List<String>> paths = new ArrayList<>();
//        ArrayList<String> path1 = new ArrayList<>();
//        path1.add("B");
//        path1.add("C");
//        ArrayList<String> path2 = new ArrayList<>();
//        path2.add("D");
//        path2.add("B");
//        ArrayList<String> path3 = new ArrayList<>();
//        path3.add("C");
//        path3.add("A");
//        paths.add(path1);
//        paths.add(path2);
//        paths.add(path3);
//        System.out.println(destCity(paths));

        List<List<String>> paths = new ArrayList<>();
        ArrayList<String> path1 = new ArrayList<>();
        path1.add("A");
        path1.add("Z");
        paths.add(path1);
        System.out.println(destCity(paths));


    }
    public static String destCity(List<List<String>> paths) {
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();

        for(List<String> path : paths){
            Iterator<String> iterator = path.iterator();
            hashSet.add(iterator.next());
            hashSet2.add(iterator.next());
        }

        String result = "";
        String str;
        Iterator<String> iterator = hashSet2.iterator();
        while (iterator.hasNext()){
            str = iterator.next();
            if(!hashSet.contains(str))
                result = str;
        }

        return result;
    }
}
