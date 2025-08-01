class MissingNumberInArray{
    public static int MissingNumber(int[] arr){
        int n=arr.length;
        int ActualSum=((n*(n+1))/2);
        int ArraySum=0;
        for(int num:arr){
            ArraySum+=num;
        }
        return ActualSum-ArraySum;
    }
    public static void main(String []args){
        int[] arr= {1,2,3,4,0};
        System.out.println(MissingNumber(arr));
    }
}