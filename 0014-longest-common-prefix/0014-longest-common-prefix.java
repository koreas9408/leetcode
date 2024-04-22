class Solution {
    private static int getMinLen(String[] strs) {
        int[] ints = new int[strs.length];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = strs[i].length();
        }

        return Arrays.stream(ints).min().getAsInt();
    }

    public String longestCommonPrefix(String[] strs) {
        char[] charArray1 = strs[0].toCharArray();

        StringBuilder sb = new StringBuilder();

        int cnt = 0;
        int result = 0;
        int len = getMinLen(strs);

        for (char c : charArray1) {
            for (int i = 0; i < strs.length; i++) {
                char[] charArray = strs[i].toCharArray();
                
                if (c == charArray[cnt]) {
                    result++;
                }
            }

            if (result == strs.length) {
                sb.append(c);
            } else {
                break;
            }
            result = 0;
            cnt++;
            if (len == cnt) break;
        }


        String str = sb.toString();
        return str.length() == 0 ? "" : str;
    }
}