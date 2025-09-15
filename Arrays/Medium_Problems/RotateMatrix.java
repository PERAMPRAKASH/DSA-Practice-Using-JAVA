public class RotateMatrix {
    public static void main(String []args){
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        int[][] result=RotatematrixOptimal(matrix);
        for(int[] arr: result){
            for(int num: arr){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
    public static int[][] RotatematrixBruteForce(int[][] matrix){
        int n=matrix.length;
        int m=matrix[0].length;
        int[][] ans=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans[j][n-i-1]=matrix[i][j];
            }
        }
        return ans;
    } 
//---------------------------------------------------------------------------------------------------------
    public static int[][] RotatematrixOptimal(int[][] matrix){
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<m;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][m-j-1];
                matrix[i][m-j-1]=temp;
            }
        }
        return matrix;
    }
}
