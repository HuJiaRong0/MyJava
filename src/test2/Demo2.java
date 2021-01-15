package test2;

public class Demo2 {
    public static void main(String[]args) {
        int[]arr={2,8,6,2,7,3,9,2,8,6,7,9,1};
        int n=0;
        int []arr1=new int [2];
        for(int i=0;i<arr.length; i++) {
            int b=0;
            for(int j=0; j<arr.length; j++) {
                if (arr[i]==arr[j]){
                    b++;
                }
            }
            if (b==1){
                arr1[n++]=arr[i];
            }
        }
        System.out.println("只出现一次的数字是"+arr1[0]+"和"+arr1[1]);
    }
    }

