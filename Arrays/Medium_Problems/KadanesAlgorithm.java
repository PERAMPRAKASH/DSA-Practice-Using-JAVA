public class KadanesAlgorithm{
	public static void main(String []args){
		int[] arr={-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(kadanesOptimal(arr));
	}
	public static int kadanesBrutefore(int[] arr){
		int n=arr.length;
		int maxi=Integer.MIN_VALUE;
		for(int i=0;i<n;i++){
			for(int j=i;j<n;j++){
				int sum=0;
				for(int k=i;k<j;k++){
					sum+=arr[k];
				}
				maxi=Math.max(maxi,sum);
			}
		}
		return maxi;
	}
    public static int kadanesBetter(int[] arr){
        int n=arr.length;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                maxi=Math.max(maxi,sum);
            }
        }
        return maxi;
    }
    public static int kadanesOptimal(int[] arr){
        int n=arr.length;
        int sum=0;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum<0){
                sum=0;
            }
            maxi=Math.max(sum,maxi);
        }
        return maxi;
    }
}