class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        // to calculate sum of given number
        int expectedSum = (int)n*(n+1)/2;
        int actualSum=0;
        //for calculating to sum of all element in array
        for(int i = 0 ;i<n;i++){
            actualSum+=nums[i];
        }
        //for find to which element miss in the array
        int res= expectedSum-actualSum;
    return res; 
    }
}