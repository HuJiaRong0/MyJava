package test17;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Demo17 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\lenovo\\Desktop\\white_list.txt");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String str=Read(file);
        if(str.contains(word)){
            System.out.println(word+"该IP地址可以访问网络");
        }else{
            System.out.println(word+"该IP地址不允许访问网络");
        }
    }
    public static String Read(File file){
        StringBuilder result = new StringBuilder();
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            String s = null;
            while((s = br.readLine())!=null){
                result.append(System.lineSeparator()+s);
            }
            br.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return result.toString();
    }
}
