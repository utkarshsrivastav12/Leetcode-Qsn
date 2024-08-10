class Solution {
    public String reverseWords(String s) {
 String Arr[] = s.split(" ");
    int n = Arr.length;
   StringBuilder ans = new StringBuilder();
        for(int i =n-1;i>=0;i--){
            if(!Arr[i].isEmpty() && ans.isEmpty()){        
            ans.append(Arr[i]);
            }else if(!Arr[i].isEmpty() && !ans.isEmpty()){
                ans.append(" ");
                ans.append(Arr[i]);
            }
        }
        
        return ans.toString();
    }















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
