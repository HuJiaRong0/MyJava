package test21;


public class Demo21 {
    public static void main(String[] args) {
        int []arr=new int[]{3,1,9,8,0,4,6,7};
        swap(arr);
    }
    public static void swap(int arr[]){
        int max=arr[0];
        int min=arr[0];
        int n=0;
        int m=0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
                n=i;
            }else if(min>arr[i]){
                min=arr[i];
                m=i;
            }
        }
        arr[n]=arr[0];
        arr[0]=max;
        arr[m]=arr[arr.length-1];
        arr[arr.length-1]=min;
        for(int result:arr){
            System.out.print(result+",");
        }
    }
}

