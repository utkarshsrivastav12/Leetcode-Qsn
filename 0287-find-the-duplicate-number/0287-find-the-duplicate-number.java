class Solution {
    public int findDuplicate(int[] nums) {
    Set<Integer>set =new HashSet();
    for(int i = 0;i<nums.length;i++){
        if(set.contains(nums[i]))
          return nums[i];
        set.add(nums[i]);
    }
  return -1;
    }
    }
//        for(int i =0;i<nums.length;i++){
//         for(int j = i+1;j<nums.length;j++){
//             if(nums[i]==nums[j]) 
//              return nums[i];
//         }
//        }
//        return -1;
//     }
// }