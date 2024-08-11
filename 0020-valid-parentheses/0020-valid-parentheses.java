class Solution {
    public boolean isValid(String s) {
        int n =s.length();
        if(n%2!=0){
            return false;
        }
     Stack<Character>stack =new Stack<>();
     for(int i = 0 ;i<n;i++){
        char ch = s.charAt(i);
        if(ch=='(' || ch=='['||ch=='{'){
            stack.push(ch);
        }else{
            if(stack.isEmpty()){
                return false;
            }
            char top = stack.peek();
            if(ch == ')' && top !='(' ){
                return false;
            }else if(ch == ']' && top !='[' ){
                return false;
            }else if(ch == '}' && top !='{' ){
                return false;
            }else{
                stack.pop();
            }
        }
     }
    return stack.isEmpty();
     }






    //     Stack<Character> stack = new Stack<>();
    //     for (char c : s.toCharArray()) {
    //         if (c == '(' || c == '{' || c == '[') {
    //             stack.push(c);
    //         } else {
    //             if (stack.empty()) {
    //                 return false;
    //             }
    //             if (c == ')' && stack.peek() == '(') {
    //                 stack.pop();
    //             } else if (c == '}' && stack.peek() == '{') {
    //                 stack.pop();
    //             } else if (c == ']' && stack.peek() == '[') {
    //                 stack.pop();
    //             } else {
    //                 return false;
    //             }
    //         }
    //     }
    //     return stack.empty();
    // }
}