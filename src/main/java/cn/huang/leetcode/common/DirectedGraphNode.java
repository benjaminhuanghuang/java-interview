package cn.huang.leetcode.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class DirectedGraphNode {
    int label;
    ArrayList<DirectedGraphNode> neighbors;

    DirectedGraphNode(int x) {
        label = x;
        neighbors = new ArrayList<DirectedGraphNode>();
    }
    /*
        给定一个有向图，图节点的拓扑排序定义如下:

        对于图中的每一条有向边 A -> B , 在拓扑排序中A一定在B之前.
        拓扑排序中的第一个节点可以是图中的任何一个没有其他节点指向它的节点.
     */
    public ArrayList<DirectedGraphNode> topSort(ArrayList<DirectedGraphNode> graph) {
        ArrayList<DirectedGraphNode> result = new ArrayList<DirectedGraphNode>();

        HashMap<DirectedGraphNode, Integer> map = new HashMap();
        // 计算每个节点的入度
        for (DirectedGraphNode node : graph) {
            for (DirectedGraphNode neighbor : node.neighbors) {
                if (map.containsKey(neighbor)) {
                    map.put(neighbor, map.get(neighbor) + 1);
                } else {
                    map.put(neighbor, 1);
                }
            }
        }
        // 找出入度为0的节点
        Queue<DirectedGraphNode> q = new LinkedList<DirectedGraphNode>();
        for (DirectedGraphNode node : graph) {
            if (!map.containsKey(node)) {
                q.offer(node);
                result.add(node);
            }
        }
        // 不断bfs 入度为0的节点
        while (!q.isEmpty()) {
            DirectedGraphNode node = q.poll();
            for (DirectedGraphNode n : node.neighbors) {
                map.put(n, map.get(n) - 1);
                if (map.get(n) == 0) {
                    result.add(n);
                    q.offer(n);
                }
            }
        }
        return result;
    }
}
