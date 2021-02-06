package test7;

public class Demo7 {
    public static void main(String[]args){
        int x=451;
        int y=451;
        String z;
        z=(x<=y)?"通过一本录取分数线":"未通过一本录取分数线";
        System.out.println("您的高考总分: "+y);
        System.out.println("第一批本科录取分数线:  "+x);
        System.out.println("高考结果："+z);
    }
}
