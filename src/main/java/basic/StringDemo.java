package basic;

public class StringDemo {
    public void demo()
    {
        // char array to String
        char[] charArray = {'a', 'b', 'c'};
        String str = String.valueOf(charArray);


        // String to char array
        String str2 = "wwwwww3333dfevvv";
        char[] chars = str2.toCharArray();


    }

    public String StringBuilderDemo(String s){
        StringBuilder sb = new StringBuilder();

        // removing last character from String
        sb.deleteCharAt(5);

        for (char c : s.toCharArray()) {
            if (c == '#') {
                if (sb.length() > 0)
                    sb.setLength(sb.length() - 1);    // remove
            } else {
                sb.append(c);
            }
        }
        return sb.toString();

    }

}
