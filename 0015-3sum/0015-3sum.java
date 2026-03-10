class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> result = new HashSet<>();
        if(nums.length<=0) return new ArrayList<>();

        Arrays.sort(nums);
        // for(int i=0; i<nums.length-2; i++) {
        //     int j=i+1;
        //     int k=nums.length-1;
        //     while(k>j) {
        //         int sum = nums[j] + nums[k] + nums[i];
        //         if(sum == 0)
        //             result.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
        //         else if (sum > 0)
        //             k--;
        //         else
        //             j++;
        //     }
        // }
        // return new ArrayList(result);
       int n = nums.length;
        for(int i =0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int l=i+1;
            int r=nums.length-1;
            int sum = -1* nums[i];
            while(l<r){
                int s = nums[l]+nums[r];
                if(s==sum){
                    result.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    r--;
                    while(l<n && nums[l]==nums[l-1]){
                        l++;
                    }
                    while(r>=0 && nums[r]==nums[r+1]){
                        r--;
                    }
              }
                else if(s<sum){
                    l++;
                }else{
                    r--;
                }
        }
            }
            return new ArrayList(result);
        
    }
}