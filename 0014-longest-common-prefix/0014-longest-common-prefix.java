class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Loop through each character index of the first string
        for (int j = 0; j < strs[0].length(); j++) {
            char ch = strs[0].charAt(j);

            // Compare this character with the same position in all other strings
            for (int i = 1; i < strs.length; i++) {
                // Stop if we reach the end of string i OR find a mismatch
                if (j >= strs[i].length() || strs[i].charAt(j) != ch) {
                    return strs[0].substring(0, j);
                }
            }
        }

        // All characters in strs[0] matched across every string
        return strs[0];
    }
}
