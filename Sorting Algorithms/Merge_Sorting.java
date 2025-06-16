import java.util.ArrayList;
class Merge_Sorting{
    public static void main(String[] args){
        int[] arr={38, 27, 43, 3, 9, 82, 10};
        merge_Sort(arr,0,arr.length-1);
        System.out.println("Sorted array: ");
        for(int num:arr){
            System.out.print(num + " ");
        }
    }
    public static void merge_Sort(int[] arr,int left,int high){
        if(left<high){
            int mid=(left+high)/2;
            merge_Sort(arr,left,mid);
            merge_Sort(arr,mid+1,high);
            merge(arr,left,mid,high);
        }
    }
    public static void merge(int[] arr,int low,int mid,int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            arr[i]=temp.get(i-low);
        }
    }
}