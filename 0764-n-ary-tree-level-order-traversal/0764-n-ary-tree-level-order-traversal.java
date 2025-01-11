/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res= new ArrayList<>();
        if(root==null){
            return res;
        }
       
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            ArrayList<Integer> levelList = new ArrayList<>();
            while(size>0){
                Node node = q.poll();
                levelList.add(node.val);
                for(Node child : node.children){
                    if(child!=null){
                        q.offer(child);
                    }
                }
                size--;
            }
            res.add(levelList);
        }
        return res;
    }
}