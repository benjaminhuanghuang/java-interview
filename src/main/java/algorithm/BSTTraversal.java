package algorithm;

import java.util.Stack;

public class BSTTraversal {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int x) {
            val = x;
        }
    }

    public static String preorderTraversal(TreeNode root) {
        StringBuilder builder = new StringBuilder();
        //用栈来存储节点
        Stack<TreeNode> stack = new Stack<TreeNode>();
        //根节点入栈
        stack.push(root);
        while (!stack.empty()) {
            //栈顶元素出栈
            TreeNode n = stack.pop();
            builder.append(n.val);
            //由于是 先序，所以让右节点先入栈
            if (n.right != null) {
                stack.push(n.right);
            }
            //左节点再入栈，这样出栈的时候左节点就可以先出栈
            if (n.left != null) {
                stack.push(n.left);
            }
        }
        return builder.toString();
    }

    public static String inorderTraversal(TreeNode root) {
        StringBuilder builder = new StringBuilder();
        if (root == null) {
            return null;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode p = root;
        while (!stack.isEmpty() || p != null) {
            if (p != null) {
                stack.push(p);
                p = p.left;
            } else {
                TreeNode t = stack.pop();
                builder.append(t.val);
                p = t.right;
            }
        }
        return builder.toString();
    }

    public static String postOrderTraversal(TreeNode root) {
        StringBuilder builder = new StringBuilder();
        if(root == null){
            return null;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        //根节点入栈
        stack.push(root);
        while(!stack.isEmpty()){
            //peek method : Looks at the object at the top of this stack without removing it from the stack.
            TreeNode temp = stack.peek();
            //如果节点左右孩子都为空，则出栈输出值
            if(temp.left == null && temp.right == null){
                TreeNode pop = stack.pop();
                builder.append(pop.val);
            }
            else{
                //如果右孩子不为空，则入栈
                if(temp.right != null){
                    stack.push(temp.right);
                    //右孩子入栈后置为空。因为节点输出值时判断该节点的左右孩子是否为空，
                    //所以如果该节点的右孩子入栈后不置为空，则该节点出栈输出值时判断就会出现问题。
                    temp.right = null;
                }
                //如果左孩子不为空，则入栈，入栈后左孩子置为空，原因如上
                if(temp.left != null){
                    stack.push(temp.left);
                    temp.left = null;
                }
            }
        }
        return builder.toString();
    }
}
