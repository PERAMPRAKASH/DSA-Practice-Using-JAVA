import java.util.*;
class LongestSubArraywithPositivesandNegatives{
    public static void main(String []args){
        int[] arr={-1, 1, 1};
        int k=1;
        System.out.print(LongestSubArraywithSumK(arr,k));
    }
    public static int LongestSubArraywithSumK(int[] arr,int k){
        int n=arr.length;
        int sum=0;
        int maxLen=0;
        Map<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==k) maxLen=Math.max(maxLen,i+1);
            int rem=sum-k;
            if(mpp.containsKey(rem)){
                int len=i-mpp.get(rem);
                maxLen=Math.max(maxLen,len);
            }
            if(!mpp.containsKey(sum)){
                mpp.put(sum,i);
            }
        }
        return maxLen;
    }
}