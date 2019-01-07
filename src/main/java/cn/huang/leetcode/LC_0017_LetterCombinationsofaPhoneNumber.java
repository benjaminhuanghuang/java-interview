package cn.huang.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
17. Letter Combinations of a Phone Number
Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

Example:

Input: "23"
Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].

Note:

Although the above answer is in lexicographical order, your answer could be in any order you want.

 */
public class LC_0017_LetterCombinationsofaPhoneNumber {
    public List<String> letterCombinations(String digits) {
        HashMap<Character, String> map = new HashMap<Character, String>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        map.put('0', "");

        ArrayList<String> result = new ArrayList<String>();

        if (digits == null || digits.length() == 0)
            return result;

        dfs(digits, map, 0, "", result);

        return result;
    }

    private void dfs(String digits, HashMap<Character, String> map, int index, String combination, ArrayList<String> ansList) {
        if (index == digits.length()) {
            ansList.add(combination);
            return;
        }

        for (Character c : map.get(digits.charAt(index)).toCharArray()) {
            dfs(digits, map, index + 1, combination + c, ansList);
        }
    }
}
