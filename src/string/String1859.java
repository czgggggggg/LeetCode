package string;

/**
 * @Author czgggggggg
 * @Date 2021/9/15
 * @Description
 */
public class String1859 {
    public static void main(String[] args) {
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
        System.out.println(sortSentence("Myself2 Me1 I4 and3"));

        System.out.println(sortSentence("czgbyer4 is3 name2 My1"));
        System.out.println(sortSentence("czgggggggg1"));
    }
    public static String sortSentence(String s) {
        String[] strs = s.split(" ");
        String[] tmpArr = new String[strs.length];
        for(int i = 0; i < strs.length; i++){
//            System.out.println(strs[i].charAt(strs[i].length() - 1) - 48 - 1 + "---" + strs[i].substring(0,strs[i].length() - 1));
            tmpArr[strs[i].charAt(strs[i].length() - 1) - 48 - 1] = strs[i].substring(0,strs[i].length() - 1);
        }

        String result = "";
        for(int i = 0; i < tmpArr.length - 1; i++)
            result = result + tmpArr[i] + " ";
        result += tmpArr[tmpArr.length - 1];

        return result;
    }
}
