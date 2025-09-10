import java.util.*;
public class LeadersArrayElements {
    public static void main(String [] args){
        int[] arr={10, 22, 12, 3, 0, 6};
        ArrayList<Integer> result=LeadersElementsOptimal(arr);
        Collections.sort(result, Collections.reverseOrder());
        for(int num:result){
            System.out.print(num+" ");
        }
    }
    public static ArrayList<Integer> LeadersElementsBruteForce(int[] arr){
        int n=arr.length;
        ArrayList<Integer> ls=new ArrayList<>();
        for(int i=0;i<n;i++){
            boolean isLeader=true;
            for(int j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    isLeader=false;
                    break;
                }
            }
            if(isLeader){
                ls.add(arr[i]);
            }
        }
        return ls;
    }
    public static ArrayList<Integer> LeadersElementsOptimal(int[] arr){
        int n=arr.length;
        ArrayList<Integer> ls=new ArrayList<>();
        int maxi=Integer.MIN_VALUE;
        for(int i=n-1;i>0;i--){
            if(arr[i]>maxi){
                maxi=arr[i];
                ls.add(arr[i]);
            }
        }
        return ls;
    }
}
