package test6;

public class Demo6 {
    public static void main(String[]args){
        int n=0;
        for(int i=0;i<=1000;i++){
            if(i%2==0&&i!=40&&i!=48){
                n+=i;
            }else if(n>=25000){break;}
        }
        System.out.println("0��1000֮��(40,48���������ڵ���25000����)ż���ĺ�Ϊ��"+n);
    }
}