package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author czgggggggg
 * @Date 2021/9/24
 * @Description
 */
public class List0706 {
    public static void main(String[] args) {
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(1, 1); // The map is now [[1,1]]
        myHashMap.put(2, 2); // The map is now [[1,1], [2,2]]
        myHashMap.get(1);    // return 1, The map is now [[1,1], [2,2]]
        myHashMap.get(3);    // return -1 (i.e., not found), The map is now [[1,1], [2,2]]
        myHashMap.put(2, 1); // The map is now [[1,1], [2,1]] (i.e., update the existing value)
        myHashMap.get(2);    // return 1, The map is now [[1,1], [2,1]]
        myHashMap.remove(2); // remove the mapping for 2, The map is now [[1,1]]
        myHashMap.get(2);    // return -1 (i.e., not found), The map is now [[1,1]]
    }
}
class MyHashMap {

    /** Initialize your data structure here. */
    List<Integer[]> list;

    public MyHashMap() {
        list = new ArrayList<>();
    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
        boolean flag = true;
        Integer[] integers;
        Iterator<Integer[]> iterator = list.iterator();
        while(iterator.hasNext()){
            integers = iterator.next();
            if(integers[0] == key){
                integers[1] = value;
                flag = false;
                break;
            }
        }
        if(flag){
            Integer[] newIntegers = {key,value};
            list.add(newIntegers);
        }
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        Integer[] integers;
        Iterator<Integer[]> iterator = list.iterator();
        while(iterator.hasNext()){
            integers = iterator.next();
            if(integers[0] == key)
                return integers[1];
        }
        return -1;
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        Integer[] integers;
        Iterator<Integer[]> iterator = list.iterator();
        while(iterator.hasNext()){
            integers = iterator.next();
            if(integers[0] == key)
//                list.remove(integers);
                iterator.remove();
        }
    }
}
