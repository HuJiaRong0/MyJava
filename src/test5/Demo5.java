package test5;

public class Demo5 {
    public static void main(String[]args){
        int []arr=new int[12];
        int n=0;
        for(int i=30;i>=0;i--){
            if(i%2==1&&n<12){
                arr[n]=i;
                n++;
            }
        }
        System.out.println("30以内从大到小的前12个奇数为：");
        for (int i=0;i<12;i++) {
            System.out.println(arr[i]);
        }
    }
}
