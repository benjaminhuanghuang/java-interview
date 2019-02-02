package cn.huang.leetcode.common;

/*
https://www.youtube.com/watch?v=rYBtViWXYeI&index=1&list=PLLuMmzMTgVK5Hy1qcWYZcd7wVQQ1v0AjX

QueryTree O(logN +k )
UpdateTree O(logN)

 */
public class SegmentTreeNode {
    public int start;
    public int end;
    public int sum;

    public SegmentTreeNode left;
    public SegmentTreeNode right;

    public SegmentTreeNode() {
    }

    public SegmentTreeNode(int start, int end, int sum, SegmentTreeNode left, SegmentTreeNode right) {
        start = start;
        end = end;
        sum = sum;
        left = left;
        right = right;
    }

    public SegmentTreeNode buildTree(int start, int end, int[] nums) {
        if (start == end)
            return new SegmentTreeNode(start, end, nums[start], null, null);

        int mid = start + (end - start) / 2;
        SegmentTreeNode left = buildTree(start, mid, nums);
        SegmentTreeNode right = buildTree(mid + 1, end, nums);

        return new SegmentTreeNode(start, end, left.sum + right.sum, left, right);
    }

    public void updateTree(SegmentTreeNode root, int i, int val) {
        if (root.start == i && root.end == i) {
            root.sum = val;
            return;
        }

        int mid = root.start + (root.end - root.start) / 2;

        if (i < mid) {
            updateTree(root.left, i, val);
        } else {
            updateTree(root.right, i, val);
        }
        root.sum = root.left.sum + root.right.sum;
    }

    public int sumRange(SegmentTreeNode root, int i, int j) {
        if (root.start == i && root.end == j) {
            return root.sum;
        }

        int mid = root.start + (root.end - root.start) / 2;

        if (j < mid) {
            return sumRange(root.left, i, j);
        } else if (i > mid) {
            return sumRange(root.right, i, j);
        } else {
            return sumRange(root.left, i, mid) + sumRange(root.right, mid + 1, j);
        }
    }
}
