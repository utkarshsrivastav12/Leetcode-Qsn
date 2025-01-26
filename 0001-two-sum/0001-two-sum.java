class Solution {
    public int[] twoSum(int[] nums, int target) {
    // for(int i=0;i<nums.length;i++){
    // for(int j = i+1;j<nums.length;j++){
    //     if(nums[i]+nums[j]==target){
    //         return new int[]{i,j};
    //     }

    // }
    // // return {};
    // }
    // return new int[]{};
    // }}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
       HashMap<Integer,Integer>hm = new HashMap<>();
       for(int i =0 ; i<nums.length;i++){
        int first=nums[i];
        int second = target-first;
        if(hm.containsKey(target-nums[i])){
            // int arr[]={hm.get(target-nums[i]),i};
            // if match then return the i and which target meet index return
            return new int[] {hm.get(second),i};
        }
            hm.put(first,i);
        }
       
       
       return null;
    }
}
