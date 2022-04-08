package code;

import java.util.*;

/**
 * @Author czgggggggg
 * @Date 2022/4/8
 * @Description
 */
public class Code0208 {
    public static void main(String[] args) {
//        Trie trie = new Trie();
//        trie.insert("apple");
//        System.out.println(trie.search("apple"));   // 返回 True
//        System.out.println(trie.search("app"));     // 返回 False
//        System.out.println(trie.startsWith("app")); // 返回 True
//        trie.insert("app");
//        System.out.println(trie.search("app"));     // 返回 True

        //第一次提交 栈溢出 的例子：
        //["Trie","insert","search","search","startsWith","startsWith","insert","search","startsWith","insert","search","startsWith"]
        //[[],["ab"],["abc"],["ab"],["abc"],["ab"],["ab"],["abc"],["abc"],["abc"],["abc"],["abc"]]
        Trie trie = new Trie();
        trie.insert("ab");
        System.out.println(trie.search("abc"));//false
        System.out.println(trie.search("ab"));//true
        System.out.println(trie.startsWith("abc"));//false
        System.out.println(trie.startsWith("ab"));//true
        trie.insert("ab");
        System.out.println(trie.search("abc"));//false
        System.out.println(trie.startsWith("abc"));//false
        trie.insert("abc");
        System.out.println(trie.search("abc"));//true
        System.out.println(trie.startsWith("abc"));//true

        //FTFT
    }
}
class Trie {
    HashMap<String, List<String>> map;

    public Trie() {
        map = new HashMap<>();
        List<String> list = new ArrayList<>();
        map.put("", list);
    }

    //插入相对比较麻烦
    public void insert(String word) {
        insert("",word);
    }
    public void insert(String start, String word) {
        List<String> list = map.get(start);

        boolean tag = false;
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            if(word.equals(next)){//注意可能存在重复插入同一个单词的情况
                return;
            }
            if(word.startsWith(next)){
               tag = true;
               insert(next,word);
            }
        }
        if(!tag && word.startsWith(start)){
            //start -> ?  //?代表以start为前缀，又以word为前缀的单词（此时都在start的list中，现在要将其转移到word的list中，并将word添加到start的list中）。

            //word -> ?
            iterator = list.iterator();
            HashSet<String> set = new HashSet<>();
            while(iterator.hasNext()){
                String next = iterator.next();
                if(next.startsWith(start) && next.startsWith(word)){
                    set.add(next);
                }
            }

            //此时set集合包括了所有 以start为前缀，又以word为前缀的单词。
            List<String> newList = new ArrayList<>();
            Iterator<String> set_iterator = set.iterator();
            while(set_iterator.hasNext()){
                String next = set_iterator.next();
                list.remove(next);
                newList.add(next);
            }

            //start -> word
            list.add(word);
            map.put(word,newList);
            map.put(start,list);
        }
    }

    public boolean search(String word) {
        return search("",word);
    }
    public boolean search(String start, String word) {
        if(start.equals(word))
            return true;
        else{
            List<String> list = map.get(start);
            Iterator<String> iterator = list.iterator();
            while(iterator.hasNext()){
                String next = iterator.next();
                if(search(next, word)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean startsWith(String prefix) {
        return startsWith("",prefix);
    }
    public boolean startsWith(String start, String prefix) {
        List<String> list = map.get(start);
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            if(next.startsWith(prefix))
                return true;
            else{
                if(prefix.startsWith(next)){
                    return startsWith(next, prefix);
                }
            }
        }
        return false;
    }
}
