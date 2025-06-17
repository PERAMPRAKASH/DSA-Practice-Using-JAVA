class Largest_Element {
    public static void main(String[] args){
        int[] arr={1, 2, 3, 4, 5};
        int largest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.print("The largest element in the array is: " + largest);
    }
}