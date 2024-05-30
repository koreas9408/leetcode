class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        
        if (nums.length == k) {
            return nums;
        }
        
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int i : nums) {
            countMap.put(i, countMap.getOrDefault(i, 0) + 1);
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> countMap.get(o1) - countMap.get(o2));

        for (int i : countMap.keySet()) {
            pq.add(i);

            if (pq.size() > k) {
                pq.poll();
            }
        }
        
        for (int i = 0; i < k; i++) {
            result[i] = pq.poll();
        }
        
        return result;
    }
}