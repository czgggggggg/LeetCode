package other;

import java.util.HashMap;

/**
 * @Author czgggggggg
 * @Date 2022/4/21
 * @Description
 */
public class Other0007 {
    public static void main(String[] args) {
//        LRUCache lruCache = new LRUCache(2);
//        lruCache.put(1,1);
//        lruCache.put(2,2);
//        System.out.println(lruCache.get(1));//1
//        System.out.println(lruCache.get(2));//2
//        lruCache.put(3,3);
//        System.out.println(lruCache.get(1));//-1
//        System.out.println(lruCache.get(3));//3

        LRUCache lruCache = new LRUCache(2);
        lruCache.put(1,1);
        lruCache.put(2,2);
        System.out.println(lruCache.get(1));//1
        lruCache.put(3,3);
        System.out.println(lruCache.get(2));//-1
        lruCache.put(4,4);
        System.out.println(lruCache.get(1));//-1
        System.out.println(lruCache.get(3));//3
        System.out.println(lruCache.get(4));//4
    }
}
class LRUCache{
    class DNode{
        int key;
        int value;
        DNode pre;
        DNode next;
        DNode(){
        }
        DNode(int key, int value){
            this.key = key;
            this.value = value;
        }
    }

    private DNode head;
    private DNode tail;
    private int size;
    private int capacity;
    private HashMap<Integer, DNode> cache = new HashMap<>();

    public LRUCache(int capacity){
        head = new DNode();
        tail = new DNode();
        size = 0;
        this.capacity = capacity;
        head.next = tail;
        tail.pre = head;
    }

    public int get(int value){
        DNode node = cache.get(value);
        if(node == null){
            return -1;
        }else{
            removeToHead(node);
            return node.value;
        }
    }

    public void put(int key, int value){
        DNode node = cache.get(key);
        if(node == null){
            DNode newNode = new DNode(key, value);
            cache.put(key, newNode);
            addHead(newNode);
            size++;
            if(size > capacity){
                DNode dNode = removeTail();
                cache.remove(dNode.key);
                size--;
            }
        }else{
            node.value = value;
            removeToHead(node);
        }
    }


    private void addHead(DNode node){//addToHead
        node.pre = head;
        node.next = head.next;
        head.next.pre = node;
        head.next = node;
    }
    private void removeToHead(DNode node){//moveToHead
        remove(node);
        addHead(node);
    }
    private void remove(DNode node){//removeNode
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }
    private DNode removeTail(){//
        DNode res = tail.pre;
        remove(res);
        return res;
    }
}