class StockSpanner {
    Stack<Integer>stack = new Stack<>();
    ArrayList<Integer>list = new ArrayList<>();
    public StockSpanner() {
        stack = new Stack<>();
        list = new ArrayList<>();
    }
    
    public int next(int price) {
        list.add(price);
        // index = stack.peek() 
        //list.get(index) ->value
        while(!stack.isEmpty() && list.get(stack.peek())<=price){
            stack.pop();
        }
        int prevGreterIndex = (stack.isEmpty())?-1:stack.peek();
        int currentIndex = list.size()-1;
        int ans = currentIndex-prevGreterIndex;
        stack.push(currentIndex);
        return ans;

    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */