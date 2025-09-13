import java.util.ArrayList;
import java.util.Arrays;

class SetMatrixZeros{
    public static void main(String []args){
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        int n=matrix.size();
        int m=matrix.get(0).size();
        ArrayList<ArrayList<Integer>> ans=zeroMatrixBruteForce(matrix,n,m);
        ArrayList<ArrayList<Integer>> ans1=zeroMatrixBetter(matrix,n,m);
        ArrayList<ArrayList<Integer>> ans2=zeroMatrixOptimal(matrix,n,m);
        for(ArrayList<Integer> row:ans1){
            for(Integer ele:row){
                System.out.print(ele+" ");
            }
            System.out.println();
        }

    }
    public static void setrow(ArrayList<ArrayList<Integer>> matrix,int n,int m,int i){
        for(int j=0;j<m;j++){
            if(matrix.get(i).get(j)!=0){
                matrix.get(i).set(j,-1);
            }
        }
    }
    public static void setcol(ArrayList<ArrayList<Integer>> matrix,int n,int m,int j){
        for(int i=0;i<n;i++){
            if(matrix.get(i).get(j)!=0){
                matrix.get(i).set(j,-1);
            }
        }
    }
    public static ArrayList<ArrayList<Integer>> zeroMatrixBruteForce(ArrayList<ArrayList<Integer>> matrix,int n,int m){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix.get(i).get(j)==0){
                    setrow(matrix,n,m,i);
                    setcol(matrix,n,m,j);
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix.get(i).get(j)==-1){
                    matrix.get(i).set(j,0);
                }
            }
        }
        return matrix;
    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
    public static ArrayList<ArrayList<Integer>> zeroMatrixBetter(ArrayList<ArrayList<Integer>> matrix,int n, int m){
        int[] r=new int[n];
        int[] c=new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix.get(i).get(j)==0){
                    r[i]=1;
                    c[j]=1;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(r[i]==1 || c[j]==1){
                    matrix.get(i).set(j,0);
                }
            }
        }
        
        return matrix;
    }
//-------------------------------------------------------------------------------------------------------------------------------------------
    public static ArrayList<ArrayList<Integer>> zeroMatrixOptimal(ArrayList<ArrayList<Integer>> matrix,int n, int m){
        
        return matrix;
    }
}