class StockBuyandSell{
    public static void main(String[] args){
        int[] arr={7,1,5,3,6,4};
        System.out.print(StockSellOptimal(arr));
    }
    public static int StockSellBruteForce(int[] arr){
        int n=arr.length;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int diff=arr[j]-arr[i];
                maxi=Math.max(maxi,diff);
            }
        }
        return maxi;
    }
    public static int StockSellOptimal(int[] arr){
        int maxi=0;
        int n=arr.length;
        int minPrice=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<minPrice){
                minPrice=arr[i];
            }
            maxi=Math.max(maxi,arr[i]-minPrice);
        }
        return maxi;
    }
}