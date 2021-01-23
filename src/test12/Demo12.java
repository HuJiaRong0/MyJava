package test12;

import java.util.HashMap;
import java.util.Scanner;

public class Demo12 {
    public static void main(String[]args){
        HashMap<String, String> users = new HashMap();
        users.put("admin", "admin@123");
        users.put("guess", "123456");
        users.put("my", "my_666");
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入账号：");
        String username = sc.nextLine();
        System.out.print("请输入密码：");
        String password = sc.nextLine();
        if (users.containsKey(username)) {
            if (password.equals(users.get(username))) {
                System.out.println("登录成功");
            } else {
                System.out.println("您输入的账号或密码不正确");
            }
        } else {
            System.out.println("您输入的账号或密码不正确");
        }
    }
}
