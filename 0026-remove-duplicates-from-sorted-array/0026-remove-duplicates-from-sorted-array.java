class Solution {
    public int removeDuplicates(int[] nums) {
        int s = 0;
        for(int e= 1;e<nums.length;e++){
            if(nums[s]!=nums[e]){
                s++;
                nums[s]=nums[e];
            }
        }
        return s+1;
    }
}