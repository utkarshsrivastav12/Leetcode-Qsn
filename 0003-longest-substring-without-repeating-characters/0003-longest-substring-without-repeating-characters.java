class Solution {
    public int lengthOfLongestSubstring(String s) {

        int windS = 0;
int windE = 0;
int maxLen = Integer.MIN_VALUE;
int n= s.length();
HashMap<Character,Integer> map = new HashMap<>();
while(windE<n){
    char ch = s.charAt(windE);
    if(map.containsKey(ch) && map.get(ch)>=windS){
        windS = map.get(ch)+1;
    }
    map.put(ch,windE);
    maxLen = Math.max(maxLen,windE-windS+1);
    windE++;
}
return (maxLen == Integer.MIN_VALUE)?0:maxLen;
}
}
//     int windS=0;
//     int windE=0;
//     int maxLen= Integer.MIN_VALUE;
//     HashSet <Character>set = new HashSet<>();
//     int n =s.length();
//     while(windE<n){
//  char ch = s.charAt(windE);
//  if(set.contains(ch)){
//     //shrinking phase
//     while(windS<windE && set.contains(ch)){
//      set.remove(s.charAt(windS));
//      windS++;
//     }
//  }
//  set.add(ch);
//  maxLen = Math.max(maxLen,windE-windS+1);
// // maxLen=set.size();
//  windE++;
//     }
//     return (maxLen==Integer.MIN_VALUE)?0:maxLen;
//     }
//     }



        // Set<Character>set=new HashSet<>();
        // int maxLength=0;
        // int left=0;
        // for(int right=0;right<s.length();right++){
           
        //     if(!set.contains(s.charAt(right))){
        //         set.add(s.charAt(right));
        //         maxLength=Math.max(maxLength,right-left+1);
                
        //     }else{
        //         while(s.charAt(left)!=s.charAt(right)){
        //             set.remove(s.charAt(left));
        //             left++;
        //         }
        //         set.remove(s.charAt(left));left++;
        //         set.add(s.charAt(right));
        //     }
            
        // }
        // return maxLength;
//     }
// }