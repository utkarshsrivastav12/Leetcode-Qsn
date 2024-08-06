class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sumOfn= (int)n*(n+1)/2;
        int sumEle=0;
        for(int i = 0 ;i<n;i++){
            sumEle+=nums[i];
        }
        int res= sumOfn-sumEle;
    return res; 
    }
}