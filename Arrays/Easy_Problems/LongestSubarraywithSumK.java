class LongestSubarraywithSumK{
    public static int LongestSubarraySumK(int[] arr,int K){
        int sum=arr[0];
        int i=0;int j=0;
        int maxlen=0;
        int n=arr.length;
        while(j<n){
            while(i<=j && sum>K){
                sum-=arr[i];
                i++;
            }
            if(sum==K){
                maxlen=Math.max(maxlen,j-i+1);
            }
            j++;
            if(j<n) sum+=arr[j];
        }
        return maxlen;
    }
    public static void main(String []args){
        int[] arr= {2,3,5,1,9};
        int K=10;
        System.out.println(LongestSubarraySumK(arr,K));
    }
}
// }

// class LongestSubarraywithSumK {
//     public static int LongestSubarraySumK(int[] arr, int K) {
//         int i = 0, j = 0;
//         int sum = 0;
//         int maxlen = 0;
//         int n = arr.length;

//         while (j < n) {
//             sum += arr[j];

//             while (i <= j && sum > K) {
//                 sum -= arr[i];
//                 i++;
//             }

//             if (sum == K) {
//                 maxlen = Math.max(maxlen, j - i + 1);
//             }

//             j++;
//         }

//         return maxlen;
//     }

//     public static void main(String[] args) {
//         int[] arr = {2, 3, 5, 1, 9};
//         int K = 10;
//         System.out.println(LongestSubarraySumK(arr, K));  // Output: 3 ([2, 3, 5])
//     }
// }
