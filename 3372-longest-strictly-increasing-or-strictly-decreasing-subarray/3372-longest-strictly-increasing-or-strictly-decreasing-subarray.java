class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int ans = 0;
        int asc = 0;
        int desc = 0;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]<nums[i+1]){
                asc++;
                ans = Math.max(ans, asc);
                desc = 0;
            }
            else if(nums[i]>nums[i+1]){
                desc++;
                ans = Math.max(ans, desc);
                asc = 0;
            }else{
                asc = 0;
                desc = 0;
            }
        }
        if(ans==0) return 1;
        return ans+1;
    }
}