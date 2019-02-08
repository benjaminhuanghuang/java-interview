package cn.huang.leetcode.common;

import java.util.ArrayList;
import java.util.Stack;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        this.val = x;
    }

    //https://www.geeksforgeeks.org/inorder-tree-traversal-without-recursion/
    public void inorder(TreeNode root)
    {
        if (root == null)
            return;


        Stack<TreeNode> s = new Stack<TreeNode>();
        TreeNode curr = root;

        // traverse the tree
        while (curr != null || s.size() > 0)
        {

            /* Reach the left most Node of the curr Node (tree) */
            while (curr !=  null)
            {
                /* place pointer to a tree node on
                   the stack before traversing
                  the node's left subtree */
                s.push(curr);
                curr = curr.left;
            }

            /* Current must be NULL at this point */
            curr = s.pop();

            System.out.print(curr.val + " ");

            /* we have visited the node and its
               left subtree.  Now, it's right
               subtree's turn */
            curr = curr.right;
        }
    }

    public void preorder(TreeNode root) {

        // Base Case
        if (root == null) {
            return;
        }

        // Create an empty stack and push root to it
        Stack<TreeNode> s = new Stack<TreeNode>();
        s.push(root);

        /* Pop all items one by one. Do following for every popped item
         a) print it
         b) push its right child
         c) push its left child
         Note that right child is pushed first so that left is processed first */
        while (s.size() > 0) {

            // Pop the top item from stack and print it
            TreeNode curr = s.pop();
            System.out.print(curr.val + " ");

            // Push right and left children of the popped node to stack
            // right THEN left
            if (curr.right != null) {
                s.push(curr.right);
            }
            if (curr.left != null) {
                s.push(curr.left);
            }
        }
    }
    // An iterative function to do postorder traversal
    // of a given binary tree
    ArrayList<Integer> postOrderIterative(TreeNode node)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> s = new Stack<TreeNode>();

        // Check for empty tree
        if (node == null)
            return list;
        s.push(node);
        TreeNode prev = null;
        while (!s.isEmpty())
        {
            TreeNode current = s.peek();

            /* go down the tree in search of a leaf an if so process it
            and pop stack otherwise move down */
            if (prev == null || prev.left == current ||
                    prev.right == current)
            {
                if (current.left != null)
                    s.push(current.left);
                else if (current.right != null)
                    s.push(current.right);
                else
                {
                    s.pop();
                    list.add(current.val);
                }

                /* go up the tree from left node, if the child is right
                   push it onto stack otherwise process parent and pop
                   stack */
            }
            else if (current.left == prev)
            {
                if (current.right != null)
                    s.push(current.right);
                else
                {
                    s.pop();
                    list.add(current.val);
                }

                /* go up the tree from right node and after coming back
                 from right node process parent and pop stack */
            }
            else if (current.right == prev)
            {
                s.pop();
                list.add(current.val);
            }

            prev = current;
        }

        return list;
    }
    /*
    https://www.geeksforgeeks.org/morris-traversal-for-preorder/
     */
    // Preorder traversal without recursion and without stack
    void morrisPreorder(TreeNode node) {
        while (node != null) {

            // If left child is null, print the current node data. Move to
            // right child.
            if (node.left == null) {
                System.out.print(node.val + " ");
                node = node.right;
            } else {

                // Find inorder predecessor
                TreeNode current = node.left;
                while (current.right != null && current.right != node) {
                    current = current.right;
                }

                // If the right child of inorder predecessor already points to
                // this node
                if (current.right == node) {
                    current.right = null;
                    node = node.right;
                }

                // If right child doesn't point to this node, then print this
                // node and make right child point to this node
                else {
                    System.out.print(node.val + " ");
                    current.right = node;
                    node = node.left;
                }
            }
        }
    }
    /*
    https://www.geeksforgeeks.org/inorder-tree-traversal-without-recursion-and-without-stack/
     */
    void MorrisTraversal(TreeNode root)
    {
        TreeNode current, pre;

        if (root == null)
            return;

        current = root;
        while (current != null) {
            if (current.left == null) {
                System.out.print(current.val + " ");
                current = current.right;
            }
            else {
                /* Find the inorder predecessor of current */
                pre = current.left;
                while (pre.right != null && pre.right != current)
                    pre = pre.right;

                /* Make current as right child of its inorder predecessor */
                if (pre.right == null) {
                    pre.right = current;
                    current = current.left;
                }

                /* Revert the changes made in if part to restore the
                    original tree i.e., fix the right child of predecssor*/
                else {
                    pre.right = null;
                    System.out.print(current.val + " ");
                    current = current.right;
                } /* End of if condition pre->right == NULL */

            } /* End of if condition current->left == NULL*/

        } /* End of while */
    }
}
