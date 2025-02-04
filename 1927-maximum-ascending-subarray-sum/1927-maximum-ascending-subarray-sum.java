class Solution {
    public int maxAscendingSum(int[] nums) {
      int n =nums.length;
        int maxSum=nums[0];
        int sum=nums[0];
        for(int i=0;i<n-1;i++){
          if(nums[i]<nums[i+1]){
            sum+=nums[i+1];
            maxSum=Math.max(sum,maxSum);
          }else{
            sum=nums[i+1];
            continue;
          }
        }
        return maxSum;
    }
}