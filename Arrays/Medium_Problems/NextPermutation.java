import java.util.*;
public class NextPermutation {
    //BruteForce Approach:
    public ArrayList<ArrayList<Integer>> permutations(){
        int[] arr={1,3,2};
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        nextpermutationBruteForce(0,arr,result);
        return result;
    }
    public static void nextpermutationBruteForce(int index, int[] nums,ArrayList<ArrayList<Integer>> result){
        if(index==nums.length){
            ArrayList<Integer>ds=new ArrayList<>();
            for(int num:nums){
                ds.add(num);
            }
            result.add(new ArrayList<>(ds));
        }
        for(int i=index;i<nums.length;i++){
            swap(i,index,nums);
            nextpermutationBruteForce(index+1,nums,result);
            swap(i,index,nums);
        }
    }
    public static void swap(int i, int j, int[] arr){
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    } 
    public static int compareLists(List<Integer> a, List<Integer> b) {
        for (int i = 0; i < a.size(); i++) {
            if (!a.get(i).equals(b.get(i))) {
                return a.get(i) - b.get(i);
            }
        }
        return 0;
    }
    public ArrayList<Integer> findNextPermutation(ArrayList<Integer> current) {
        ArrayList<ArrayList<Integer>> allPermutations = permutations();
        allPermutations.sort((a, b) -> compareLists(a, b));
        for (int i = 0; i < allPermutations.size(); i++) {
            if (allPermutations.get(i).equals(current)) {
                if (i + 1 < allPermutations.size()) {
                    return allPermutations.get(i + 1);
                } else {
                    return allPermutations.get(0);
                }
            }
        }
        return null; 
    }

//"----------------------------------------------------------------------"
    //OptimizedApproach:
    public static int[] nextPermutation(int[] arr){
        int n=arr.length;
        int index= -1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                index=i;
                break;
            }
        }
        if(index== -1){
                reverse(arr,0,n);
                return arr;
            }
        for(int i=n-1;i>index;i--){
            if(arr[i]>arr[index]){
                Swap(i,index,arr);
                break;
            }
        }
        reverse(arr,index+1,n);
        return arr;
    }
    public static void Swap(int i, int j, int[] arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void reverse(int[] arr,int first, int end){
        end--;
        while(first<end){
            Swap(first,end,arr);
            first++;
            end--;
        }
    }

    //Main method for both Approaches:
    public static void main(String[] args) {
        NextPermutation np = new NextPermutation();

        // Brute Force Approach
        ArrayList<Integer> current = new ArrayList<>(Arrays.asList(1, 3, 2));
        ArrayList<Integer> nextBrute = np.findNextPermutation(new ArrayList<>(current));
        System.out.println("Brute Force:");
        System.out.println("Current permutation: " + current);
        System.out.println("Next permutation: " + nextBrute);

        // Optimized Approach
        int[] arr = {1, 3};
        int[] result = nextPermutation(arr);
        System.out.println("\nOptimized:");
        System.out.print("Next permutation: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}


