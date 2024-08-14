class Solution {
    public int largestRectangleArea(int[] heights) {
        // using custum stack
        int n = heights.length;
       int stack[] = new int[n+1];
       int index=-1;
       int max = Integer.MIN_VALUE;
       for(int i =0;i<=n;i++){
        int element=(i==n)?0:heights[i];
        while(index!=-1 && heights[stack[index]]>element){
          int h=  heights[stack[index--]];
          int ps=(index==-1)?-1:stack[index];
          int ns=i;
          int w= ns-ps-1;
          int area = h*w;
          max = Math.max(max,area);
        }
          stack[++index]=i;
       }
return (max==Integer.MIN_VALUE)?0:max;








    //   //using single  stack...
    //   Stack<Integer>stack = new Stack<>();
    //   int n = heights.length;
    //   int max = Integer.MIN_VALUE;
    //   for(int i = 0; i<=n;i++){
    //     int element =(i==n)?0:heights[i];
    //    while(!stack.isEmpty() && heights[stack.peek()]>element){
    //     int h =heights[stack.pop()];
    //     int ns = i;
    //     int ps =(stack.isEmpty())?-1:stack.peek();
    //     int w = ns-ps-1;
    //     int area = h*w;
    //     max = Math.max(max,area);
    //    }
    //    stack.push(i);

    //   }
    //  return (max==Integer.MIN_VALUE)?0:max;






        // using two stack....
        // int ns[] = findNextSmaller(heights);
        // int ps[] = findPrevSmaller(heights);
        // int max = Integer.MIN_VALUE;
        // for(int i =0;i<heights.length;i++){
        //     int h = heights[i];
        //     int w = (ns[i]-ps[i])-1;;
        //     int area = h*w;
        //     max= Math.max(max,area);
        // }
    // return max;
    // }
    // public int[] findNextSmaller(int[] arr){
    //  int n = arr.length;
    //  int res[] = new int[n];
    //  Stack<Integer>stack= new Stack<>();
    //  for(int i = n-1;i>=0;i--){
    //     while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
    //         stack.pop();
    //     }
    //     if(stack.isEmpty()){
    //         res[i]= n;
    //     }else{
    //         res[i] = stack.peek();
    //     }
    //     stack.push(i);
    //  }
    //  return res;
    // }

    // public int[] findPrevSmaller(int[] arr){
    //  int n = arr.length;
    //  int res[] = new int[n];
    //  Stack<Integer>stack= new Stack<>();
    //  for(int i = 0;i<n;i++){
    //     while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
    //         stack.pop();
    //     }
    //     if(stack.isEmpty()){
    //         res[i]= -1;
    //     }else{
    //         res[i] = stack.peek();
    //     }
    //     stack.push(i);
    //  }
    //  return res;
    }
}