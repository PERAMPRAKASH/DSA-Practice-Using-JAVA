class Second_Largest{
    public static void main(String[] args){
        int[] arr={1, 2, 3, 4, 5};
        int largest=Integer.MIN_VALUE;
        int second_largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>second_largest && largest!=arr[i]){
                second_largest=arr[i];
            }
        }
        System.out.print("The second largest element in the array is : "+second_largest);
    }
}