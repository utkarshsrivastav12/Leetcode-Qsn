class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // sort the array to basis of of index matching 
        cycleSort(nums);
        List<Integer>list = new ArrayList<Integer>();
        //find the missing number in the array 
        for(int i = 0;i<nums.length;i++){
            if(nums[i]!=i+1){
               list.add(i+1); 
            }
        }
        return list;
    }
    // Cycle Sort function
    public void cycleSort(int arr[]){
        int n= arr.length;
        int index = 0;
       while(index<n){
        int element = arr[index];
        int correctPos= element-1;
        // swap the element if element is not correct position 
        if(arr[index]!=arr[correctPos]){
            swap(arr,index,correctPos);
        }else{
            index++;
        }
       }
    }
    //Swapping function
    public void swap(int arr[],int index1,int index2 ){
        int temp = arr[index1];
        arr[index1]= arr[ index2];
        arr[index2]=temp;
    }
}