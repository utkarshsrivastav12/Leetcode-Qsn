class Solution {
    public boolean check(int[] nums) {

        int n = nums.length;
        int c =0;
        boolean f = false;
        for(int i =0;i<n;i++){
            if(nums[i]!=nums[(i+1)%n]){
                f=true;
                break ;
            }
        }
        if(f==false) return true;
       
        for(int i =0;i<n;i++){
            if(nums[i]>nums[(i+1)%n]){
                c++;
            }

        }
        
        return c ==1;
    //      boolean flag1 = false;
    //      boolean flag2 = false;
    //     int k=-1;
    //     for(int i=0;i<nums.length-1;i++){
    //         if(flag2==false && nums[i]<=nums[i+1]){
    //             flag1 =true;
    //         }
    //         else if(flag2==false && flag1 && nums[i]>=nums[i+1]){
    //           k=i;
    //           break;
    //         }
    //         if(flag1==false && nums[i]>=nums[i+1]){
    //             flag2 =true;
    //         }
    //         else if(flag1==false &&  flag2 && nums[i]<=nums[i+1]){
    //           k=i;
    //           break;
    //         }
    //     }
        
    // System.out.print(k);
    //  return true;
    }
}