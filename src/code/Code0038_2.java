package code;

/**
 * @Author czgggggggg
 * @Date 2022/2/3
 * @Description
 */
public class Code0038_2 {
    public static void main(String[] args) {
        //测试transfer
//        System.out.println(transfer("1223334444333221"));//11223344332211
//        System.out.println(transfer("122"));//1122
//        System.out.println(transfer("1"));//11
//        System.out.println(transfer("11"));//21
//        System.out.println(transfer("21"));//1211
//        System.out.println(transfer("1211"));//111221
//        System.out.println(transfer("111221"));//312211


        System.out.println(countAndSay(1));//1
        System.out.println(countAndSay(2));//11
        System.out.println(countAndSay(3));//21
        System.out.println(countAndSay(4));//1211
        System.out.println(countAndSay(5));//111221
        System.out.println(countAndSay(30));//31131122211311123113321112131...
        System.out.println(countAndSay(30).length());//4462
    }

    public static String countAndSay(int n) {
        String str = "1";
        while(--n > 0){
            str = transfer(str);
        }
        return str;
    }

    public static String transfer(String str){
        int n = str.length();
        int i, j;//双指针
        int count;
        StringBuilder sb = new StringBuilder();

        if(n == 1){
            sb.append('1');
            sb.append(str);
        }

        count = 1;
        for(i = 0, j = 1; i < n && j < n;){
                if(str.charAt(j) == str.charAt(i)){
                    count++;
                    if(j + 1 < n){
                        if(str.charAt(j + 1) == str.charAt(j)){
                            j++;
                        }else{
                            sb.append(count);
                            sb.append(str.charAt(i));
                            count = 0;//count重置
                            j++;//j后移到新的元素
                            i = j;//i后移到j的位置
                        }
                    }else{
                        sb.append(count);
                        sb.append(str.charAt(i));
                        break;//遍历结束
                    }
                }else{
                    sb.append(count);
                    sb.append(str.charAt(i));
                    count = 0;//count重置
                    //此处j不用后移一位
                    i = j;//i后移到j的位置
                }
        }

        return sb.toString();
    }
}
//1
//11
//1122344555556667