package cn.huang.leetcode;

import java.util.ArrayList;
import java.util.List;

/*

54. Spiral Matrix

 */
public class LC_0054_SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix.length == 0)
            return res;
        int rows = matrix.length;
        int cols = matrix[0].length;

        // 此种方法关键点--求圈数
        // 最小值除以2，向上取整
        // int layers = (Math.min(rows, cols) - 1) / 2 + 1;
        int layers = (int) Math.ceil
                ((Math.min(rows, cols)) / 2.0);
        // 要打印的圈数
        for (int i = 0; i < layers; i++) {
            // 打印每圈
            // 左至右
            for (int k = i; k < cols - i; k++)
                res.add(matrix[i][k]);
            // 右上至右下
            for (int j = i + 1; j < rows - i; j++)
                res.add(matrix[j][cols - i - 1]);
            // 注意k,j开始的下标
            // 右至左
            // (rows - i - 1 != i)避免重复打印第i行
            for (int k = cols - i - 2; (k >= i)
                    && (rows - i - 1 != i); k--)
                res.add(matrix[rows - i - 1][k]);
            // 左下至左上
            // (cols - i - 1 != i)避免重复打印第i列
            for (int j = rows - i - 2; (j > i)
                    && (cols - i - 1 != i); j--)
                res.add(matrix[j][i]);
        }
        return res;
    }

    public List<Integer> spiralOrder_better(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix.length == 0)
            return res;

        int rowStart=0;
        int rowEnd=matrix.length-1;

        int colStart=0;
        int colEnd = matrix[0].length-1;


        while(rowStart <= rowEnd && colStart <= colEnd){

            // Left to right
            for (int i = colStart; i <= colEnd; i++) {
                res.add(matrix[rowStart][i]);
            }

            // top to bottom
            for (int j = rowStart+1; j <= rowEnd; j++) {
                res.add(matrix[j][colEnd]);
            }

            // right to left
            if(rowStart+1 <= rowEnd){
                for (int k = colEnd-1; k >= colStart; k--) {
                    res.add(matrix[rowEnd][k]);
                }
            }

            // bottom to up
            if(colStart+1 <= colEnd){
                for (int k = rowEnd-1; k > rowStart; k--) {
                    res.add(matrix[k][colStart]);
                }
            }

            rowStart++;
            rowEnd--;
            colStart++;
            colEnd--;
        }
        return res;
    }
}
