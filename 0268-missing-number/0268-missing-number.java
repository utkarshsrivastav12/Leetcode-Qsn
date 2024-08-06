class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        // to calculate sum of given number
        int sumOfn= (int)n*(n+1)/2;
        int sumEle=0;
        //for calculating to sum of all element in array
        for(int i = 0 ;i<n;i++){
            sumEle+=nums[i];
        }
        //for find to which element miss in the array
        int res= sumOfn-sumEle;
    return res; 
    }
}