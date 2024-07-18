class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
         Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            queue.offer(nums1[i]);
        }
        for (int i = 0; i < n; i++) {
            queue.offer(nums2[i]);
        }
        for (int i = 0; i < m + n; i++) {
            nums1[i] = queue.poll();
        }
        Arrays.sort(nums1, 0, m + n);
        
    }
}