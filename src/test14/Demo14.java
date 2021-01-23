package test14;

import java.io.File;

public class Demo14 {
    public static void main(String[] args) {
        String path = "C:\\Users\\lenovo\\Desktop\\×ÀÃæ";
        File file = new File(path);
        File[] fs = file.listFiles();
        for (File f : fs) {
            if (!f.isDirectory())
                System.out.println(f);
        }
    }
}
