package test.test;

import java.util.HashMap;

/**
 * @Author czgggggggg
 * @Date 2022/4/15
 * @Description
 */
public class Code0146_2 {
    public static void main(String[] args) {
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
    class DLinkedNode{
        int key;
        int value;
        DLinkedNode pre;
        DLinkedNode next;
        public DLinkedNode() {
        }
        public DLinkedNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private HashMap<Integer, DLinkedNode> cache = new HashMap<>();
    private DLinkedNode head, tail;
    private int size;
    private int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        head = new DLinkedNode();
        tail = new DLinkedNode();
        head.next = tail;
        tail.pre = head;
    }

    public int get(int key){
        DLinkedNode node = cache.get(key);
        if(node == null)
            return -1;
        moveToHead(node);
        return node.value;
    }

    public void put(int key, int value){
        DLinkedNode node = cache.get(key);
        if(node == null){
            DLinkedNode newNode = new DLinkedNode(key, value);
            addToHead(newNode);
            cache.put(key, newNode);
            size++;
            if(size > capacity){
                DLinkedNode res = removeTail();
                cache.remove(res.key);
                size--;
            }
        }else{
            node.value = value;
            cache.put(key, node);
            moveToHead(node);
        }
    }

    private void addToHead(DLinkedNode node){
        node.pre = head;
        node.next = head.next;
        head.next = node;
        node.next.pre = node;
    }

    private void moveToHead(DLinkedNode node){
        removeNode(node);
        addToHead(node);
    }

    private void removeNode(DLinkedNode node){
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }

    private DLinkedNode removeTail(){
        DLinkedNode res = tail.pre;
        tail = tail.pre;
        return res;
    }
}