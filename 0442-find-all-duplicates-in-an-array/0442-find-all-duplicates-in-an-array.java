class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        // Solutoin 1st----------------
//         List<Integer>list = new ArrayList<>();
//         Set<Integer>set =new HashSet();
//     for(int i = 0;i<nums.length;i++){
//         if(set.contains(nums[i]))
//           list.add(nums[i]);
//         set.add(nums[i]);
//     }
//   return list;
//     }



// // solution 2nd-----

List<Integer>list = new ArrayList<>();
for(int i = 0 ; i<nums.length;i++){
   int element = Math.abs(nums[i]);
   int actualIndex = element-1;
   if(nums[actualIndex]<0){
    list.add(element);
   }
    nums[actualIndex]=-1*nums[actualIndex];
   
  }
  return list;
}
}


//   public void cycleSort(int arr[]){
//     int n = arr.length;
//     int index = 0;
//     while(index<n){
//         int element = arr[index];
//         int correctPos= element-1;
//         if(arr[index]!=arr[correctPos]){
//             swap(arr,index,correctPos);
//         }else{
//             index++;
//         }
//     }
//   }
//  public void swap(int arr[],int id1,int id2){
//     int temp = arr[id1];
//     arr[id1]=arr[id2];
//     arr[id2]= temp;
//  }


//  } 
    
