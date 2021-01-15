package test3;

import java.util.Random;
import java.util.Scanner;



public class Demo3 {
    public static void main(String[] args) {
        String str="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder code=new StringBuilder(6);
        Scanner sc=new Scanner(System.in);
        String key=sc.next();
        if(key.equals("GET")){
        for(int i=0;i<6;i++)
        {
            char ch=str.charAt(new Random().nextInt(str.length()));
            code.append(ch);
        }
        System.out.println(code.toString());
        }
    }
}
