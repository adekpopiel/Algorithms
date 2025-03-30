package dynamicprogramming;

//https://www.geeksforgeeks.org/problems/count-palindrome-sub-strings-of-a-string0652/1
//In general this problem can be fixed using Dynamic Programming,
// here I apply central expansion technique handling each character as a center for an odd palindrome or two central characters in an even palindromes
public class PalindromeSubStrings {
    public int countPS(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int left = i - 1;
            int right = i + 1;
            while(left >= 0 && right < s.length()) {
                if (s.charAt(left) == s.charAt(right)) {
                    result++;
                } else {
                    break;
                }
                left--;
                right++;
            }
        }

        for (int i = 0; i < s.length(); i++) {
            int left = i;
            int right = i+1;
            while(left >= 0 && right < s.length()) {
                if (s.charAt(left) == s.charAt(right)) {
                    result++;
                } else {
                    break;
                }
                left--;
                right++;
            }
        }

        return  result;
    }
}
