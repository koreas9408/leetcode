class Solution {
    public boolean isPalindrome(int x) {
        StringBuilder stringBuilder = new StringBuilder();
        String reverseString = stringBuilder.append(x).reverse().toString();

        return reverseString.equals(String.valueOf(x));
    }
}