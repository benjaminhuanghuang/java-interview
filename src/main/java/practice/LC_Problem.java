package practice;

import java.util.HashSet;
import java.util.Set;

public class LC_Problem {


    public static void main(String[] args) {
        int[] testTable = { 0, 1, 2, 3, 4, 5, 6, 10 };
        for (int input : testTable) {
            System.out.println(input);
        }
        LC_Problem s = new LC_Problem();
        int a = s.numUniqueEmails(new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"});
    }
    public int numUniqueEmails(String[] emails) {
        Set set = new HashSet();
        for(String mail: emails)
        {
            String parsedEmail = parseEmail(mail);
            set.add(parsedEmail);
        }
        return set.size();
    }

    private String parseEmail(String originalEmail)
    {
        String[] parts = originalEmail.split("@");
        String localName = parts[0];
        int indexOfPlus = localName.indexOf("+");
        if(indexOfPlus >= 0)
        {
            localName = localName.substring(0, indexOfPlus);
        }
        localName = localName.replace(".", "");



        return localName + "@" + parts[1];
    }
}



