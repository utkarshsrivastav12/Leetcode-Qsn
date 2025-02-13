class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long>pq = new PriorityQueue<>();
        for(long num : nums){
            pq.offer(num);
        }
        int count=0;
        while(!pq.isEmpty()){
            
            if(pq.peek()>=k){
                return count;
            }else{
                count++;
                long first  = pq.poll();
                long second = pq.poll();
                long nE = Math.min(first,second)*2+ Math.max(first,second);
                pq.offer(nE);

            }
           
        }
        return count;
    }
}