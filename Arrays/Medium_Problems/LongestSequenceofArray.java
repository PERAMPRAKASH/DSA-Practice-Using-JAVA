import java.util.*;
public class LongestSequenceofArray {
    public static void main(String []args){
        int[] arr={15,10,20,21,101,105,102,104,103};
        System.out.print(LongestSequenceOptimalApproach(arr));
    }
    public static int LongestSequenceBruteForce(int[] arr){
        int maxlen=1;
        int n=arr.length;
        for(int i=0;i<n;i++){
            int cnt=1;
            int x=arr[i];
            while(linearsearch(arr,x+1)==true){
                x++;
                cnt++;
            }
            maxlen=Math.max(maxlen,cnt);
        }
        return maxlen;
    }
    public static boolean linearsearch(int[] arr,int val){
        for(int num:arr){
            if(num==val){
                return true;
            }
        }
        return false;
    }

//-----------------------------------------------------------------------------------------------
    public static int LongestSequenceBetterApproach(int[] arr){
        int n=arr.length;
        Arrays.sort(arr);
        int maxlen=1;
        int lastSmaller=Integer.MIN_VALUE;
        int cnt=1;
        for(int i=1;i<n;i++){
            if(arr[i]-1==lastSmaller){
                cnt++;
                lastSmaller=arr[i];
            }
            else if(arr[i]!=lastSmaller){
                cnt=1;
                lastSmaller=arr[i];
            }
            maxlen=Math.max(cnt,maxlen);
        }
        return maxlen;
    }
    public static int LongestSequenceOptimalApproach(int[] arr){
        int maxlen=1;
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        for(int it:set){
            if(!set.contains(it-1)){
                int cnt=1;
                int x=it;
                while(set.contains(x+1)){
                    cnt++;
                    x++;
                }
                maxlen=Math.max(maxlen,cnt);
            }
        }
        return maxlen;
    }
}
