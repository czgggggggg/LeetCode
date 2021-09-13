package string;

/**
 * @Author czgggggggg
 * @Date 2021/9/13
 * @Description
 */
public class String1528 {
    public static void main(String[] args) {
        int[] indices1 = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString("codeleet",indices1));
        int[] indices2 = {0,1,2};
        System.out.println(restoreString("abc",indices2));
        int[] indices3 = {3,1,4,2,0};
        System.out.println(restoreString("aiohn",indices3));
        int[] indices4 = {4,0,2,6,7,3,1,5};
        System.out.println(restoreString("aaiougrt",indices4));
        int[] indices5 = {1,0,2};
        System.out.println(restoreString("art",indices5));
        int[] indices6 = {0};
        System.out.println(restoreString("a",indices6));
    }
    public static String restoreString(String s, int[] indices) {
        char[] chars = new char[indices.length];
        for(int i = 0; i < indices.length; i++){
            chars[indices[i]] = s.charAt(i);
        }
        String result = "";
        for(int i = 0; i < chars.length; i++){
            result += chars[i];
        }

        return result;
    }
}
