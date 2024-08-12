class Solution {
    public int minSwaps(String s) {
        // without using Stack
    int open=0,close=0;
    for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
        if(ch=='['){
            open++;
        }else if(ch==']' && open>0){
            open--;
        }else{
            close++;
        }
    }
    return (open+1)/2;



    // using Stack 

        // Stack<Character>stack = new Stack<>();
        // for(int i =0;i<s.length();i++){
        //     char ch = s.charAt(i);
        //     if(ch=='['){
        //         stack.push(ch);
        //     }else{
        //         if(stack.isEmpty() || stack.peek() == ']'){
        //             stack.push(ch);
        //         }else{
        //             stack.pop();
        //         }
        //     }
        // }
        // int totalBracket = stack.size();
        // int openBracket = totalBracket/2;
        // return (openBracket+1)/2;
    }
}