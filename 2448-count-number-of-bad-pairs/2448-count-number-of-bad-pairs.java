// class Solution {
//     public long countBadPairs(int[] nums) {
//         long res=0;
//         int n = nums.length;
//         for(int i =0;i<n;i++){
//             for(int j =i;j<n;j++){
//                 if(i<j){
//                     if((j-i)!=nums[j]-nums[i]){
//                         res++;
//                     }
//                 }
//             }
//         }
//  return res;
//     }
// }
import java.util.HashMap;

class Solution {
    public long countBadPairs(int[] nums) {
        long n = nums.length;
        long totalPairs = n * (n - 1) / 2; // Total pairs (nC2)
        long goodPairs = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int key = nums[i] - i;
            goodPairs += map.getOrDefault(key, 0);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        return totalPairs - goodPairs;
    }
}
