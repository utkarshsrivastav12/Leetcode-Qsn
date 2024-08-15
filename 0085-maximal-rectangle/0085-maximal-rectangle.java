class Solution {
    public int maximalRectangle(char[][] matrix) {
        // if there are no rows 
        if(matrix.length == 0){
            return 0;
        }
        //find the number of columns in a row
        int heights[] = new int[matrix[0].length];
        int largest = 0;
        for(int i =0;i<matrix.length;i++){
            for(int j = 0 ;j<matrix[i].length;j++){
                int val = matrix[i][j]-'0'; //char to int
                if(val==0){
                    heights[j] = 0;
                }else{
                    heights[j]+=val;
                }
            }
            int maxArea = largestRectangleArea(heights);
           if(largest<maxArea){
            largest = maxArea;
           }
        }
        return largest;
          
    }
    public int largestRectangleArea(int[] heights){
        int n = heights.length;
       int stack[] = new int[n+1];
       int max=Integer.MIN_VALUE;
       int index =-1;
       for(int i =0;i<=n;i++){
        int element =(i==n)?0:heights[i];
        while(index!=-1 && heights[stack[index]]>element){
          int h = heights[stack[index--]];
          int ns = i;
          int ps = (index==-1)?-1:stack[index];
          int w = ns-ps-1;
          max= Math.max(max,h*w);
        }
        stack[++index]=i;
       }
       return (max==Integer.MIN_VALUE)?0:max;
    }
}