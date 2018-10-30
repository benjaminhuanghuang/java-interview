package basic;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public boolean ArrayListDemo(){
        ArrayList<Integer> leaves1  = new ArrayList<>();
        ArrayList<Integer> leaves2  = new ArrayList<>();

        return leaves1.equals(leaves2);
    }


    public void reverse()
    {
        ArrayList<Integer> res  = new ArrayList<>();
        Collections.reverse(res);
    }
}
