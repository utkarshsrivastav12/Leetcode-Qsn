/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    // List<Integer>list=new ArrayList<>();
    
    public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer>res = new ArrayList<>();
    Stack<TreeNode>stack = new Stack<>();
    TreeNode node = root;
    while(node!=null || !stack.isEmpty()){
        while(node!=null){
            stack.push(node);
            node=node.left;
        }
        node=stack.pop();
        res.add(node.val);
       node= node.right;
    }
    return res;
    }
}

//          List<Integer>res=new ArrayList<>();
//          Stack<TreeNode>stack = new Stack<>();
//          TreeNode node = root;
        
//          while(node!=null || !stack.isEmpty() ){
//             while(node!=null){
//                 stack.push(node);
//                 node = node.left;
//             }
//             node = stack.pop();
//             res.add(node.val);

//             node = node.right;
//          }
//          return res;
//     }
// }
    //     if(root ==null)
    //     return list;

    //     inorderTraversal(root.left);
    //      list.add(root.val);
    //     inorderTraversal(root.right);

    //     return list;
    // }
    // public List<Integer> inorderTraversal(TreeNode root) {
    //     if(root ==null)
    //     return new ArrayList<>();
    //     inorderTraversal(root.left);
    //      list.add(root.val);
    //     inorderTraversal(root.right);

    //     return list;
    // }
// }