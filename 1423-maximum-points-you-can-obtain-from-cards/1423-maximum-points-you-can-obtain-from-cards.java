class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int totalSum = 0;
        for (int num : cardPoints) {
            totalSum += num;
        }
        int windowSum = 0;
        for (int i = 0; i < n - k; i++) {
            windowSum += cardPoints[i];
        }
        int minWindowSum = windowSum;
        for (int i = n - k; i < n; i++) {
            windowSum = windowSum - cardPoints[i - (n - k)] + cardPoints[i];
            minWindowSum = Math.min(minWindowSum, windowSum);
        }
        return totalSum - minWindowSum;
    }
}