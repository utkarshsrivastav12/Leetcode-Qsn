class Solution {
    public int firstMissingPositive(int[] nums) {

      Arrays.sort(nums);
      int c=1;
      for(int i=0;i<nums.length;i++){
        if(nums[i]==c && nums[i]<=c){
            c++;
        }
      }
      return c;
    }
}

//         int i =1;
//         for(i=1;i<=nums.length+1;i++){
           
//             for(int j=0;j<nums.length;j++){
//                 if(nums[j]==i){
//                    break;
//                 }
//                 if(j==nums.length-1){
//                   return i;  
//                 } 
//             }
//         }
//         return i;
//     }
// }