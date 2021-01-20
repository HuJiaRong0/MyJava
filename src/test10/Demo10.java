package test10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo10 {
    public static void main(String[]args){
        Calendar cal = Calendar.getInstance();
        cal.set(2020, 11, 10,10,30,0);
        Date date = cal.getTime();
        String strDateFormat = "(yyyy-MM-dd HH:mm:ss)";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
        System.out.println(sdf.format(date));
    }
}
