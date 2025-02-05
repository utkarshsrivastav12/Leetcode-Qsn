class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int c=0;
       StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
       for(int i =0;i<s1.length();i++){
        if(s1.charAt(i)!=s2.charAt(i)){
            c++;
            a.append(s1.charAt(i));
            b.append(s2.charAt(i));
        }
       }
        if (c == 0) return true;
        if (c == 2) {
            return a.charAt(0) == b.charAt(1) && a.charAt(1) == b.charAt(0);
        }
        return false;
    }
}