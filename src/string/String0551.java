package string;

/**
 * @Author czgggggggg
 * @Date 2021/9/7
 * @Description
 */
public class String0551 {
    public static void main(String[] args) {
        System.out.println(checkRecord("PPALLP"));//true
        System.out.println(checkRecord("PPALLL"));//false
        System.out.println(checkRecord("LL"));//true
        System.out.println(checkRecord("LLL"));//false
        System.out.println(checkRecord("AA"));//false
        System.out.println(checkRecord("PAPAPPP"));//false
        System.out.println(checkRecord("PLPLPLPLPLPLPLPL"));//true
        System.out.println(checkRecord("LALL"));//true
    }
    public static boolean checkRecord(String s) {
        int countA = 0;//缺勤天数
        int countL = 0;//连续迟到天数
        char ch;
        for(int i = 0; i < s.length(); i++){
            ch = s.charAt(i);
            if(ch == 'A'){
                countA++;
                countL = 0;//第一次提交错在少了这条语句。LALL也是成立的。
                if(countA >= 2)
                    return false;
            }else if(ch == 'L'){
                countL++;
                if(countL >= 3)
                    return false;
            }else if(ch == 'P')
                countL = 0;
        }

        return true;
    }
}
