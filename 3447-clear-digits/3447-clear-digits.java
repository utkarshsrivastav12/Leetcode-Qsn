class Solution {
    public String clearDigits(String s) {
     StringBuilder res = new StringBuilder();
     for(int i =0;i<s.length();i++){
        char ch = s.charAt(i);
        if(ch >='a' && ch <= 'z'){
            res.append(ch);
        }else if(res.length()>=1){
            res.deleteCharAt(res.length()-1);
        }
     }
     return res.toString();
    }
}