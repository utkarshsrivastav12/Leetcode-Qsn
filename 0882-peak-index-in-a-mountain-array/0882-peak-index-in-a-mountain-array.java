class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = end+(start-end)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }else if(arr[mid]>arr[mid-1]){//inc
               start = mid+1;
            }else{//dec
                end=mid-1;
            }
        }
        return -1;//never  be return why because question is already given it is bitonic array 

}
}