class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int R= matrix.length;
        int C =matrix[0].length;
        int start= matrix[0][0];
        int end = matrix[R-1][C-1];
        
        while(start<=end){
            int assumKthElement= start + (end-start)/2;
            int smallerElement = findSmallerElement(matrix , assumKthElement);
            if(smallerElement<k){
                start= assumKthElement +1;   
            }else{
                end = assumKthElement - 1;
            }
        }
        return start;
    }

    int findSmallerElement(int matrix[][],int assumKthElement){
        int numberOfSmallElem = 0;
        //traverse row by row
        for(int i = 0;i<matrix.length;i++){
            int start = 0;
            int end = matrix[i].length-1;
            while(start<=end){
                int mid = start+(end-start)/2;
                if(matrix[i][mid]<=assumKthElement){
                    start= mid+1;
                }else{
                    end=mid-1;
                }
            }
            numberOfSmallElem +=start;
        }
        return numberOfSmallElem;
    }
}