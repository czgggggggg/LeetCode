package string;

/**
 * @Author czgggggggg
 * @Date 2021/9/15
 * @Description
 */
public class String1869 {
    public static void main(String[] args) {
        System.out.println(checkZeroOnes("1101"));
        System.out.println(checkZeroOnes("111000"));
        System.out.println(checkZeroOnes("110100010"));
        System.out.println(checkZeroOnes("1"));
        System.out.println(checkZeroOnes("01"));
    }
    public static boolean checkZeroOnes(String s) {
        int count_0 = 0;
        int count_1 = 0;
        int max_0 = 0;
        int max_1 = 0;

        if(s.charAt(0) == '1')
            count_1++;
        else
            count_0++;

        if(s.length() == 1)
            return count_1 > count_0;

        if(s.length() > 1){
            for(int i = 1; i < s.length(); i++){
                if(s.charAt(i) != s.charAt(i-1)){
                    if(s.charAt(i) == '0'){//1 -> 0
                        if(max_1 < count_1)
                            max_1 = count_1;
                        count_1 = 0;
                        count_0 = 1;
                    }else{//0 -> 1
                        if(max_0 < count_0)
                            max_0 = count_0;
                        count_0 = 0;
                        count_1 = 1;
                    }
                }else{
                    if(s.charAt(i) == '0'){//0 -> 0
                        count_0++;
                    }else{//1 -> 1
                        count_1++;
                    }
                }
            }
            //针对最后一个字符还要进行一次最大值的处理
            if(s.charAt(s.length() - 1) == '0'){
                if(max_0 < count_0)
                    max_0 = count_0;
            }else{
                if(max_1 < count_1)
                    max_1 = count_1;
            }
        }

//        System.out.println("max_1 = " + max_1 + ", max_0 = " + max_0);
        return max_1 > max_0;
    }
}
