package interview2;

/**
 * @Author czgggggggg
 * @Date 2022/2/27
 * @Description 微软笔试题2
 */
public class Microsoft0002 {
    public static void main(String[] args) {
        System.out.println(solution("dBacaAA","caBdaaA"));//5
        System.out.println(solution("zzzX","zzzX"));//10
        System.out.println(solution("abc","ABC"));//0
        System.out.println(solution("ZZXYOz","OOYXZZ"));//2
    }
    public static int solution(String A, String B) {
        int n = A.length();
        int res = 0;

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                if(isSimilar(A.substring(i, j + 1),B.substring(i, j + 1)))
                    res++;
            }
        }

        return res;
    }
    public static boolean isSimilar(String a, String b){
        int[] count1 = new int[52];
        int[] count2 = new int[52];
//        Arrays.fill(count1,0);
//        Arrays.fill(count2,0);
        for(int i = 0; i < 52; i++){
            count1[i] = 0;
            count2[i] = 0;
        }
        char ch;
        for(int i = 0; i < a.length(); i++){
            ch = a.charAt(i);
            if(ch >= 65 && ch <= 90)
                count1[ch - 65]++;
            else if(ch >= 97 && ch <= 122)
                count1[ch - 71]++;
        }
        for(int i = 0; i < b.length(); i++){
            ch = b.charAt(i);
            if(ch >= 65 && ch <= 90)
                count2[ch - 65]++;
            else if(ch >= 97 && ch <= 122)
                count2[ch - 71]++;
        }
        for(int i = 0; i < 52; i++){
            if(count1[i] != count2[i])
                return false;
        }
        return true;
    }
}
