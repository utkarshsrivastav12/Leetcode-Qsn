class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer>freqMap = new HashMap<>();
        for(int i = 0 ;i<t.length();i++){
            char ch = t.charAt(i);
            freqMap.put(ch,freqMap.getOrDefault(ch,0)+1);
        }
        int uniqCountChar= freqMap.size();
        int startIndex=-1;
        int windS=0;
        int windE=0;
        int N = s.length();
        int minLen=Integer.MAX_VALUE;
        while(windE<N){
            //Expension Phase
            char ch = s.charAt(windE);
            if(freqMap.containsKey(ch)){
             freqMap.put(ch,freqMap.get(ch)-1);

             if(freqMap.get(ch)==0)
              uniqCountChar--;

            }
            while(uniqCountChar==0){
            if( uniqCountChar==0){
                int len = windE-windS+1;
                if(len<minLen){
                    minLen=len;
                    startIndex = windS;
                }
               ch = s.charAt(windS);
                if(freqMap.containsKey(ch)){
                    freqMap.put(ch,freqMap.get(ch)+1);
                    if(freqMap.get(ch)>0){
                        uniqCountChar++;
                    }
                }
                windS++;
            }
            }
            windE++;
        }
        if(startIndex==-1){
            return "";
        }
        return s.substring(startIndex,startIndex+minLen);
    }
}