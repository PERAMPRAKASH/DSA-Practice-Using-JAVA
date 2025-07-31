import java.util.*;
class UnionOfArrays{
    public static ArrayList<Integer> FindUnion(int a1[], int a2[], int n, int m){
        int i=0;int j=0;
        ArrayList<Integer> Union=new ArrayList<>();
        while(i<n && j<m){
            if(a1[i]<=a2[j]){
                if(Union.size()==0 || Union.get(Union.size()-1)!=a1[i])
                    Union.add(a1[i]);
                i++;
            }
            else{
                if(Union.size()==0 || Union.get(Union.size()-1)!=a2[j])
                    Union.add(a2[j]);
                j++;
            }
        }
        while(i<n){
            if(Union.get(Union.size()-1)!=a1[i])
                Union.add(a1[i]);
            i++;
        }
        while(j<m){
            if(Union.get(Union.size()-1)!=a2[j])
                Union.add(a2[j]);
            j++;
        }
        return Union;
    }
    public static void main(String args[]){
        int[] a1={2,5,9,10};
        int[] a2={1,4,8,12};
        ArrayList<Integer>result=FindUnion(a1,a2,a1.length,a2.length);
        System.out.println("Union of arr1 and arr2 is ");
        for (int val: result)
            System.out.print(val+" ");
    }
}