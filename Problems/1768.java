// LeetCode 75: Array/String

class Solution {
    public String mergeAlternately(String word1, String word2) {
        int idx1 = 0, idx2 = 0, l1 = word1.length(), l2 = word2.length();
        StringBuilder ans = new StringBuilder();
        while(!(idx1 == l1 && idx2 == l2)) {
            if (idx1 < l1) {
                ans.append(word1.charAt(idx1));
                idx1++;
            }
            if (idx2 < l2) {
                ans.append(word2.charAt(idx2));
                idx2++;
            }
        }
        return ans.toString();
    }
}