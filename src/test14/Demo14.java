package test14;

import java.io.File;
import java.util.Scanner;

public class Demo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        File file = new File(path);
        func(file);
    }

    private static void func(File file){
        File[] fs = file.listFiles();
        for(File f:fs){
            if(f.isDirectory())
                func(f);
            if(f.isFile())
                System.out.println(f);
        }
    }
}
