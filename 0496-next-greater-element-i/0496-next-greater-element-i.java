class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer>stack=new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        int n1 = nums1.length;
        int n2 = nums2.length;
        for(int j = n2-1;j>=0;j--){
            while(!stack.isEmpty() && stack.peek() <= nums2[j]){
                stack.pop();
            }
            if(stack.isEmpty()){
               map.put(nums2[j],-1);
            }else{
                map.put(nums2[j],stack.peek());
            }
            stack.push(nums2[j]);  
        }
        for(int i = 0 ;i<n1;i++){
            nums1[i]  = map.get(nums1[i]);
        }
        return nums1;
    }
}