class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int count=0;
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    stack.push(ch);
                }else if(ch==')'&& stack.peek()!='('){
                    stack.push(ch);
                }else{
                    stack.pop();
                }
            }
        }
        while(!stack.isEmpty()){
            stack.pop();
            count++;

        }
        return count;
    }
}