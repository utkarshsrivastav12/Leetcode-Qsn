class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Set<Integer>set = new HashSet<>();
        int n = grid.length;
        int actualValue=0;
        int expectedValue=0;
        int a=0,b;
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                actualValue+=grid[i][j];
                if(set.contains(grid[i][j])){
                 a = grid[i][j];
                
                }
                set.add(grid[i][j]);
            }
        }
        expectedValue = (n*n)*(n*n+1)/2;
        b= expectedValue + a - actualValue;

        return new int[]{a,b};
    }

}