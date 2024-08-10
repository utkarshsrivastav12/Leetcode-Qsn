class Solution {
    public String reverseWords(String s) {
    String ansArr[] = s.split(" ");
    int n = ansArr.length;
   String ans = "";
        for(int i =n-1;i>=0;i--){
            if(!ansArr[i].isEmpty() && ans.isEmpty()){        
            ans+=ansArr[i];
            }else if(!ansArr[i].isEmpty() && !ans.isEmpty()){
                ans+=" "+ansArr[i];
            }
        }
        
        return ans;
    }
}
