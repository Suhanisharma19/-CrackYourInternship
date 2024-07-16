class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> hash=new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();
        for(int num: nums){
            if(hash.contains(num)){
               duplicates.add(num);
            }
            else {
                hash.add(num);
            }
        }
        return duplicates;
    }
}