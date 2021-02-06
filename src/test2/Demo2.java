package test2;

import java.util.ArrayList;
import java.util.HashMap;

public class Demo2 {
    public static void main(String[] args) {
        int[] arr = {2, 8, 6, 2, 7, 3, 9, 2, 8, 6, 7, 9, 1};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (map.containsKey(num)) {
                int n = map.get(num);
                n++;
                map.put(num, n);
            } else {
                map.put(num, 1);
            }
        }
        ArrayList<Integer> list = new ArrayList();
        for (int num : map.keySet()) {
            int n = map.get(num);
            if (n == 1) {
                list.add(num);
            }
        }
        System.out.print("只出现一次的数字是:");
        for (Integer num : list) {
            System.out.print(num + " ");
        }
    }
}

