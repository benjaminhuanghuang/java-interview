package cn.huang.leetcode;

import java.util.HashMap;
import java.util.Map;

/*
547. Friend Circles

 There are N students in a class. Some of them are friends, while some are not. Their friendship is transitive in nature.
 For example, if A is a direct friend of B, and B is a direct friend of C, then A is an indirect friend of C. And we
 defined a friend circle is a group of students who are direct or indirect friends.

Given a N*N matrix M representing the friend relationship between students in the class. If M[i][j] = 1, then the ith
and jth students are direct friends with each other, otherwise not. And you have to output the total number of friend
circles among all the students.

Example 1:

Input:
[[1,1,0],
 [1,1,0],
 [0,0,1]]
Output: 2
Explanation:The 0th and 1st students are direct friends, so they are in a friend circle.
The 2nd student himself is in a friend circle. So return 2.

Example 2:

Input:
[[1,1,0],
 [1,1,1],
 [0,1,1]]
Output: 1

Explanation:The 0th and 1st students are direct friends, the 1st and 2nd students are direct friends,
so the 0th and 2nd students are indirect friends. All of them are in the same friend circle, so return 1.

Note:

    N is in range [1,200].
    M[i][i] = 1 for all students.
    If M[i][j] = 1, then M[j][i] = 1.

 */
public class LC_0547_FriendCircles {
    public void dfs(int[][] M, int[] visited, int i) {
        for (int j = 0; j < M.length; j++) {
            if (M[i][j] == 1 && visited[j] == 0) {
                visited[j] = 1;
                dfs(M, visited, j);
            }
        }
    }

    public int findCircleNum(int[][] M) {
        int[] visited = new int[M.length];
        int count = 0;
        for (int i = 0; i < M.length; i++) {
            if (visited[i] == 0) {
                dfs(M, visited, i);
                count++;
            }
        }
        return count;
    }

    /*
    Union find
    http://www.voidcn.com/article/p-pbqgefyk-hh.html

    https://www.youtube.com/watch?v=C3ZK3RRNZtc
    http://www.goodtecher.com/union-find/

     */
    class UnionFind {
        private int count = 0;
        private int[] parent, rank;

        public UnionFind(int n) {
            count = n;
            parent = new int[n];
            rank = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        public int find(int p) {
            int q = parent[p];
            while (q != parent[q]) {
                q = parent[q];
            }
            parent[p] = q;
            return q;
        }

        public void union(int p, int q) {
            int rootP = find(p);
            int rootQ = find(q);
            if (rootP == rootQ) return;
            if (rank[rootQ] > rank[rootP]) {
                parent[rootP] = rootQ;
            } else {
                parent[rootQ] = rootP;
                if (rank[rootP] == rank[rootQ]) {
                    rank[rootP]++;
                }
            }
            count--;
        }

        public int count() {
            return count;
        }

        public int getMaxUnion() {
            Map<Integer, Integer> map = new HashMap<>();
            int max = 1;
            for (int i = 0; i < parent.length; i++) {
                int p = find(i);
                map.put(p, map.getOrDefault(p, 0) + 1);
                max = Math.max(max, map.get(p));
            }
            return max;
        }

    }

    int findParent(int[] parent, int index) {
        while (parent[index] != index) {
            index = parent[index];
        }
        return index;
    }

    public int findCircleNum2(int[][] M) {
        int n = M.length;
        int heng = 0;
        int shu = 0;
        UnionFind uf = new UnionFind(n);
        for (shu = 0; shu < n; shu++) {
            for (heng = shu; heng < n; heng++) {//因为是对角线对称的，所以只要看右上角部分
                if (M[shu][heng] == 1) {
                    uf.union(shu, heng);
                }
            }
        }
        return uf.count;
    }
}