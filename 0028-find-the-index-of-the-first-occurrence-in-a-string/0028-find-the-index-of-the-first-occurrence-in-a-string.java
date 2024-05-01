class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) return -1;

        if (haystack.equals(needle)) return 0;

        if (haystack.length() == 1 && needle.length() == 1) {
            return haystack.equals(needle) ? 0 : -1;
        }
        
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (i == haystack.length() - 1 && needle.length() == 1) return i;

                int subLength = i + needle.length();
                if (haystack.length() < i + needle.length()) {
                    subLength = i;
                }

                String substring = haystack.substring(i, subLength);
                if (needle.equals(substring)) {
                    return i;
                }
            }
        }

        return -1;
    }
}