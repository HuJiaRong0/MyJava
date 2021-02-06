package test16;

import java.util.Scanner;

public class Demo16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp = sc.next();
        String[] arr = temp.split(",");
        String code = arr[0];
        int count = Integer.parseInt(arr[1]);
        double price = Order.getOrderAmount(code, count);
        System.out.println(price);
    }
}

class Item {
    String[] ItemCode = {"C_101", "C_102"};
    String[] ItemName = {" HUAWEI Mate30 Pro", "XIAOMI 10 Pro"};
    double[] UnitPrice ={5000.00, 4699.00};
}


class Order extends Item {

    public static double getOrderAmount(String itemCode, int itemCount) {
        Item item = new Item();
        String[] ItemCode = item.ItemCode;
        double[] UnitPrice = item.UnitPrice;
        double price = 0;
        for (int i = 0; i < ItemCode.length; i++) {
            if (ItemCode[i].equals(itemCode)) {
                price = itemCount * UnitPrice[i];
            }
        }
        return price;
    }
}