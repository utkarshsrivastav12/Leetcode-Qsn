class Solution {
    public int maximumProduct(int[] nums, int k) {
        PriorityQueue<Integer>q=new PriorityQueue<>();
        for(int num : nums){
            q.offer(num);
        }
        while(k>0){
            int a=q.poll();
            a++;
            q.offer(a);
            k--;
        }
      long ans=1;
        while(!q.isEmpty()){
            int b =q.poll();
            ans=(ans*b)%1000000007;
        }
        return (int)ans;
    }
}