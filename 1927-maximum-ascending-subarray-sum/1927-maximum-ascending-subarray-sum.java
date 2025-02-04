class Solution {
    public int maxAscendingSum(int[] nums) {
      int n =nums.length;
      if(n==1) return nums[0];
        int maxSum=Integer.MIN_VALUE;
        int sum=nums[0];
     
        for(int i=0;i<n-1;i++){
            maxSum=Math.max(sum,maxSum);
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