package array;

/**
 * @Author czgggggggg
 * @Date 2021/8/26
 * @Description
 */
public class Array937 {
    public static void main(String[] args) {
        String[] logs1 = {"dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"};
        logs1 = reorderLogFiles(logs1);
        for(int i = 0; i < logs1.length; i++)
            System.out.println(logs1[i]);
        System.out.println("----------");
        String[] logs2 = {"a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"};
        logs2 = reorderLogFiles(logs2);
        for(int i = 0; i < logs2.length; i++)
            System.out.println(logs2[i]);
        System.out.println("----------");
        String[] logs3 = {"a1 9 2 3 1","b1 act car","a2 act car","a1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"};
//        String[] logs3 = {"a1 9 2 3 1","bb1 act car","ba2 act car","ab1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"};
        logs3 = reorderLogFiles(logs3);
        for(int i = 0; i < logs3.length; i++)
            System.out.println(logs3[i]);
        System.out.println("----------");
        String[] logs4 = {"o 0331394079964851 4", "hkkk 600490 9 00 2 0", "7m3va 77480381100875", "f9z3j tydfpvhks m a", "k6 3592 10166 82395", "z7o1 tpipcx b uykyn", "k boowjmrfqlggprhk i", "qoi lzygdsafhglymi n", "h 3338586230095825 1", "77gv7 8886961 21 32", "er 739336634 62 048", "vga vhz wckifxuep kv", "03d 81356369 030 6 1", "fms51 51433485791776", "ldf4 lnm e iuiuoi k", "2 570761582013 84 26", "o5ccb 783786786782 6", "33fj7 86283961878 10", "t lsoqwcwgzlk obxhkd", "x6w55 96799905961 3"};
        logs4 = reorderLogFiles(logs4);
        for(int i = 0; i < logs4.length; i++)
            System.out.println(logs4[i]);
    }

    public static String[] reorderLogFiles(String[] logs) {
        String[] ans_logs = new String[logs.length];
        int count = 0;

        String[][] tmp_logs = new String[logs.length - count][2];
        for (int i = 0; i < logs.length; i++) {
            String[] split = logs[i].split(" ");
            if (!(split[1].startsWith("0") ||
                    split[1].startsWith("1") ||
                    split[1].startsWith("2") ||
                    split[1].startsWith("3") ||
                    split[1].startsWith("4") ||
                    split[1].startsWith("5") ||
                    split[1].startsWith("6") ||
                    split[1].startsWith("7") ||
                    split[1].startsWith("8") ||
                    split[1].startsWith("9"))) {
                tmp_logs[count][0] = split[0];
                tmp_logs[count][1] = logs[i].replaceAll(split[0] + " ", "");
//                System.out.println(tmp_logs[count2][0] + "$$$" + tmp_logs[count2][1]);
                count++;
            }
        }


        //采用交换排序
        String tmpString;
        for(int i = 0; i < count - 1; i++){
            for(int j = 0; j < count - 1; j++){
                if(tmp_logs[j][1].compareTo(tmp_logs[j + 1][1]) > 0){//内容字母不同时，按内容字母排序
                    tmpString = tmp_logs[j][1];
                    tmp_logs[j][1] = tmp_logs[j + 1][1];
                    tmp_logs[j + 1][1] = tmpString;
                    tmpString = tmp_logs[j][0];
                    tmp_logs[j][0] = tmp_logs[j + 1][0];
                    tmp_logs[j + 1][0] = tmpString;
                }
                else if(tmp_logs[j][1].compareTo(tmp_logs[j + 1][1]) == 0){//如果内容相同，再按标识符排序
                    if(tmp_logs[j][0].compareTo(tmp_logs[j + 1][0]) > 0){
//                        System.out.println("tmp_logs[j][0]---" + tmp_logs[j][0]);
//                        System.out.println("tmp_logs[j + 1][0]---" + tmp_logs[j + 1][0]);
                        tmpString = tmp_logs[j][1];
                        tmp_logs[j][1] = tmp_logs[j + 1][1];
                        tmp_logs[j + 1][1] = tmpString;
                        tmpString = tmp_logs[j][0];
                        tmp_logs[j][0] = tmp_logs[j + 1][0];
                        tmp_logs[j + 1][0] = tmpString;
                    }
                }
            }
        }

        for(int i = 0; i < count; i++){
//            System.out.println(tmp_logs[i][0] + "$$$" + tmp_logs[i][1]);
            ans_logs[i] = tmp_logs[i][0] + " " + tmp_logs[i][1];
        }


//        int tmp = count;


        for (int i = 0; i < logs.length; i++) {
            String[] split = logs[i].split(" ");
            if (split[1].startsWith("0") ||
                    split[1].startsWith("1") ||
                    split[1].startsWith("2") ||
                    split[1].startsWith("3") ||
                    split[1].startsWith("4") ||
                    split[1].startsWith("5") ||
                    split[1].startsWith("6") ||
                    split[1].startsWith("7") ||
                    split[1].startsWith("8") ||
                    split[1].startsWith("9"))
                ans_logs[count++] = logs[i];
        }

//        for(int i = tmp; i < logs.length; i++){
//            System.out.println(ans_logs[i]);
//        }

//        for(int i = 0; i < logs.length; i++){
//            System.out.println(ans_logs[i]);
//        }

        return ans_logs;
    }
}
//难点：字母日志 在内容不同时，忽略标识符后，按内容字母顺序排序；在内容相同时，按标识符排序。

//输入：["o 0331394079964851 4", "hkkk 600490 9 00 2 0", "7m3va 77480381100875", "f9z3j tydfpvhks m a", "k6 3592 10166 82395", "z7o1 tpipcx b uykyn", "k boowjmrfqlggprhk i", "qoi lzygdsafhglymi n", "h 3338586230095825 1", "77gv7 8886961 21 32", "er 739336634 62 048", "vga vhz wckifxuep kv", "03d 81356369 030 6 1", "fms51 51433485791776", "ldf4 lnm e iuiuoi k", "2 570761582013 84 26", "o5ccb 783786786782 6", "33fj7 86283961878 10", "t lsoqwcwgzlk obxhkd", "x6w55 96799905961 3"]
//输出：["k boowjmrfqlggprhi","ldf4 lnm e iuiuoi k","t lsoqwcwgzlk obxhkd","qoi lzygdsafhglymi n","z7o1 tpipcx b uykyn","f9z3j tydfpvhks m a","vga vhz wckifxuep kv","o 0331394079964851 4","hkkk 600490 9 00 2 0","7m3va 77480381100875","k6 3592 10166 82395","h 3338586230095825 1","77gv7 8886961 21 32","er 739336634 62 048","03d 81356369 030 6 1","fms51 51433485791776","2 570761582013 84 26","o5ccb 783786786782 6","33fj7 86283961878 10","x6w55 96799905961 3"]
//预期结果：["k boowjmrfqlggprhk i","ldf4 lnm e iuiuoi k","t lsoqwcwgzlk obxhkd","qoi lzygdsafhglymi n","z7o1 tpipcx b uykyn","f9z3j tydfpvhks m a","vga vhz wckifxuep kv","o 0331394079964851 4","hkkk 600490 9 00 2 0","7m3va 77480381100875","k6 3592 10166 82395","h 3338586230095825 1","77gv7 8886961 21 32","er 739336634 62 048","03d 81356369 030 6 1","fms51 51433485791776","2 570761582013 84 26","o5ccb 783786786782 6","33fj7 86283961878 10","x6w55 96799905961 3"]
