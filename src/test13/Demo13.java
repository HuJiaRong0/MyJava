package test13;

import java.util.Scanner;

public class Demo13 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[]arr = str.split(",");
        int num1 = Integer.valueOf(arr[0]);
        int num2 = Integer.valueOf(arr[1]);
        try {
            int result = num1/num2;
            System.out.println(result);
        } catch(Exception e){
            System.out.println("除数不能为0");
        }
    }
}
