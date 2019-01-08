package cn.huang.leetcode;

/*
470. Implement Rand10() Using Rand7()

Given a function rand7 which generates a uniform random integer in the range 1 to 7, write a function rand10 which
generates a uniform random integer in the range 1 to 10.

Do NOT use system's Math.random().



Example 1:

Input: 1
Output: [7]

Example 2:

Input: 2
Output: [8,4]

Example 3:

Input: 3
Output: [8,1,10]



Note:

    rand7 is predefined.
    Each testcase has one argument: n, the number of times that rand10 is called.



Follow up:

    What is the expected value for the number of calls to rand7() function?
    Could you minimize the number of calls to rand7()?


 */

/*
    https://www.youtube.com/watch?v=Wyauxe92JJA
    注意对错误解的分析
     */


public class LC_0470_ImplementRand10UsingRand7 {
    public int rand7() {
        return 0;
    }

    /*
    https://www.cnblogs.com/tengdai/p/9438422.html
    具体做法就是先用rand7()生成一个1~7的数，之后舍弃大于x的数。于是乎，舍弃7的话就可以等概率生成1~6，
    如果等概率生成0或1，只要对2取余就好。之后同样的方法舍弃6，7就可以等概率的生成1~5。
    如果第一步生成的是0，那么直接返回第二步的数（1~5）；如果第一步生成的是1，那么返回第二步的数+5（6~10）。
     */
    private int oddOrEven() {
        int num = 0;
        while ((num = rand7()) > 6) ;
        return num % 2;
    }

    private int smallerOrBiggerThan5() {
        int num = 0;
        while ((num = rand7()) > 5) ;
        return num;
    }

    public int rand10() {
        int num1 = oddOrEven();
        int num2 = smallerOrBiggerThan5();
        if (num1 == 1) return num2 + 5;
        else return num2;
    }
}
