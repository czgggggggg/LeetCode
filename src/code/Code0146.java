package code;

import java.util.HashMap;

/**
 * @Author czgggggggg
 * @Date 2022/3/31
 * @Description
 */
public class Code0146 {
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
        int vaule;
        DLinkedNode pre;
        DLinkedNode next;
        public DLinkedNode(){
        }
        public DLinkedNode(int _key, int _value){
            key = _key;
            vaule = _value;
        }
    }

    private HashMap<Integer, DLinkedNode> cache = new HashMap<Integer, DLinkedNode>();
    private int size;//大小
    private int capacity;//容量
    private DLinkedNode head, tail;//头尾节点

    public LRUCache(int capacity){
        this.size = 0;
        this.capacity = capacity;
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
        return node.vaule;
    }

    public void put(int key, int value){
        DLinkedNode node = cache.get(key);
        if(node == null){
            DLinkedNode newNode = new DLinkedNode(key, value);
            cache.put(key, newNode);
            addToHead(newNode);
            size++;
            if(size > capacity){
                DLinkedNode res = removeTail();
                cache.remove(res.key);
                size--;
            }
        }else{
            node.vaule = value;
            moveToHead(node);
        }
    }

    private void addToHead(DLinkedNode node){
        node.pre = head;
        node.next = head.next;
        head.next.pre = node;
        head.next = node;
    }

    private void removeNode(DLinkedNode node){
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }

    private void moveToHead(DLinkedNode node){
        removeNode(node);
        addToHead(node);
    }

    private DLinkedNode removeTail(){
        DLinkedNode res = tail.pre;
        removeNode(res);
        return res;
    }
}