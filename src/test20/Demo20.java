package test20;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Demo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        if(isDate(date)==false){
            System.out.println("您输入的内容不是一个日期");
        }
        if(isDate(date)==true){
                String[] strArr=date.split("/");
                int year=Integer.parseInt(strArr[0]);
                int month=Integer.parseInt(strArr[1]);
                int towMonth=28;
                if((year%4==0&&year%100!=0)||(year%400==0)){
                    towMonth=29;
                }
                int totalDay=0;
                int[] months={31,towMonth,31,30,31,30,31,31,30,31,30,31};
                for(int i=0;i<months.length;i++){
                    if(month>=i+1){
                        if(month==i+1){
                            totalDay+=Integer.parseInt(strArr[2]);
                            break;
                        }else{
                            totalDay+=months[i];
                        }
                    }
                }
                System.out.println(date+"是"+strArr[0]+"的第"+totalDay+"天");
        }
    }
    public static boolean isDate(String str) {
        boolean result = true;
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        try {
            format.setLenient(false);
            format.parse(str);
        }catch (Exception e){
            result = false;
        }
        return result;
    }
}
