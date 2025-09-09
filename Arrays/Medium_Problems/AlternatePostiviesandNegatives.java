public class AlternatePostiviesandNegatives {
    public static void main(String []args){
        int[] arr={1,2,-4,-5};
        int[] result=OrderedPosandNegOptimal(arr);
        for(int x : result){
            System.out.print(x + " ");
        }
    }
    public static int[] OrderedPosandNegBruteFore(int[] arr){
        int n=arr.length;
        int[] pos=new int[n/2];
        int[] neg=new int[n/2];
        int p=0,q=0;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                neg[q++]=arr[i];
            }
            else{
                pos[p++]=arr[i];
            }
        }
        for(int j=0;j<n/2;j++){
            arr[2*j]=pos[j];
            arr[2*j+1]=neg[j];
        }
        return arr;
    }
    public static int[] OrderedPosandNegOptimal(int[] arr){
        int n=arr.length;
        int posIndex=0;
        int[] result=new int[n];
        int negIndex=1;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                result[negIndex]=arr[i];
                negIndex+=2;
            }
            else{
                result[posIndex]=arr[i];
                posIndex+=2;
            }
        }
        return result;
    }
}
