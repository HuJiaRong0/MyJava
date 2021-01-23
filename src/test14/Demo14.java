package test14;

import java.io.File;

public class Demo14 {
    public static void main(String[] args) {
        String path = "C:\\Users\\lenovo\\Desktop";
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
