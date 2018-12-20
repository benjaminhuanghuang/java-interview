package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
    public boolean ArrayListDemo() {
        ArrayList<Integer> leaves1 = new ArrayList<>();
        ArrayList<Integer> leaves2 = new ArrayList<>();

        return leaves1.equals(leaves2);
    }


    public void reverse() {
        ArrayList<Integer> res = new ArrayList<>();
        Collections.reverse(res);
    }

    private void forEach() {
        for (int a : new int[]{1, 2, 3}) {

        }

        List<String> words = Arrays.asList("hot", "dot", "dog", "lot", "log");
    }
}
