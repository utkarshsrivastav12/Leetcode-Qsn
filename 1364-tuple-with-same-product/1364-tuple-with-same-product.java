class Solution {
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer,Integer>pMap = new HashMap<>();
        int n =nums.length;
        for(int i =0;i<n;i++){
            for(int j =i+1;j<n;j++){
                int res = nums[i]*nums[j];
                pMap.put(res,pMap.getOrDefault(res,0)+1);
            }
        }
        int ans =0;
        for(Map.Entry<Integer,Integer>entry: pMap.entrySet()){
            int p = entry.getKey();
            int c = entry.getValue();
            if(c>=2){
                int comb = (c * (c-1))/2;
                ans = ans+comb*8;
            }
        }
        return ans;
    }
}