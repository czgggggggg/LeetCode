package string;

/**
 * @Author czgggggggg
 * @Date 2021/9/5
 * @Description
 */
public class String168 {
    public static void main(String[] args) {
        int columnNumber = 701;//26*26+25
//        System.out.println((char)((columnNumber / 26) + 64));
//        System.out.println((char)((columnNumber % 26) + 64));
//        System.out.println((char)(26 + 64));
//        System.out.println(convertToTitle(701));//ZY 26*26+25
        System.out.println(convertToTitle(1));//A
        System.out.println(convertToTitle(26));//Z
        System.out.println(convertToTitle(26 + 1));//AA
        System.out.println(convertToTitle(26 + 26));//AZ
        System.out.println(convertToTitle(26*2 + 1));//BA
        System.out.println(convertToTitle(26*2 + 26));//BZ
        System.out.println(convertToTitle(676));//YZ 26*25 + 26
        System.out.println(convertToTitle(677));//ZA 26*26 + 1
        System.out.println(convertToTitle(701));//ZY 26*26+25
        System.out.println(convertToTitle(702));//ZZ 26*26+26
        System.out.println(convertToTitle(26*26*26 + 26*26 + 26));//ZZZ
        System.out.println(convertToTitle(26*26*26 + 26*26 + 26 + 1));//AAAA

        System.out.println(convertToTitle(1));//A
        System.out.println(convertToTitle(28));//AB
        System.out.println(convertToTitle(701));//ZY
        System.out.println(convertToTitle(2147483647));//FXSHRXW
    }

    public static String convertToTitle(int columnNumber){
        String str = "";
        while(columnNumber != 0){
            if(columnNumber >= 1 && columnNumber <= 26){
                str += (char)(columnNumber + 64);
                break;
            }
            else{
                if(columnNumber % 26 == 0){
                    str += 'Z';
                    columnNumber -= 26;
                    columnNumber /= 26;
                }else{
                    str += (char)((columnNumber % 26) + 64);
                    columnNumber /= 26;
                }
            }
        }

        String newStr = "";
        for(int i = str.length() - 1; i>= 0; i--){
            newStr += str.charAt(i);
        }

        return newStr;
    }






//没有理解题意就开始写代码，废弃。
//    public static String convertToTitle(int columnNumber) {
//        String str = "";
//        while(columnNumber != 0){
//            if(columnNumber % 26 == 0){
////                System.out.println("-----");
//                str += (char)(26 + 64);
////                System.out.println("test---str---" + str);
//            }else if(columnNumber == 1){
//                break;
//            }
//            else{
//                str += (char)((columnNumber % 26) + 64);
//
//                System.out.println("test---" + columnNumber);
//                System.out.println("test---str---" + str);
//            }
//
////            System.out.println("test---" + (char)((columnNumber % 26) + 64));
//            columnNumber /= 26;
//            System.out.println("test---columnNumber---" + columnNumber);
//        }
//
//        String newStr = "";
//        for(int i = str.length() - 1; i>= 0; i--){
//            newStr += str.charAt(i);
//        }
//
//        return newStr;
//    }

}
//1 --- 1
//A --- 65

//26*25 -> 26*24+26
//26*26 -> 26*25+26
//
//1->26
//26 + 1->26 AA->AZ
//26*2 + 1->26 BA->BZ
//...
//26*25 + 1->26 YA->YZ
//26*26 + 1->26 ZA->ZZ

