import java.util.*;
public class SpiralMatrix {
    public static void main(String []args){
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        ArrayList<Integer> result=Spiralmatrix(matrix);
        for(int num:result){
            System.out.print(num+" ");
        }
    }
    public static ArrayList<Integer> Spiralmatrix(int[][] matrix){
        ArrayList<Integer> ls=new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;
        int top=0,left=0,bottom=n-1,right=m-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++)ls.add(matrix[top][i]);
            top++;

            for(int i=top;i<=bottom;i++) ls.add(matrix[i][right]);
            right--;
            
            if(top<=bottom){
                for(int i=right;i>=left;i--)ls.add(matrix[bottom][i]);
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--)ls.add(matrix[i][left]);
                left++;
            }
        }
        return ls;
    }
}
