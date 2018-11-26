package cn.huang.leetcode;

/*
684. Redundant Connection

 */
public class LC_0684_RedundantConnection {
    public int[] findRedundantConnection(int[][] edges) {
        //root of every node, if the root is the same, then the edge is redundant
        int size = edges.size() + 1;
        vector<int> root (size);
        //ans
        vector<int> ans;
        //in the begining, every node's root is itself
        for (int i = 1; i <= edges.size(); i++) {
            root[i] = i;
        }
        //find the root of every node
        for (int i = 0; i < edges.size(); i++) {
            Union(edges[i][0], edges[i][1], root, ans);
        }
        return ans;
    }

    void Union(int first, int second, int[] root, int[] ans) {
        int root1 = findroot(first, root);
        int root2 = findroot(second, root);
        if (root1 != root2) {
            root[root2] = root1;
        } else {
            ans.clear();
            ans.push_back(first);
            ans.push_back(second);
        }
    }

    int findroot(int node, int[] root) {
        while (node != root[node]) {
            node = findroot(root[node], root);
        }
        return node;
    }
}
