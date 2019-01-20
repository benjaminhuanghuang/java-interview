package cn.huang.leetcode;

/*
478. Generate Random Point in a Circle

Given the radius and x-y positions of the center of a circle, write a function randPoint which generates a uniform random point in the circle.

Note:

    input and output values are in floating-point.
    radius and x-y position of the center of the circle is passed into the class constructor.
    a point on the circumference of the circle is considered to be in the circle.
    randPoint returns a size 2 array containing x-position and y-position of the random point, in that order.

Example 1:

Input:
["Solution","randPoint","randPoint","randPoint"]
[[1,0,0],[],[],[]]
Output: [null,[-0.72939,-0.65505],[-0.78502,-0.28626],[-0.83119,-0.19803]]

Example 2:

Input:
["Solution","randPoint","randPoint","randPoint"]
[[10,5,-7.5],[],[],[]]
Output: [null,[11.52438,-8.33273],[2.46992,-16.21705],[11.13430,-12.42337]]

Explanation of Input Syntax:

The input is two lists: the subroutines called and their arguments. Solution's constructor has three arguments,
the radius, x-position of the center, and y-position of the center of the circle. randPoint has no arguments.
Arguments are always wrapped with a list, even if there aren't any.

 */
public class LC_0478_GenerateRandomPointinaCircle {
    class Solution {

        double r;
        double x0;
        double y0;

        public Solution(double radius, double x_center, double y_center) {
            r = radius;
            x0 = x_center;
            y0 = y_center;
        }

        public double[] randPoint() {
            double x = 0, y = 0;
            do {
                x = -r + 2 * r * Math.random();
                y = -r + 2 * r * Math.random();
            } while (x * x + y * y > r * r);
            return new double[]{x0 + x, y0 + y};
        }
    }
}
