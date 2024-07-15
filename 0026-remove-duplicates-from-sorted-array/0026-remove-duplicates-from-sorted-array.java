class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> hash=new HashSet<>();
        int count=0;
        for(int num:nums){
            if(!hash.contains(num)){
            hash.add(num);
                nums[count++]=num;
            }
        }
        return count;
        
    }
}