package alibaba;

import java.util.Scanner;

/**
 * @Author czgggggggg
 * @Date 2022/3/14
 * @Description
 */
public class Test0001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        char ch;
        for(int i = str.length() - 1; i >= 2; i--){
            ch = str.charAt(i);;
            if(ch == '0')
                count += 0;
            else if(ch == '1' || ch == '2' || ch == '4' || ch == '8')
                count += 1;
            else if(ch == '3' || ch == '5' || ch == '6' || ch == '9' || ch == 'a' || ch == 'c')
                count += 2;
            else if(ch == '7' || ch == 'b' || ch == 'd' || ch == 'e')
                count += 3;
            else if(ch == 'f')
                count += 4;
        }
        System.out.println(count);
    }
}

