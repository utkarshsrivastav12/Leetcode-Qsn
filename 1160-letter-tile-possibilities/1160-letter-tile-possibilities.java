class Solution {
    public int numTilePossibilities(String tiles) {
         Map<Character, Integer> countMap = new HashMap<>();
        for (char tile : tiles.toCharArray()) {
            countMap.put(tile, countMap.getOrDefault(tile, 0) + 1);
        }
        return backtrack(countMap);
    }
    
    private static int backtrack(Map<Character, Integer> countMap) {
        int total = 0;
        for (char tile : countMap.keySet()) {
            if (countMap.get(tile) > 0) {
                countMap.put(tile, countMap.get(tile) - 1);
                total += 1 + backtrack(countMap);
                countMap.put(tile, countMap.get(tile) + 1); // Backtrack
            }
        }
        return total;
    }
}

