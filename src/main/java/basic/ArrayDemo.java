package basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ArrayDemo {
    public void initArray()
    {
        Integer arr[] = { 5, 6, 7, 8, 1, 2, 3, 4, 3 };
    }

    public void array2D_Demo() {
        int[][] grid = new int[1][1];


        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {

            }
        }
    }


    public void forEach_Demo(){
        int[] A = new int[]{1,2};
        for (int a : A) {

        }
    }


    public void listToArray()
    {
        HashMap<String, Integer> map = new HashMap<>();

        List<String> l = new ArrayList<>();

        for(String w: map.keySet())
        {
            if(map.get(w) == 1){
                l.add(w);
            }
        }

        String[] s = l.toArray(new String[l.size()]);
    }

}
