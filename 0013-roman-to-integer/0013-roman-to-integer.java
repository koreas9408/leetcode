class Solution {
    private static Map<Character, Integer> initRomans() {
        Map<Character, Integer> romans = new HashMap<>();
        romans.put('I', 1);
        romans.put('V', 5);
        romans.put('X', 10);
        romans.put('L', 50);
        romans.put('C', 100);
        romans.put('D', 500);
        romans.put('M', 1000);
        
        return romans;
    }

    public int romanToInt(String s) {
         Map<Character, Integer> romans = initRomans();

        char[] charArray = s.toCharArray();
        int result = 0;
        char beforeChar = '\0';

        for (char c : charArray) {

            if (beforeChar == 'I' && (c == 'V' || c == 'X')) {
                result += romans.get(c) - (romans.get(beforeChar) * 2);
            } else if (beforeChar == 'X' && (c == 'L' || c == 'C')) {
                result += romans.get(c) - (romans.get(beforeChar) * 2);
            } else if (beforeChar == 'C' && (c == 'D' || c == 'M')) {
                result += romans.get(c) - (romans.get(beforeChar) * 2);
            } else {
                result += romans.get(c);
            }

            beforeChar = c;
        }

        return result;
    }
}