package string;

/**
 * @Author czgggggggg
 * @Date 2021/9/9
 * @Description
 */
public class String1154 {
    public static void main(String[] args) {
        System.out.println(dayOfYear("2019-01-09"));//9
        System.out.println(dayOfYear("2019-02-10"));//41
        System.out.println(dayOfYear("2003-03-01"));//60
        System.out.println(dayOfYear("2004-03-01"));//61
        System.out.println(dayOfYear("1996-10-07"));//281
        System.out.println(dayOfYear("1997-10-07"));//280
        System.out.println(dayOfYear("2000-10-07"));//281
        System.out.println(dayOfYear("1900-10-07"));//280
    }
    public static int dayOfYear(String date) {
        String[] strs = date.split("-");
        int year = (strs[0].charAt(0)-48)*1000 + (strs[0].charAt(1)-48)*100 + (strs[0].charAt(2)-48)*10 + (strs[0].charAt(3)-48);
        int month = (strs[1].charAt(0)-48)*10 + (strs[1].charAt(1)-48);
        int day = (strs[2].charAt(0)-48)*10 + (strs[2].charAt(1)-48);
//        System.out.println(year + "---" + month + "---" + day);

        int days = 0;
        int[] month_days = {31,28,31,30,31,30,31,31,30,31,30,31};//非闰年
        if((year % 100 == 0 && year % 400 == 0) || (year % 100 != 0 && year % 4 == 0))//闰年
            month_days[1] = 29;//闰年2月29天

        for(int i = 0; i < month - 1; i++)
            days += month_days[i];
        days += day;

        return days;
    }
}
//有字符串直接转int的函数么？
