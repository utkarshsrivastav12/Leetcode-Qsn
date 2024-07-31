class Solution {
    public int shipWithinDays(int[] weights, int days) {
        //range will be max of array and sum of array..
       int start = Integer.MIN_VALUE;//for finding max
       int end = 0;//sum of array
       //find range
       for(int i = 0; i<weights.length;i++){
        if(start<weights[i]){
            start= weights[i];
        }
        end = end+weights[i];
       } 
      int res=-1;
      while(start<=end){
        //max capacity taht can be shipped in one day
        int mid = start+(end-start)/2;
        //if shipment is possible then minimize the capacity
        if(isShipmentPossible(weights,mid,days)){
            res=mid;
            end=mid-1;
        }else{
            start=mid+1;
        }
      }
      return res;
    }

    public static boolean isShipmentPossible(int weights[],int maxCapacity,int days){
        int currentDay=1;
        int capacity = 0;
        for(int i =0;i<weights.length;i++){
            capacity +=weights[i];
            //if capacity exceed maxCapacity
            if(capacity>maxCapacity){
                // shop on the next day
                currentDay++;
                capacity = weights[i];
            }
            if(currentDay>days){
                return false;
            }
        }
        return true;
    }
}