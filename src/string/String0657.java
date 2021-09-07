package string;

/**
 * @Author czgggggggg
 * @Date 2021/9/7
 * @Description
 */
public class String0657 {
    public static void main(String[] args) {
        System.out.println(judgeCircle("UD"));//true
        System.out.println(judgeCircle("LL"));//false
        System.out.println(judgeCircle("UDLR"));//true
        System.out.println(judgeCircle(""));//true
    }
    public static boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        char ch;
        for(int i = 0; i < moves.length(); i++){
            ch = moves.charAt(i);
            if(ch == 'U')//上
                y++;
            else if(ch == 'D')//下
                y--;
            else if(ch == 'L')//左
                x--;
            else if(ch == 'R')//右
                x++;
        }

        if(x == 0 && y == 0)
            return true;
        return false;
    }
}
