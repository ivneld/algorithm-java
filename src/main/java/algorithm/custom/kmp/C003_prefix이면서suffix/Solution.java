package algorithm.custom.kmp.C003_prefix이면서suffix;

public class Solution {

    public int solution(String s) {

        if (s.isEmpty()) return 0;

        int maxLen = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            String prefix = s.substring(0, i + 1);
            String suffix = s.substring(s.length() - 1 - i);

            if (prefix.equals(suffix)) {
                if (maxLen < prefix.length()) {
                    maxLen = prefix.length();
                }
            }
        }

        return maxLen;
    }
}
