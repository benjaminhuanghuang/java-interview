package basic;

import java.util.Arrays;
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

    public void putDataIntoSet(){
        String[] banned = new String[10];
        HashSet<String> set = new HashSet<>(Arrays.asList(banned));
    }

}
