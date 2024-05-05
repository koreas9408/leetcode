class Solution {
    public int[] plusOne(int[] digits) {
        String str = "";
        for (int i = 0; i < digits.length; i++) {
            str += String.valueOf(digits[i]);
        }
        long i = Long.parseLong(str) + 1;

        return Stream.of(String.valueOf(i).split("")).mapToInt(s -> Math.toIntExact(Long.parseLong(s))).toArray();
    }
}