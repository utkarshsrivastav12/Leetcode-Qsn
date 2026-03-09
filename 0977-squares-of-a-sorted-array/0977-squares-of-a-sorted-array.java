class Solution {
    public int[] sortedSquares(int[] nums) {
        // int[] res = new int[nums.length];
        // for(int i = 0;i<nums.length;i++){
        //     nums[i]= nums[i]*nums[i];
        // }
        // int l=0;
        // int r = nums.length-1;
        // for(int j=nums.length-1;j>=0;j--){
        //     if(nums[l]>nums[r]){
        //         res[j]=nums[l];
        //         l++;
        //     }else{
        //         res[j]=nums[r];
        //         r--;
        //     }
        // }
        // return res;
int[] res = new int[nums.length];
for(int i =0;i<nums.length;i++){
    nums[i]=nums[i]*nums[i];
}
int l=0;
int r = nums.length-1;
for(int i =nums.length-1;i>=0;i--){
    if(nums[l]>nums[r]){
        res[i]=nums[l];
        l++;
    }else{
        res[i]=nums[r];
        r--;
    }
}
       return res;
    }
}





