class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        StringBuilder sb = new StringBuilder(s);
        String reversString = sb.reverse().toString();

        return s.equals(reversString);
    }
}