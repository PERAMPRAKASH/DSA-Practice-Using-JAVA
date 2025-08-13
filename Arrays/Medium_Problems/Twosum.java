class Twosum{
    public static void main(String []args){
        int[] arr={2,7,11,15};
        int target=9;
        System.out.print(twoSum(arr,target));
    }
    public static String twoSum(int[] arr,int k){
    int n=arr.length;
    int i=0;
    int j=n-1;
    while(i<j){
        int sum=arr[i]+arr[j];
        if(sum==k) return "True";
        else if(sum<k)i++;
        else j--;
    }
    return "False";
    }
}
