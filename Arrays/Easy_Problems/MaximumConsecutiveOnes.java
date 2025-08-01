class MaximumConsecutiveOnes{
    public static int MaximumConsecutiveOnes(int[] arr){
        int n=arr.length;
        int cnt=0;
        int maxcnt=0;
        for(int num:arr){
            if(num==1){   
                cnt++;
                maxcnt=Math.max(maxcnt,cnt);
            }
            else cnt=0;
        }
        return maxcnt;
    }
    public static void main(String []args){
        int[] arr= {1,1,0,1,1,1};
        System.out.println(MaximumConsecutiveOnes(arr));
    }
}