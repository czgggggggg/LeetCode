package code;

/**
 * @Author czgggggggg
 * @Date 2022/2/17
 * @Description
 */
public class Code2011 {
    public static void main(String[] args) {
        String[] operations1 = {"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(operations1));//1

        String[] operations2 = {"++X","++X","X++"};
        System.out.println(finalValueAfterOperations(operations2));//3

        String[] operations3 = {"X++","++X","--X","X--"};
        System.out.println(finalValueAfterOperations(operations3));//0
    }
    public static int finalValueAfterOperations(String[] operations) {
        int result = 0;
        //不论是X++ ++X --X X-- 都只需要看中间一位
        for (String operation : operations) {
            if ('+' == operation.charAt(1)) {
                ++result;
            } else {
                --result;
            }
        }
        return result;
    }
}
