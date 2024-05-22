class Solution {
    public int hammingWeight(int n) {
        String[] str = Integer.toBinaryString(n).split("");
        int cnt = 0;
        
        for (String s : str) {
            if (s.equals("1")) cnt++;
        }

        return cnt;
    }
}