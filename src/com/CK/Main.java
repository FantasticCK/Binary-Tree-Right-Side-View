package com.CK;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

// BFS
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null)
            return res;
        Queue<TreeNode> list = new LinkedList<>();
        list.offer(root);
        list.offer(null);
        while (list.size() > 1) {
            TreeNode curr = list.poll();
            if (curr == null) {
                list.offer(null);
                continue;
            }
            if (list.peek() == null) {
                res.add(curr.val);
            }
            if (curr.left != null)
                list.offer(curr.left);
            if (curr.right != null)
                list.offer(curr.right);
        }
        return res;
    }
}