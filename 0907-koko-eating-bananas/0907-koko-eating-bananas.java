class Solution {
    public int minEatingSpeed(int[] piles, int h) {
     int start=1;
     int end = Integer.MIN_VALUE;//for finding largest value in piles
     //finding max
     for(int i =0;i<piles.length;i++){
        if(piles[i]>end){
            end = piles[i];
        }
     }

     int ans=-1;
     //apply binary search on the possible value of k->(1,max(piles))
    while(start<=end){
        int mid = start+ (end-start)/2;
        if(isEatingSpeedValid(piles,mid,h)){
            ans=mid;
            end=mid-1;
        }else{
            start=mid+1;
        }
    }
    return ans;
    }
 
   static boolean isEatingSpeedValid(int piles[],int eatingSpeed,int hours){
    int hourSpent=0;
    for(int i =0;i<piles.length;i++){
        hourSpent+= piles[i]/eatingSpeed;
        if(piles[i]%eatingSpeed!=0){
            hourSpent++;
        }
        if(hourSpent>hours){
            return false;
        }
    }
    return true;
   }
}