class Solution {
    public int[] searchRange(int[] nums, int target){
     int a[] = new int[2];
     a[0]=searchOccur(nums,target,true);
     a[1]=searchOccur(nums,target,false);
     return  a;
     }
     public int searchOccur(int arr[] ,int target, boolean isFirst){
        int start=0;
        int end = arr.length-1;
        int ans =-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
               ans = mid;
               if(isFirst){
                 end = mid-1;
               }else{
                start= mid+1;
               }
               }else if(arr[mid]<target){
                 start= mid+1;
               }else{
                end= mid-1;
               }
            }
            return ans;
        }
    }

//         int res[] = new int[2]; 
//         int first = binarySearch(nums,target,true);
//         int last = binarySearch(nums,target,false);
//         res[0] = first;
//         res[1] = last;
//         return res;

//     }
//     static int binarySearch(int arr[], int target,boolean isFirst) {
//         int ans = -1;
//        int start = 0;
//        int end = arr.length-1;
//        while(start<=end){
//         int mid = start + (end-start)/2;
//         if(arr[mid]==target){
//             ans = mid;
//             if(isFirst){
//                    end= mid-1;
//             }else{
//                 start = mid+1;
//             }
//         }else if(arr[mid]<target){
//             start = mid+1;
//         }else{
//            end = mid-1; 
//         }
//        }
//        return ans;  
//     }
// } 
       
       
//        int s =0;
//        int l=nums.length-1; 
//        int first=-1;
//        int last=-1;
//        while(s<=l){
//            int mid=(s+l)/2;
//         if(nums[mid]==target){
//             first=mid;
//             l=mid-1;
//         }else if(nums[mid]<target){
//             s=mid+1;
//         }else{
//             l=mid-1;
//         }
//        }
//        s=0;
//        l=nums.length-1;
//     while(s<=l){
//         int mid=(s+l)/2;
//         if(nums[mid]==target){
//             last=mid;
//              s=mid+1;
//         }else if(nums[mid]<target){
//             s=mid+1;
//         }else{
//             l=mid-1;
//         }
//     }
//     return new int[]{first,last};
//     }
// }