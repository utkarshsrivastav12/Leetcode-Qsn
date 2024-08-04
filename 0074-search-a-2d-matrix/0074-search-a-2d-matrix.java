class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0){
            return false;
        }
        int start = 0;
        int m = matrix.length;//rows
        int n = matrix[0].length;//col
        int end = m*n-1;
      
        while(start<=end){
            int mid = start + (end- start)/2;
            int r=mid/n;
            int c=mid%n;
            int val = matrix[r][c];
            if(val==target){
                return true;
            }else if(val>target){
              end= mid-1;
            }else{
                start = mid+1;
            }
        }
      return false;
    }
}