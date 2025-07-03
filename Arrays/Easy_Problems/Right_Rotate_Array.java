class Right_Rotate_Array{
    public static void Right_Rotate_Array(int[] arr,int d){
        int n=arr.length;
        d=d%n;
        reverse(arr,0,n-d-1);
        reverse(arr,n-d,n-1);
        reverse(arr,0,n-1);
    }
    public static void reverse(int[] arr,int i,int j){
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7};
        int d=3;
        Right_Rotate_Array(arr,d);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
}