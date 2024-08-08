class Solution {
    public int findDuplicate(int[] nums) {
        // Solution 1st------------------
//     Set<Integer>set =new HashSet();
//     for(int i = 0;i<nums.length;i++){
//         if(set.contains(nums[i]))
//           return nums[i];
//         set.add(nums[i]);
//     }
//   return -1;
//     }
//     }

// Solution 2nd-------------------------
   cycleSort(nums);
   for(int i = 0;i<nums.length;i++){
    if(nums[i]!=i+1){
        return nums[i];
    }
   }
   return -1;
}
    public void cycleSort(int arr[]){
        int n = arr.length;
        int index =0;
        for(int i= 0 ;i<n;i++){
            int element= arr[index];
            int correctPos=element-1;
            if(arr[index]!=arr[correctPos]){
            swap(arr,index,correctPos);
             }else{
                index++;
             }
        }
    }
    public void swap(int arr[],int id1,int id2){
        int temp = arr[id1];
        arr[id1] = arr[id2];
        arr[id2]= temp;
    }
}





// Solution 3rd---------------------------------
//        for(int i =0;i<nums.length;i++){
//         for(int j = i+1;j<nums.length;j++){
//             if(nums[i]==nums[j]) 
//              return nums[i];
//         }
//        }
//        return -1;
//     }
// }