class Solution {
    public boolean validMountainArray(int[] arr) {
        int index =0;
        int n = arr.length;
        //find a increase seq(find the peek)
        while(index<n-1){
            if(arr[index]<arr[index+1]){
                index++;
            }else{
                break; 
            }
        }
        if(index==0 || index==n-1){
            return false;
        }
            while(index<n-1){
                if(arr[index]>arr[index+1]){
                  index++;
                }else{
                    break;
                }
        }
        if(index==n-1){
            return true;
        }
        return false;
    }
}