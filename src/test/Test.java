package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @Author czgggggggg
 * @Date 2021/9/7
 * @Description
 */
public class Test {
    public static void main(String[] args) throws ParseException {
//        System.out.println("01234567".substring(0,3));
//        int a = 1;
//        int b = -1;
//        if(a > 0){
//            System.out.println("test1");
//        }else if(a > 0 && b < 0){
//            System.out.println("test2");
//        }

//        String a = "9123";
//        String b = "898932839823";
//        System.out.println(a.compareTo(b));

//        String str = "12";
//        System.out.println(Integer.valueOf(str) + 1);

//        String string = "2016-10-24 21:59:06";
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        System.out.println(sdf.parse(string));

//        String string = "2022-01-10";
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        System.out.println(sdf.parse(string));

//        System.out.println(
//                "multiple_files = [('pcaps', (file_name, open(file_path, 'rb'), file_type)) for file_path, file_name in zip(file_paths, file_names)]\n".length() +
//                "# 请求\n".length() +
//                "session = requests.Session()\n".length() +
//                " response = session.post(url, files = multiple_files, data = date)".length());

        System.out.println('a' - 0);
        System.out.println('z' - 0);
        System.out.println('A' - 0);
        System.out.println('Z' - 0);

        StringBuilder sb = new StringBuilder();
        char ch = 'a' - 32;
        sb.append(ch);

        System.out.println(sb.toString());
    }
}
