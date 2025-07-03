class Moving_zeros_to_End{
    public static void Moving_zeros_to_end(int[] arr){
        int n=arr.length;
        int i=0;
	    for(int j=0;j<n;j++){
	        if(arr[j]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
		    }
	    }
	}
    public static void main(String[] args){
        int[] arr={0,1,0,0,3,12};
        Moving_zeros_to_end(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}