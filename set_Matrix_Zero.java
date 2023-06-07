
import java.io.*;
import java.util.* ;

public class Solution {
    public static void setZeros(int matrix[][]) {
        int n =matrix.length,m=matrix[0].length;
        int row[] =new int[n];
        int col[] = new int[m];
        Arrays.fill(row,-1);
        Arrays.fill(col,-1);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    row[i] = 0;
                    col[j] = 0;
                }                    
            }
        }
        for(int i=0;i<n;i++){
            if(row[i]==0){
                for(int j=0;j<m;j++){
                    matrix[i][j]=0;
                }
            }
        }
        for(int i=0;i<m;i++){
            if(col[i]==0){
                for(int j=0;j<n;j++){
                    matrix[j][i] = 0;
                }
            }
        }
    }

}