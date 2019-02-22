package practice;

public class Workbench {

    public static void main(String[] args) {
//        String phrase = "Something - I made up from thin air";
//        String[] words = phrase.split("\\s+|\\s*-\\s*");
//
//        for(String w: words) {
//
//            System.out.println(w);
//        }
        String s = "1 2 # # ";
        String[] arr = s.split(" ");
        for(String a : arr)
        {
            System.out.println(a);
        }
    }
}
