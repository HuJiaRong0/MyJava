package test19;

import java.util.Scanner;

public class Demo19 {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        String number = in.next();
        boolean flag = true;
        for(int i=0;i<number.trim().length()/2;i++){
            if(!String.valueOf(number.charAt(i)).equals(String.valueOf(number.charAt(number.trim().length()-i-1)))){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("该字符串是一个回文数");
        }else{
            System.out.println("该字符串不是一个回文数");
        }
    }
}

