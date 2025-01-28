// import java.util.Arrays;


class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }
        
        return true;
  
    //  HashMap<Character,Integer>map= new HashMap<>();
    //  for(int i =0;i<s.length();i++){
    //     char ch = s.charAt(i);
    //     map.put(ch,map.getOrDefault(ch,0)+1);
    //  }
    //  for(int i=0;i<t.length();i++){
    //     char ch = t.charAt(i);
    //    if(map.get(ch)!=null){ 
    //     if(map.get(ch)==1){
    //         map.remove(ch);
    //     }else{
    //         map.put(ch,map.get(ch)-1);
    //     }  
    //    }else{
    //     return false;
    //    }
    //  }
    //  if(map.isEmpty()){
    //     return true;
    //  }
    //  return false;


        





        // char[] sChars = s.toCharArray();
        // char[] tChars = t.toCharArray();

        // Arrays.sort(sChars);
        // Arrays.sort(tChars);
        // return Arrays.equals(sChars, tChars);
    }
}