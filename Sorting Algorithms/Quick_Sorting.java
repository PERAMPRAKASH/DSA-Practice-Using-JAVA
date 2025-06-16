class Quick_Sorting{
    public static void main(String[] args){
        int[] arr={38, 27, 43, 3, 9, 82, 10};
        quick_sort(arr,0,arr.length-1);
        System.out.println("Sorted array: ");
        for(int num:arr){
            System.out.print(num + " ");
        }
    }
    public static void quick_sort(int[] arr,int low,int high){
        if(low<high){
            int pivot_index = partition(arr,low,high);
            quick_sort(arr,low,pivot_index-1);
            quick_sort(arr,pivot_index+1,high);
        }
    }
    public static int partition(int[] arr,int low,int high){
        int pivot=arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while(arr[i]<=pivot && i<=high-1){
                i++;
            }
            while(arr[j]>pivot && j>=low+1){
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;
        return j;
    }
}