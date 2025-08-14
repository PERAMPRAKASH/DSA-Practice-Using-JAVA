class Sortzerosonesandtwos{
    public static void main(String []args){
        int[] arr={2,0,2,1,1,0};
        Sort(arr);
        for(int num:arr){
            System.out.print(num + " ");
        }
    }
    public static void Swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void Sort(int[] arr){
        int n=arr.length;
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high){
            if(arr[mid]==0){
                Swap(arr,mid,low);
                mid++;
                low++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                Swap(arr,mid,high);
                high--;
            }
        }
    }
}
