class Solution {
    public int minAddToMakeValid(String s) {
     //Without using Stack
    //  Time C O(N)
    //  int open=0,close=0,ans=0;
    //  for(int i =0;i<s.length();i++){
    //     char ch = s.charAt(i);
    //     if(ch=='('){
    //         open++;
    //     }else if(ch==')' && open>0){
    //         open--;
    //     }else{
    //         close++;
    //     }
    //  }
    // ans=open+close;
    // return ans;




     //O(n)T.C
     //Space.C  O(n)

        //using stack solution
        // Stack<Character> stack = new Stack<>();
        // int count=0;
        // for(int i =0;i<s.length();i++){
        //     char ch = s.charAt(i);
        //     if(ch=='('){
        //         stack.push(ch);
        //     }else{
        //         if(stack.isEmpty()){
        //             stack.push(ch);
        //         }else if(ch==')'&& stack.peek()!='('){
        //             stack.push(ch);
        //         }else{
        //             stack.pop();
        //         }
        //     }
        // }
        // while(!stack.isEmpty()){
        //     stack.pop();
        //     count++;

        // }
        // return count;

        
        
        int open=0,close=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                open++;
            }else{
                if(open<=0){
                    close++;
                }else{
                  open--;
                }
            }
        }
        return (open+close);
    }
}