<<<<<<< HEAD
class Remove_duplicates{
    public static int Remove_duplicates(int[] arr){
        int n = arr.length;
        int i=0;
        for(int j=1;j<n;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args){
        int[] arr={1,1,2,2,3,3,4};
        System.out.println(Remove_duplicates(arr));
    }
=======
class Remove_duplicates{
    public static int Remove_duplicates(int[] arr){
        int n = arr.length;
        int i=0;
        for(int j=1;j<n;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args){
        int[] arr={1,1,2,2,3,3,4};
        System.out.println(Remove_duplicates(arr));
    }
>>>>>>> 01932a1bcaf3754455b4e26695ebe2a55cfae90d
}