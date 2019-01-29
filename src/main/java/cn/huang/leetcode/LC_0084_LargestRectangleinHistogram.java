package cn.huang.leetcode;

import java.util.Stack;

/*
84. Largest Rectangle in Histogram

Given n non-negative integers representing the histogram's bar height where the width of each bar is 1, find
the area of largest rectangle in the histogram.



Above is a histogram where width of each bar is 1, given height = [2,1,5,6,2,3].


The largest rectangle is shown in the shaded area, which has area = 10 unit.

Example:

Input: [2,1,5,6,2,3]
Output: 10


 */

/*
https://blog.csdn.net/qq_37720278/article/details/79666752
思考：最终矩形的高一定等于某个“柱”的高，宽为这个“柱”左右能延伸到的最大距离之和（直到遇见某个“柱”的高低于当前高）。
暴力就是对于每一个“柱”，向左和向右延伸到极限得出宽，再乘以高，复杂度是n^2。


可以用单调栈（栈中的元素单调递增）对这个过程进行简化，栈中每个元素包含两个属性，
一是“柱”高（设为x），二是以这个柱高向左能延伸到的最远距离（设为y，y包括柱本身的宽度1，故y初值为1），由栈底到栈顶每个元素的柱高x依次递增，栈顶元素柱高x最大。

整个算法由不断的入栈和出栈构成，将给定的数组元素依次入栈，入栈时计算当前元素向左能延伸到的最远距离，定义后面要用到的累加宽度w = 0，入栈时有两种可能：

（1）栈顶元素柱高大于当前元素柱高，出栈（保证栈的单调性，且此时可以计算面积，后面再说）。累加出栈元素的宽度
（这个累加宽度代表的是：新的栈顶元素可以向右延伸这个宽度，这也是用递增栈的原因，由于出栈元素高于新的栈顶元素，那么出栈元素向左能延伸到的最远处，
新的栈顶元素至少也能向右延伸到），若栈不空且出栈后新的栈顶元素柱高仍高于当前元素，继续（1）

  (2)  栈顶元素柱高小于当前元素柱高，此时当前元素直接入栈，当前元素的y = 1+w，w代表当前元素之前所有高于当前元素的元素宽度之和，即当前元素可以向左延伸至1+w

出栈时，出栈元素向右能延伸的距离为当前w，故面积为（w+y）*x，计算并更新最大面积。

例如对于题中[2，1，5，6，3，2]，以（x，y）表示栈中元素，max代表最大面积

（2，1）准备进栈，初始化w = 0，发现栈空，进栈

（1，1）准备进栈，初始化w = 0，发现其柱高小于栈顶元素，（2，1）出栈，计算面积得 2*1 = 2，max = 2

累加宽度w = w + 1 = 1，y = 1+w = 2，（1，2）进栈

（5，1）准备进栈，初始化w = 0，发现栈顶元素柱高小于当前元素，进栈

（6，1）进栈，同上，此时栈中元素为（1，2）（5，1）（6，1）



（2，1）准备进栈，初始化w = 0，发现其柱高小于栈顶元素，（6，1）出栈，计算面积得 6*1 = 2，max = 6

累加宽度w = w + 1 = 1，接着（5，1）出栈，计算面积得（1 + 1）*5 = 10，max = 10，累加宽度w = w + 1 = 2，出栈完毕。y = 1 + w = 3，（2，3）进栈，此时栈中元素为（1，2）（2，3）

（3，1）进栈，此时栈中元素为（1，2）（2，3）（3，1）

将栈中剩余元素依次出栈：

初始化w = 0，（3，1）出栈，计算面积得 3*1 = 8，max不变，累加宽度w = w + 1 = 1，接着（2，3）出栈，计算面积得（1+3）*2 = 8，max不变，累加宽度w = w + 3 = 4，接着（1，2）出栈，计算面积得（4+2）*1 = 6，面积不变，出栈完毕。

最终max = 10
---------------------
作者：qq_37720278
来源：CSDN
原文：https://blog.csdn.net/qq_37720278/article/details/79666752
版权声明：本文为博主原创文章，转载请附上博文链接！
 */

public class LC_0084_LargestRectangleinHistogram {
    /*
    https://www.youtube.com/watch?v=TH9UaZ6JGcA
     */
    public int largestRectangleArea(int[] heights) {
        if (heights == null || heights.length == 0)
            return 0;

        Stack<Integer> stack = new Stack<>();
        int res = 0;
        for (int i = 0; i <= heights.length; i++)   // add 0 determine the end
        {
            int h = i == heights.length ? 0 : heights[i]; // add 0 determine the end
            while (!stack.isEmpty() && h < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int start = stack.isEmpty() ? -1 : stack.peek();
                int area = height * (i - start - 1);
                res = Math.max(res, area);
            }
            stack.push(i);
        }
        return res;
    }
}
