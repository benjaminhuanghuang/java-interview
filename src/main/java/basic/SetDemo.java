package basic;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public void demo() {
        Set<String> groups = new HashSet<>();
        groups.add("a");
        groups.size();
    }


    public void InitSetWithArray() {
        int[] B = {1, 2, 3};

        Set<Integer> setB = new HashSet<>();
        for (int b : B) {
            setB.add(b);
        }
    }

}
