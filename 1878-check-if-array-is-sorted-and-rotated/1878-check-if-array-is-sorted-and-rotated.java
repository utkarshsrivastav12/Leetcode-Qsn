class Solution {
    public boolean check(int[] nums) {

        int n = nums.length;
        int c =0;
        // boolean f = false;
        // for(int i =0;i<n;i++){
        //     if(nums[i]!=nums[(i+1)%n]){
        //         f=true;
        //         break ;
        //     }
        // }
        // if(f==false) return true;
        for(int i =0;i<n;i++){
            if(nums[i]>nums[(i+1)%n]){
                c++;
            }
        }
     
        return c <=1;
    
    }
}