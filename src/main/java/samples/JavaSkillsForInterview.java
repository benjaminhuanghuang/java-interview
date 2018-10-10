package samples;

import java.util.*;

public class JavaSkillsForInterview {
    public static void main(String[] args) {
        // String
        String s = "abc";
        s.charAt(0);
        s.length();
        s.substring(0, 1);
        s.substring(1);
        s.equals("b");
        s = s.trim();
        s.indexOf("a");
        s.indexOf("a", 1);
        s.lastIndexOf("a");
        s.indexOf("a", 1);
        s.toCharArray();
        Integer.valueOf(s); // returns an Integer object
        Integer.parseInt(s); // returns an int primitive
        String.valueOf(s); // integer to string
        // StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append("a");
        sb.insert(0, "a");
        sb.deleteCharAt(sb.length() - 1);
        sb.reverse();
        sb.toString();


        // Array
        int[] a = new int[10];
        char[] b = {'a', 'b'};
        int[][] c = new int[10][10];
        int m = a.length;
        int n = c[0].length;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        Arrays.sort(a);
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }


        // List
        List<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        List<List<Integer>> list2 = new ArrayList<List<Integer>>();
        list.add(0);
        list.add(0, 1);
        list.get(0);
        list.size();
        list.remove(list.size() - 1);
        Collections.sort(list);
        Collections.sort(list, Collections.reverseOrder());

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;// 0‐>1
                // return o2 - o1; 1‐>0
            }
        });


        // Stack
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(0);
        stack.pop();
        stack.peek();
        stack.isEmpty();
        stack.size();

        // Queue add ‐‐‐‐‐‐> remove, peek
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(0);
        q.remove();
        q.peek();
        q.isEmpty();
        q.size();

        // HashMap
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('c', 1);
        map.get('c');
        if (map.containsKey('c')) {

        }

        if (map.containsValue(1)) {

        }

        for (Character d : map.keySet()) {

        }

        for (Integer i : map.values()) {

        }

        map.isEmpty();
        map.size();


        // HashSet
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(0);
        set.remove(0);
        if (set.contains(0)) {

        }
        set.isEmpty();
        set.size();
        // mini heap
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(0);
        pq.remove();
        pq.peek();
        pq.isEmpty();
        pq.size();
        while (!pq.isEmpty()) {

        }
    }
}
