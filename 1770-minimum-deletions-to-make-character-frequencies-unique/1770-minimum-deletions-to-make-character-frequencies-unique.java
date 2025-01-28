class Solution {
    public int minDeletions(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int n=s.length();
    for(int i =0;i<n;i++){
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
    }
    PriorityQueue<Integer>queue=new PriorityQueue<>(Collections.reverseOrder());
    for(Map.Entry<Character,Integer>entry:  map.entrySet()){
        queue.offer(entry.getValue());
    }
    int count =0;
    while(!queue.isEmpty()){
       int top = queue.poll();
       if(queue.isEmpty()) break;
       if(top==queue.peek()){
        top--;
        if(top>=0){
            count++;
            queue.offer(top);
        }
       }
    }
    return count;
    }
}