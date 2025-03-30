package slidingwindow;

public class LongestSubstringOfDistinctCharacters {
    public int longestUniqueSubstr(String s) {
        boolean[] vis = new boolean[26];
        int left = 0;
        int right = 0;
        int maxLenght = 0;

        for (int i = 0; i<s.length();i++) {
            if (vis[s.charAt(i)-'a']) {
                if (maxLenght < (i - left)) {
                    maxLenght = (i - left) ;
                }
                while(vis[s.charAt(i)-'a']) {
                    vis[s.charAt(left) - 'a'] = false;
                    left++;
                }
                vis[s.charAt(i)-'a'] = true;
            } else {
                vis[s.charAt(i)-'a'] = true;
            }
            right = i;
        }
        if (maxLenght < (right - left) + 1) {
            maxLenght = (right - left) + 1;
        }
    return maxLenght;
    }
}
