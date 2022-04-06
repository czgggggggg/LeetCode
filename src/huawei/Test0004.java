package huawei;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @Author czgggggggg 耻辱 100*15% + 200*5% = 15 + 10 = 25
 * @Date 2022/4/6
 * @Description  出现频率 -> 标题中的出现频率 -> 标题中的先后顺序 -> 正文中的先后顺序
 */
public class Test0004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();
        String biaoti;//标题  3
        String wenzhang;//文章内容  1
        HashMap<String, Integer> map_all = new HashMap<>();
        HashMap<String, Integer> map_biaoti = new HashMap<>();//jilu
        HashMap<String, Integer> map_biaoti_index = new HashMap<>();
        HashMap<String, Integer> map_wenzhang_index = new HashMap<>();

        int biaoti_index_z = 0;
        int wenzhang_index_z = 0;

        while(m > 0){
            biaoti = sc.nextLine();
            String[] split1 = biaoti.split(" ");
            for(String str : split1){
                if(!map_all.containsKey(str)){
                    map_all.put(str, 3);
                }else{
                    map_all.put(str, map_all.get(str) + 3);
                }
                if(!map_biaoti.containsKey(str)){
                    map_biaoti.put(str, 3);
                }else{
                    map_biaoti.put(str, map_biaoti.get(str) + 3);
                }
                if(!map_biaoti_index.containsKey(str)){
                    map_biaoti_index.put(str,biaoti_index_z);
                }

                biaoti_index_z++;
            }

            wenzhang = sc.nextLine();
            String[] split2 = wenzhang.split(" ");
            for(String str : split2){
                if(!map_all.containsKey(str)){
                    map_all.put(str, 1);
                }else{
                    map_all.put(str, map_all.get(str) + 1);
                }
                if(!map_wenzhang_index.containsKey(str)){
                    map_wenzhang_index.put(str,wenzhang_index_z);
                }

                wenzhang_index_z++;
            }

            m--;
        }

        Iterator<String> iterator = map_all.keySet().iterator();
        int size = map_all.size();
        Word[] words = new Word[size];
        int t = 0;
        int all_count = 0;
        int biaoti_count = 0;
        int biaoti_index = 0;
        int wenzhang_index = 0;
        while(iterator.hasNext()){
            String next = iterator.next();
            all_count = map_all.get(next);
            if(map_biaoti.containsKey(next))
                biaoti_count = map_biaoti.get(next);
            if(map_biaoti_index.containsKey(next))
                biaoti_index = map_biaoti_index.get(next);
            if(map_wenzhang_index.containsKey(next))
                wenzhang_index = map_wenzhang_index.get(next);
            words[t++] = new Word(next,all_count,biaoti_count,biaoti_index,wenzhang_index);
        }

        sort(words);

        for(int i = 0; i < size; i++){
            System.out.println(words[i].str + ": " + words[i].all_count + " " + words[i].biaoti_count + " " + words[i].biaoti_index + " " + words[i].wenzhang_index);
        }

        for(int i = 0; i < n - 1; i++){
            System.out.print(words[i].str + " ");
        }
        System.out.println(words[n - 1].str);
    }

    //排序
    public static void sort(Word[] words){
        int n = words.length;
        Word tmp;
        for(int i = n - 1; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                if(words[j - 1].all_count < words[j].all_count){
                    tmp = words[j - 1];
                    words[j - 1] = words[j];
                    words[j] = tmp;
                }else if(words[j - 1].all_count == words[j].all_count){
                    if(words[j - 1].biaoti_count < words[j].biaoti_count){
                        tmp = words[j - 1];
                        words[j - 1] = words[j];
                        words[j] = tmp;
                    }else if(words[j - 1].biaoti_count == words[j].biaoti_count){
                        if(words[j - 1].biaoti_index > words[j].biaoti_index){
                            tmp = words[j - 1];
                            words[j - 1] = words[j];
                            words[j] = tmp;
                        }else if(words[j - 1].biaoti_index == words[j].biaoti_index){
                            if(words[j - 1].wenzhang_index > words[j].wenzhang_index){
                                tmp = words[j - 1];
                                words[j - 1] = words[j];
                                words[j] = tmp;
                            }
                        }
                    }
                }
            }
        }
    }
}
class Word{
    //出现频率 -> 标题中的出现频率 -> 标题中的先后顺序 -> 正文中的先后顺序
    public String str;//单词
    public int all_count;
    public int biaoti_count;
    public int biaoti_index;
    public int wenzhang_index;

    public Word() {

    }

    public Word(String str, int all_count, int biaoti_count, int biaoti_index, int wenzhang_index) {
        this.str = str;
        this.all_count = all_count;
        this.biaoti_count = biaoti_count;
        this.biaoti_index = biaoti_index;
        this.wenzhang_index = wenzhang_index;
    }
}
//3 2
//xinguan feiyan xinzeng bendi quezhen anli
//ju baodao chengdu xinzeng xinguan feiyan bendi quezhen anli yili shenzhen xinzeng bendi quezhen anli liangli yiqing zhengti kongzhi lianghao
//xinguan yimiao linchang shiyan
//wuzhong xinguan yimiao tongguo sanqi linchuang shiyan xiaoguo lianghao

//xinguan xinzeng bendi

//1 2
//xinguan feiyan xinzeng bendi quezhen anli
//ju baodao chengdu xinzeng xinguan feiyan bendi quezhen anli yili shenzhen xinzeng bendi quezhen anli liangli yiqing zhengti kongzhi lianghao
//xinguan yimiao linchang shiyan
//wuzhong xinguan yimiao tongguo sanqi linchuang shiyan xiaoguo lianghao

//xinguan