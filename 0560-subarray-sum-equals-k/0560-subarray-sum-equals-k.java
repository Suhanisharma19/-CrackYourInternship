class Solution {
    public int subarraySum(int[] nums, int k) {
         Map<Integer, Integer> prevsum = new HashMap<>();
        prevsum.put(0, 1);  

        int sum = 0;
        int count = 0;

        for (int num : nums) {
            sum += num;
            if (prevsum.containsKey(sum - k)) {
                count += prevsum.get(sum - k);
            }
            prevsum.put(sum, prevsum.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}