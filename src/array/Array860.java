package array;

/**
 * @Author czgggggggg
 * @Date 2021/8/25
 * @Description
 */
public class Array860 {
    public static void main(String[] args) {
        int[] bills1 = {5,5,5,10,20};//true
        System.out.println(lemonadeChange(bills1));
        int[] bills2 = {5,5,10,10,20};//false
        System.out.println(lemonadeChange(bills2));
        int[] bills3 = {5,5,10};//true
        System.out.println(lemonadeChange(bills3));
        int[] bills4 = {10,10};//false
        System.out.println(lemonadeChange(bills4));
    }
    public static boolean lemonadeChange(int[] bills) {
        int count_5 = 0;
        int count_10 = 0;
        int count_20 = 0;
        for(int i = 0; i < bills.length; i++){
            if(bills[i] == 5)
                count_5++;
            else if(bills[i] == 10){
                count_10++;
                if(count_5 > 0){
                    count_5--;
                }
                else{
                    return false;
                }
            }else{//20
                count_20++;
                if(count_10 > 0){
                    if(count_5 > 0){
                        count_10--;
                        count_5--;
                    }else{
                        return false;
                    }
                }else{
                    if(count_5 >= 3){
                        count_5 -= 3;
                    }else{
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
