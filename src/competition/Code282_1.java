package competition;

/**
 * @Author czgggggggg
 * @Date 2022/2/27
 * @Description
 */
public class Code282_1 {
    public static void main(String[] args) {
        String[] words1 = {"pay","attention","practice","attend"};
        String pref1 = "at";
        System.out.println(prefixCount(words1,pref1));

        String[] words2 = {"leetcode","win","loops","success"};
        String pref2 = "code";
        System.out.println(prefixCount(words2,pref2));
    }
    public static int prefixCount(String[] words, String pref) {
        int res = 0;
        for(String word : words){
            if(word.startsWith(pref))
                res++;
        }
        return res;
    }
}
