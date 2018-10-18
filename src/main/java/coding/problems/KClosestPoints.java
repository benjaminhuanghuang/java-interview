package coding.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * https://www.youtube.com/watch?v=eaYX0Ee0Kcg&t=5s
 *
 *
 * */
public class KClosestPoints {
    class Coordinate {
        int x;
        int y;

        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static List<Coordinate> findK(List<Coordinate> input, int k) {
        HashMap<Coordinate, Integer> map = new HashMap<Coordinate, Integer>();
        int longest = 0;
        for (Coordinate each : input) {
            int distance = cal(each);
            map.put(each, distance);
            longest = Math.max(longest, distance);
        }

        List<Coordinate>[] arr = new ArrayList[longest + 1];
        for (Coordinate each : map.keySet()) {
            int dis = map.get(each);
            if (arr[dis] == null)
                arr[dis] = new ArrayList<Coordinate>();
            arr[dis].add(each);
        }

        List<Coordinate> res = new ArrayList<Coordinate>();
        for (int i = 0; i < arr.length - 1 && res.size() < k; i++) {
            if (arr[i] != null)
                res.addAll(arr[i]);
        }
        return res;
    }

    public static int cal(Coordinate a) {
        return a.x * a.x + a.y * a.y;
    }
}
