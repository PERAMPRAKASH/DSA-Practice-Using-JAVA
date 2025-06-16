class Insertion_Sorting {
    public static void main(String[] args) {
        int[] arr= {64, 34, 25, 12, 22, 11, 90};
        insertionSorting(arr);
        System.out.println("Sorted array: ");
        for(int num:arr){
            System.out.print(num + " ");
        }
    }
    public static void insertionSorting(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 &&arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
}