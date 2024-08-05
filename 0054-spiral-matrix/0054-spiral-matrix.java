class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>result = new ArrayList<>();
        int startRow= 0;
        int endRow= matrix.length-1;
        int startCol = 0;
        int endCol = matrix[0].length-1;
         while(startRow<=endRow && startCol<=endCol){
            // first Row
            for(int j=startCol;j<=endCol;j++){
                result.add(matrix[startRow][j]);
            }
            startRow+=1;
            // end Col
            for(int i=startRow;i<=endRow;i++){
                result.add(matrix[i][endCol]);
            }
            endCol-=1;
            if(startRow<=endRow){
                // last Row
                for(int j=endCol;j>=startCol;j--){
                    result.add(matrix[endRow][j]);
                }
                endRow-=1;
            }
            if(startCol<=endCol) {
                // first Col
                for(int i=endRow;i>=startRow;i--){
                    result.add(matrix[i][startCol]);
                }
                startCol+=1;
            }
        }
        return result;
    }
}