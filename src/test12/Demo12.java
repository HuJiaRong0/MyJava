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
        System.out.print("�������˺ţ�");
        String username = sc.nextLine();
        System.out.print("���������룺");
        String password = sc.nextLine();
        if (users.containsKey(username)) {
            if (password.equals(users.get(username))) {
                System.out.println("��¼�ɹ�");
            } else {
                System.out.println("��������˺Ż����벻��ȷ");
            }
        } else {
            System.out.println("��������˺Ż����벻��ȷ");
        }
    }
}
