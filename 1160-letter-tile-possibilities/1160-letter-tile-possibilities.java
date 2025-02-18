class Solution {
    public int numTilePossibilities(String tiles) {
         Map<Character, Integer> countMap = new HashMap<>();
        for (char ch : tiles.toCharArray()) {
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }
        return bT(countMap);
    }

    private static int bT(Map<Character, Integer> countMap) {
        int total = 0;
        for (char ch : countMap.keySet()) {
            if (countMap.get(ch) > 0) {
                countMap.put(ch, countMap.get(ch) - 1);
                total += 1 + bT(countMap );
                
                countMap.put(ch, countMap.get(ch) + 1); // Backtrack
            }
        }
        return total;
    }
}

