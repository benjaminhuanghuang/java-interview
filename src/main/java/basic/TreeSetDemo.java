package basic;

import java.util.Comparator;
import java.util.TreeSet;

/*

The floor() method returns the greatest element in this set less than or equal to the given element,
or null if there is no such element.

The higher() method returns the least element in this set strictly greater than the given element, or null if
there is no such element.

Note: we use higher() instead of ceiling() to exclude the given element.
 */
public class TreeSetDemo {
    public class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }
    }

    public void createTreeSet() {
        TreeSet<Interval> set = new TreeSet<Interval>(new Comparator<Interval>() {
            public int compare(Interval a, Interval b) {
                return a.start - b.start;
            }
        });
    }
}
