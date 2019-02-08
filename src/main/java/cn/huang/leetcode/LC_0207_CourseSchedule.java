package cn.huang.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/*
207. Course Schedule
There are a total of n courses you have to take, labeled from 0 to n-1.

Some courses may have prerequisites, for example to take course 0 you have to first take course 1, which is expressed as a pair: [0,1]

Given the total number of courses and a list of prerequisite pairs, is it possible for you to finish all courses?


 */
public class LC_0207_CourseSchedule {
    /*
    This problem can be converted to finding if a graph contains a cycle.
    https://www.youtube.com/watch?v=zkTOIVUdW-I
     */
    public boolean canFinish_BFS(int numCourses, int[][] prerequisites) {
        int[] indegree = new int[numCourses];
        int res = numCourses;

        for (int[] pair : prerequisites) {
            indegree[pair[0]]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        // find node has indegree 0
        for (int i = 0; i < indegree.length; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }
        while (!queue.isEmpty()) {
            int pre = queue.poll();
            res--;
            for (int[] pair : prerequisites) {
                if (pair[1] == pre) {
                    indegree[pair[0]]--;
                    if (indegree[pair[0]] == 0) {
                        queue.offer(pair[0]);
                    }
                }
            }
        }
        return res == 0;
    }
}
