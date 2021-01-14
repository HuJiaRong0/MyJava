package test1;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y;
        y=(x+11*x+111*x+1111*x)*2+11111*x;
        System.out.println(x+"+"+11*x+"+"+111*x+"+"+1111*x+"+"+11111*x+"+"+1111*x+"+"+111*x+"+"+11*x+"+"+x+"="+y);
    }
}
