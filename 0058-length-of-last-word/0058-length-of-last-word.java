class Solution {
    public int lengthOfLastWord(String s) {
        String str[] = s.split(" ");//convert string to String array
        int n = str.length;//find the length of the String array 
        int len = str[n-1].length();// find the last Strng of the String length
        return len;
    }
}