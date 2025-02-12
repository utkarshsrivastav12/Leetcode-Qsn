class Solution {
    public int maximumSum(int[] nums) {
      HashMap<Integer,Integer>map= new HashMap<>();
      int mS=-1;
      for(int i =0;i<nums.length;i++){
            int dS = dSum(nums[i]);
            if(map.containsKey(dS)){
               mS= Math.max(mS, map.get(dS) + nums[i]);
                map.put(dS, Math.max(map.get(dS), nums[i]));
            }else{
                map.put(dS, nums[i]);
            }
      }
      return mS;
    }

       private int dSum(int n ){
              int sum = 0;
              while(n>0){
                sum += n%10;
                n=n/10;
              }
              return  sum;
        }
}