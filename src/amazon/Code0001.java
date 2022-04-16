package amazon;

import java.util.*;

/**
 * @Author czgggggggg
 * @Date 2022/4/16
 * @Description
 */
public class Code0001 {
    public static void main(String[] args) {
        List<Integer> locations = new ArrayList<>();
        List<Integer> movedFrom = new ArrayList<>();
        List<Integer> movedTo = new ArrayList<>();
        locations.add(1);
        locations.add(7);
        locations.add(6);
        locations.add(8);
        movedFrom.add(1);
        movedFrom.add(7);
        movedFrom.add(2);
        movedTo.add(2);
        movedTo.add(9);
        movedTo.add(5);
        List<Integer> res = findDataLocations(locations, movedFrom, movedTo);
        Iterator<Integer> iterator = res.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
    }
    public static List<Integer> findDataLocations(List<Integer> locations,
                                                  List<Integer> movedFrom, List<Integer> movedTo){

        Iterator<Integer> iterator0 = locations.iterator();
        HashSet<Integer> locations_set = new HashSet<>();
        while(iterator0.hasNext()){
            locations_set.add(iterator0.next());
        }
        Iterator<Integer> iterator1 = movedFrom.iterator();
        Iterator<Integer> iterator2 = movedTo.iterator();
        while(iterator1.hasNext()){
            Integer next1 = iterator1.next();
            Integer next2 = iterator2.next();
            locations_set.remove(next1);
            locations_set.add(next2);
        }

        Iterator<Integer> iterator = locations_set.iterator();
        List<Integer> res = new ArrayList<>();
        while(iterator.hasNext()){
            res.add(iterator.next());
        }

        Collections.sort(res);

        return res;
    }
}
