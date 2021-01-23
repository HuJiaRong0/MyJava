package test15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Demo15 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\lenovo\\Desktop\\Demo.txt");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String str=Read(file);
        int count = 0;
    while(str.contains(word)){
        count++;
        str = str.substring(str.indexOf(word) + word.length());
    }
        System.out.println(word+"在文中出现了"+count+"次");
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
