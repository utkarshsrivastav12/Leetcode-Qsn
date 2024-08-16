class Solution {
    public int longestValidParentheses(String s) {
     //1st method optimize code 
     Stack<Integer>stack = new Stack<>();
     int max = 0 ;
     stack.push(-1);
     for(int i =0 ;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch=='('){
            stack.push(i);
        }else{
            stack.pop();
            if(stack.isEmpty()){
                stack.push(i);
            }else{
            int currentIndex = i;
            int mostRecentInvalid = stack.peek();
            max=Math.max(max,currentIndex - mostRecentInvalid);
            }
        }
     }
       return max;
     










        //2nd method Brute force Solution
       //remove all valid parenthesis
    //    Stack<Integer>stack = new Stack<>();
    //    removeValidParentheses(s,stack) ;
       //if stack is emptyh then there were no invid parenthese so return len;
    //    if(stack.isEmpty()){
    //     return s.length();
    //    }
    //    ArrayList<Integer>list = new ArrayList<>();
    //    formArrayOfInvalidIndexes(list,stack,s);

       //find max diffrence between two invalid parentheses
    //    int max=0;
    //    for(int i=1;i<list.size();i++){
    //     int prev = list.get(i-1);
    //     max=Math.max(max,list.get(i)-prev-1);
    //    }
    //    return max;
    // }
    // public void removeValidParentheses(String s,Stack<Integer>stack){
    //     for(int i = 0; i<s.length();i++){
    //         char ch= s.charAt(i);
    //         if(ch=='('){
    //             stack.push(i);
    //         }else{
    //             if(stack.isEmpty() || s.charAt(stack.peek())==')'){
    //                 stack.push(i);
    //             }else{
    //                 stack.pop();
    //             }
    //         }
    //     }
    // }
    //  public void formArrayOfInvalidIndexes(ArrayList<Integer> list,Stack<Integer> stack,String s){
    //     list.add(0,s.length());
        //now stack will have only the invalid paranthese indexes
        // while(!stack.isEmpty()){
        //     list.add(0,stack.pop());
        // }
        // list.add(0,-1);
     }
   
}