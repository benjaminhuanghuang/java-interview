package cn.huang.leetcode;

/*
492. Construct the Rectangle
 */
public class LC_0492_ConstructtheRectangle {
    public int[] constructRectangle(int area) {
        int root = (int) Math.sqrt(area);
        while(area%root !=0){
            root --;
        }
        return new int[]{area/root, root};
    }
}
