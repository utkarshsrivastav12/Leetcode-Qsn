class Solution {
    public int singleNonDuplicate(int[] nums) {
     //Using Binary Search 
     int start = 0;
     int end = nums.length-2;
     while(start<=end){
        int mid = start + (end-start)/2;
        //if left half -> move right half
        if(nums[mid]==nums[mid^1]){
            start = mid +1;
        }
        //if right half -> move left half
        else{
            end = mid-1;
        }
     }
    return nums[start];

    }

}



        //Second method to solve this in O(n) time complexity
        //using bit_manipulation
    //    int ans=0;
    //    for(int i = 0 ;i<nums.length;i++){
    //     ans = ans ^ nums[i];
    //    } 
    //    return ans;
//     }
// }