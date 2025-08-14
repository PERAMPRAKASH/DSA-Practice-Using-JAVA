class MajorityElementinArray{
    public static void main(String []args){
        int[] arr={4,4,2,4,3,4,4,3,2,4};
        int result=MajorityElement(arr);
        System.out.print("Majority Element is "+result);
    }
    public static int MajorityElement(int[] arr){
        int cnt=0;
        int element=arr[0];
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(cnt==0){
                cnt=1;
                element=arr[i];
            }
            else if(arr[i]==element) cnt++;
            else cnt--;
        }
        int count=0;
        for(int num:arr){
            if(num==element) count++;
        }
        if(count>(n/2))return element;
        return -1;
    }
}
