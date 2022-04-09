package meituan;

import java.util.Scanner;

/**
 * @Author czgggggggg
 * @Date 2022/4/9
 * @Description
 */
public class Code0005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] c1 = new int[n];
        for(int i = 0; i < n; i++)
            c1[i] = sc.nextInt();
        int m = sc.nextInt();
        int[] c2 = new int[m];
        for(int i = 0; i < m; i++)
            c2[i] = sc.nextInt();

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        int i = 0;
        int j = m - 1;
        int max = 0;
        while(i < n && j >= 0){
            sb1.append(String.valueOf(c1[i]));
//            sb1.append(" ");
//            sb2.append(String.valueOf(c2[j]),0,String.valueOf(c2[j]).length());
            sb2.insert(0,String.valueOf(c2[j]));
//            sb2.append(" ",0,1);

//            System.out.println(sb1.toString());
//            System.out.println(sb2.toString());

//            sb2.append(c2[j]);
//            sb2.append(" ");
            if(sb1.toString().equals(sb2.toString())){
                max = i + 1;
//                System.out.println("test---" + sb1.toString());
//                System.out.println("test---" + sb2.toString());
            }
            i++;
            j--;
        }

        int res = 0;
        res += (n - max);
        res += (m - max);
        System.out.println(res);
    }
}
//5
//1 5 3 4 6
//5
//2 1 5 3 4

//6
//1 5 3 4 6 7
//5
//2 1 5 3 4