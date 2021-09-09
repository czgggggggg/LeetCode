package string;

/**
 * @Author czgggggggg
 * @Date 2021/9/9
 * @Description
 */
public class String1360 {
    public static void main(String[] args) {
        System.out.println(daysBetweenDates("2019-06-29","2019-06-30"));
        System.out.println(daysBetweenDates("2020-01-15","2019-12-31"));

        System.out.println(daysBetweenDates("2019-12-31","2020-12-31"));//366
        System.out.println(daysBetweenDates("2019-12-31","2021-12-31"));//366+365=731
        System.out.println(daysBetweenDates("2019-12-31","2021-11-30"));//366+365-31=700
        System.out.println(daysBetweenDates("1996-01-01","2000-01-01"));//366+365+365+365=1461

        System.out.println(daysBetweenDates("2020-12-31","2019-12-31"));//366
        System.out.println(daysBetweenDates("2021-12-31","2019-12-31"));//366+365=731
        System.out.println(daysBetweenDates("2021-11-30","2019-12-31"));//366+365-31=700
        System.out.println(daysBetweenDates("2000-01-01","1996-01-01"));//366+365+365+365=1461
    }
    public static int daysBetweenDates(String date1, String date2) {
        String[] strs1 = date1.split("-");
        int year1 = (strs1[0].charAt(0)-48)*1000 + (strs1[0].charAt(1)-48)*100 + (strs1[0].charAt(2)-48)*10 + (strs1[0].charAt(3)-48);
        int month1 = (strs1[1].charAt(0)-48)*10 + (strs1[1].charAt(1)-48);
        int day1 = (strs1[2].charAt(0)-48)*10 + (strs1[2].charAt(1)-48);
        String[] strs2 = date2.split("-");
        int year2 = (strs2[0].charAt(0)-48)*1000 + (strs2[0].charAt(1)-48)*100 + (strs2[0].charAt(2)-48)*10 + (strs2[0].charAt(3)-48);
        int month2 = (strs2[1].charAt(0)-48)*10 + (strs2[1].charAt(1)-48);
        int day2 = (strs2[2].charAt(0)-48)*10 + (strs2[2].charAt(1)-48);

        int days = 0;
        if(year1 == year2)
            return Math.abs(dayOfYear(date1) - dayOfYear(date2));
        else{
            if(year1 > year2){
                for(int i = year2; i < year1; i++){//多算year2
                    if((i % 100 == 0 && i % 400 == 0) || (i % 100 != 0 && i % 4 == 0)){//闰年
                        days += 366;
                    }else{
                        days += 365;
                    }
                }
                days -= dayOfYear(date2);
                days += dayOfYear(date1);
            }else if(year1 < year2){
                for(int i = year1; i < year2; i++){//多算year1
                    if((i % 100 == 0 && i % 400 == 0) || (i % 100 != 0 && i % 4 == 0)){//闰年
                        days += 366;
                    }else{
                        days += 365;
                    }
                }
                days -= dayOfYear(date1);
                days += dayOfYear(date2);
            }
        }

        return days;
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
