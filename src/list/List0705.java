package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author czgggggggg
 * @Date 2021/9/24
 * @Description
 */
public class List0705 {
    public static void main(String[] args) {
        MyHashSet myHashSet = new MyHashSet();
        myHashSet.add(1);      // set = [1]
        myHashSet.add(2);      // set = [1, 2]
        myHashSet.contains(1); // return True
        myHashSet.contains(3); // return False, (not found)
        myHashSet.add(2);      // set = [1, 2]
        myHashSet.contains(2); // return True
        myHashSet.remove(2);   // set = [1]
        myHashSet.contains(2); // return False, (already removed)
    }
}
class MyHashSet {
    /** Initialize your data structure here. */
    List<Integer> list;

    public MyHashSet() {
        list = new ArrayList<>();
    }

    public void add(int key) {
        if(!contains(key)){
            list.add(key);
        }
    }

    public void remove(int key) {
        if(contains(key))
            list.remove(Integer.valueOf(key));
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            if(iterator.next().intValue() == key)
                return true;
        }
        return false;
    }
}