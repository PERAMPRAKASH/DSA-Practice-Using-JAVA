class FindNumberAppearOnce{
    public static int FindNumberAppearOnce(int[] arr){
        int n=arr.length;
        int xor=0;
        for(int num:arr){
            xor^=num;
        }
        return xor;
    }
    public static void main(String []args){
        int[] arr= {1,1,2,3,5,3,2};
        System.out.println(FindNumberAppearOnce(arr));
    }
}