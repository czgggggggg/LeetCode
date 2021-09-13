package string;

/**
 * @Author czgggggggg
 * @Date 2021/9/13
 * @Description
 */
public class String1598 {
    public static void main(String[] args) {
        String[] logs1 = {"d1/","d2/","../","d21/","./"};
        System.out.println(minOperations(logs1));
        String[] logs2 = {"d1/","d2/","./","d3/","../","d31/"};
        System.out.println(minOperations(logs2));
        String[] logs3 = {"d1/","../","../","../"};
        System.out.println(minOperations(logs3));
    }
    public static int minOperations(String[] logs) {
        int count = 0;
        for(int i = 0; i < logs.length; i++){
            String str = logs[i];
            if("../".equals(str)){
                if(count != 0)
                    count--;
            }else if("./".equals(str))
                continue;
            else
                count++;
        }

        return count;
    }
}
