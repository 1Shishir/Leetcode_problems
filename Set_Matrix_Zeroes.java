//https://leetcode.com/problems/set-matrix-zeroes/submissions/


class Solution {
    public void setZeroes(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        
        for(int i =0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(mat[i][j]==0){
                    mat[i][j] = (int)1e9;
                }
            }
        }
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]== (int)1e9){
                    for(int k = 0;k<n;k++){
                        if(mat[k][j]!= (int)1e9){
                        mat[k][j] = 0;
                        }
                    }
                    for(int k = 0;k<m;k++){
                        if(mat[i][k]!= (int)1e9){
                        mat[i][k] = 0;
                        }
                    }
                }
            }
        }
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(mat[i][j]== (int)1e9)
                mat[i][j] = 0;
            }
        }
    }
}