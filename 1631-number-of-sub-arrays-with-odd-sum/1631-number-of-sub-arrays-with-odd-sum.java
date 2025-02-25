class Solution {
    public int numOfSubarrays(int[] arr) {
        int MOD = 1000000007;
        int oC = 0 , eC = 1;
        int sum = 0,res = 0;
        for(int num : arr){
            sum+=num;
            if(sum%2==0 ){
                res = (res+oC)%MOD;
                eC++;
            }else{
                res = (res+eC)%MOD;
                oC++;
            }
        }
        return res;
    }
}