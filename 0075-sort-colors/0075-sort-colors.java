class Solution {
    public void sortColors(int[] nums) {
        
        int zero=0;
        int one= 0;
        int two= 0;
        for(int i = 0;i< nums.length;i++){
            if(nums[i]==0)
             zero++;
            else if(nums[i]==1)
             one++;
            else
             two++;
        }
            //count print
            int arrInt =0;
            for(int i =0;i<zero;i++){
                nums[arrInt]=0;
                arrInt++;
            }
             for(int i =0;i<one;i++){
                nums[arrInt]=1;
                arrInt++;
            }
             for(int i =0;i<two;i++){
                nums[arrInt]=2;
                arrInt++;
            }
    }
}