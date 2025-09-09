import java.util.*;
public class NextPermutation {
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
        // Sort permutations lexicographically
        allPermutations.sort((a, b) -> compareLists(a, b));
        // Linear search for current permutation
        for (int i = 0; i < allPermutations.size(); i++) {
            if (allPermutations.get(i).equals(current)) {
                // Return next permutation if exists, else first permutation
                if (i + 1 < allPermutations.size()) {
                    return allPermutations.get(i + 1);
                } else {
                    return allPermutations.get(0);
                }
            }
        }
        return null; // current permutation not found
    }
    public static void main(String[] args) {
        NextPermutation np = new NextPermutation();
        ArrayList<Integer> current = new ArrayList<>(Arrays.asList(1, 3, 2));
        ArrayList<Integer> next = np.findNextPermutation(current);
        System.out.println("Current permutation: " + current);
        System.out.println("Next permutation: " + next);
    }
}
