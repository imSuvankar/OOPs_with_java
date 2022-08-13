// 1. Letter Combinations of a Phone Number

// Given a string containing digits from 2-9 inclusive, 
// return all possible letter combinations that the number could represent. Return the answer in any order.
// A mapping of digit to letters (just like on the telephone buttons) is given below. 
// Note that 1 does not map to any letters.

// Example 1:
// Input: digits = "23"
// Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]

// Example 2:
// Input: digits = ""
// Output: []

// Example 3:
// Input: digits = "2"
// Output: ["a","b","c"]

import java.util.Scanner;

public class asgmt_4_1 {
    public static void main(String[] args) {

        try {
            
            char[][] letters = { {'.'}, {'.'}, { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' }, { 'j', 'k', 'l' },
                    { 'm', 'n', 'o' }, { 'p', 'q', 'r', 's' }, { 't', 'u', 'v' }, { 'w', 'x', 'y', 'z' } };

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your digits : ");
            String inp = sc.next();
            sc.close();

            int[] digits = new int[inp.length()];

            for (int i = 0; i < inp.length(); i++) {
                digits[i] = inp.charAt(i) - '0';
            }

            // String[] result = new String[letters[digits[0]].length * letters[digits[1]].length];

            for (int i = 0; i < letters[digits[0]].length; i++) {
                for (int j = 0; j < letters[digits[1]].length; j++) {
                    System.out.println(letters[digits[0]][i] + "" + letters[digits[1]][j]);
                }
            }

        } catch (Exception e) {
            System.out.println("Enter only two digits only (eg 00 - 99)");
        }
    }
}