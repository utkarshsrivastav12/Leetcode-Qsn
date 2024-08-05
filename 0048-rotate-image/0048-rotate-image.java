class Solution {
    public void rotate(int[][] matrix) {
          int n=matrix.length;
        transposeMatrix(matrix);
        for(int i =0;i< n;i++){
            for(int j=0;j<n/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-1-j];
                matrix[i][n-1-j]=temp;

            }
        }
    }

    static void transposeMatrix(int arr[][]){
        int n =arr.length;
        for(int i =0;i<n;i++){
            for(int j =0;j<i;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
}
