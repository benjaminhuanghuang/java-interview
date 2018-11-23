package cn.huang.leetcode;

import java.util.*;

/*
133. Clone Graph

 */
public class LC_0133_CloneGraph {

    // Definition for undirected graph.
    class UndirectedGraphNode {
        int label;
        List<UndirectedGraphNode> neighbors;

        UndirectedGraphNode(int x) {
            label = x;
            neighbors = new ArrayList<UndirectedGraphNode>();
        }

        public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
            if (node == null)
                return null;

            UndirectedGraphNode newNode = new UndirectedGraphNode(node.label);
            HashMap<UndirectedGraphNode, UndirectedGraphNode> maps = new HashMap<>();
            Queue<UndirectedGraphNode> queue = new LinkedList<>();

            maps.put(node, newNode);
            queue.offer(node);

            while (!queue.isEmpty()) {
                UndirectedGraphNode originalNode = queue.poll();
                List<UndirectedGraphNode> neighbors = originalNode.neighbors;

                for (UndirectedGraphNode neighbour : neighbors) {
                    if (!maps.containsKey(neighbour)) {
                        UndirectedGraphNode newTmpNode = new UndirectedGraphNode(neighbour.label);
                        maps.put(neighbour, newTmpNode);
                        queue.offer(neighbour);
                    }
                    // add neighbor
                    maps.get(originalNode).neighbors.add(maps.get(neighbour));
                }
            }
            return newNode;
        }
    }
}
