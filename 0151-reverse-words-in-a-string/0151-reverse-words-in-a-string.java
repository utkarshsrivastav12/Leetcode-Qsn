class Solution {
 public static String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int startIndex = s.length()-1;
        while(startIndex>=0){ 
            while(startIndex>=0 && s.charAt(startIndex)==' '){
                startIndex--;
            }
            if(startIndex < 0){
                break;
            }
            int endIndex = startIndex;
            // Find the start of the word
            while(startIndex >= 0 && s.charAt(startIndex)!= ' '){
                startIndex--;
            }
            if(ans.isEmpty()){        
            ans.append(s.substring(startIndex+1, endIndex+1));
            }else if(!ans.isEmpty()){
                ans.append(" ");
                ans.append(s.substring(startIndex+1, endIndex+1));
            }
        }
return ans.toString();
    }



//1st method
//     String ansArr[] = s.split(" ");
//     int n = ansArr.length;
//    String ans = "";
//         for(int i =n-1;i>=0;i--){
//             if(!ansArr[i].isEmpty() && ans.isEmpty()){        
//             ans+=ansArr[i];
//             }else if(!ansArr[i].isEmpty() && !ans.isEmpty()){
//                 ans+=" "+ansArr[i];
//             }
//         }
        
//         return ans;
//     }
}
