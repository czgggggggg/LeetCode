package code;

/**
 * @Author czgggggggg
 * @Date 2022/1/13
 * @Description
 */
public class Code2078 {
    public static void main(String[] args) {
        int[] colors1 = {1,1,1,6,1,1,1};
        System.out.println(maxDistance(colors1));//3
        int[] colors2 = {1,8,3,8,3};
        System.out.println(maxDistance(colors2));//4
        int[] colors3 = {0,1};
        System.out.println(maxDistance(colors3));//1
        int[] colors4 = {4,4,4,11,4,4,11,4,4,4,4,4};
        System.out.println(maxDistance(colors4));//1
    }
    public static int maxDistance(int[] colors) {
        int dis1 = 0;//
        int dis2 = 0;//初始值无效，仅仅为了初始化
        for(int i = colors.length - 1; i >= 1; i--){
            if(colors[i] != colors[0]){
                dis1 = i;
                break;
            }
        }
        for(int i = 0; i < colors.length - 1; i++){
            if(colors[i] != colors[colors.length - 1]){
                dis2 = colors.length - 1 - i;//
                break;
            }
        }
        return Math.max(dis1,dis2);//
    }
}
//1000000000001
//100100000000000000000000000000200000002
//12        21111111111111111111
//11111112222222   22222221111111

//11111112222222 3  22222221111111


//执行结果：
//解答错误
//显示详情
//添加备注
//
//通过测试用例：
//81 / 126
//输入：
//[4,4,4,11,4,4,11,4,4,4,4,4]
//输出：
//6
//预期结果：
//8
