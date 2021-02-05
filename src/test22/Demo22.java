package test22;

import java.util.Scanner;
import java.util.Stack;

public class Demo22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                stack.push(str.charAt(i));
            }else if(str.charAt(i)==')'){
                if(stack.isEmpty()){
                    System.out.println("您输入的内容，括号不配对");
                }else{
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty()){
            System.out.println("您输入的内容，括号完全配对");
        }else{
            System.out.println("您输入的内容，括号不配对");
        }
    }
}

