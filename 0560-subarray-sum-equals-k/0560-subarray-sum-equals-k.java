class Solution {
    public int subarraySum(int[] nums, int k) {
         Map<Integer, Integer> cumulativeSumCount = new HashMap<>();
        cumulativeSumCount.put(0, 1);  

        int cumulativeSum = 0;
        int count = 0;

        for (int num : nums) {
            cumulativeSum += num;
            if (cumulativeSumCount.containsKey(cumulativeSum - k)) {
                count += cumulativeSumCount.get(cumulativeSum - k);
            }
            cumulativeSumCount.put(cumulativeSum, cumulativeSumCount.getOrDefault(cumulativeSum, 0) + 1);
        }

        return count;
    }
}