class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = init(nums);
        for (int num : nums) {
            map.put(num, (map.get(num) + 1));
            if (map.get(num) >= 2) return true;
        }

        return false;
    }

    private static Map<Integer, Integer> init(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, 0);
        }

        return map;
    }
}