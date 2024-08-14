class Solution {
    public int largestRectangleArea(int[] heights) {
        int ns[] = findNextSmaller(heights);
        int ps[] = findPrevSmaller(heights);
        int max = Integer.MIN_VALUE;
        for(int i =0;i<heights.length;i++){
            int h = heights[i];
            int w = (ns[i]-ps[i])-1;;
            int area = h*w;
            max= Math.max(max,area);
        }
    return max;
    }
    public int[] findNextSmaller(int[] arr){
     int n = arr.length;
     int res[] = new int[n];
     Stack<Integer>stack= new Stack<>();
     for(int i = n-1;i>=0;i--){
        while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
            stack.pop();
        }
        if(stack.isEmpty()){
            res[i]= n;
        }else{
            res[i] = stack.peek();
        }
        stack.push(i);
     }
     return res;
    }

    public int[] findPrevSmaller(int[] arr){
     int n = arr.length;
     int res[] = new int[n];
     Stack<Integer>stack= new Stack<>();
     for(int i = 0;i<n;i++){
        while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
            stack.pop();
        }
        if(stack.isEmpty()){
            res[i]= -1;
        }else{
            res[i] = stack.peek();
        }
        stack.push(i);
     }
     return res;
    }
}