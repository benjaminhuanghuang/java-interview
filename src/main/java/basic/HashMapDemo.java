package basic;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public void Loop()
    {
        HashMap<String, Integer> map = new HashMap<>();
        int max = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                String mcw = entry.getKey();
            }
        }
    }

}
