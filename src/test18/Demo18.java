package test18;

import java.util.Scanner;

public class Demo18 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[]arr1 = str.split(",");
        String[]arr2=new String[10];
        int m=9;
        for(int n=0;n<=9;n++){
            arr2[m]=arr1[n];
            m=--m;
        }
        System.out.print(String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s",arr2));
    }
}
