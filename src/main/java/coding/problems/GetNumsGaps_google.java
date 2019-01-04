package coding.problems;

/*
Given a sorted array of distinct integers from 0 to 99, for instance [0, 1, 2, 50, 52, 75], output a string that
describes numbers missing from the array.
In this case "3-49,51,53-74,76-99".  The items in the string should be sorted in increasing order and separated by commas.
When a gap has only one number, the item is the number itself.  When a gap has more than one number, the
item consists of the start and the end of the gap, joined with a minus sign.

 */
public class GetNumsGaps_google {
    public String GetNumsGaps(int[] input){
        if (input == null || input.length == 0)
            return "";
        String res ="";
        int n = input.length;

        int LIMIT = 100;

        boolean seen[] = new boolean[LIMIT];

        // Initialize all number from 0 to 99 as NOT seen
        for (int i = 0; i < LIMIT; i++)
            seen[i] = false;

        // Mark present elements in range [0-99] as seen
        for (int i = 0; i < n; i++)
        {
            if (input[i] < LIMIT)
                seen[input[i]] = true;
        }

        // Print missing element
        int i = 0;
        while (i < LIMIT)
        {
            // If i is missing
            if (seen[i] == false)
            {
                // Find if there are more missing elements after i
                int j = i + 1;
                while (j < LIMIT && seen[j] == false)
                    j++;

                // Print missing single or range
                int p = j-1;
                res += i+1== p ? i+"," : i + "-" + p+",";

                // Update u
                i = j;
            }
            else
                i++;
        }

        return res;
    }

    // Driver program to test above functions
    public static void main(String[] args)
    {
        GetNumsGaps_google missing = new GetNumsGaps_google();
        int arr[] = {0, 1, 2, 50, 52, 75};
        int n = arr.length;
        //"3-49,51,53-74,76-99"
        System.out.println(missing.GetNumsGaps(arr));
    }

}
