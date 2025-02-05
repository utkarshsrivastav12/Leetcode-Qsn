class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int diffCount = 0;
        int first = -1, second = -1;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                diffCount++;
                if (diffCount > 2) return false; // Early exit for efficiency
                if (first == -1) first = i;
                else second = i;
            }
        }

        if (diffCount == 0) return true;
        if (diffCount == 2) {
            return s1.charAt(first) == s2.charAt(second) &&
                   s1.charAt(second) == s2.charAt(first);
        }

        return false;
    }
}
