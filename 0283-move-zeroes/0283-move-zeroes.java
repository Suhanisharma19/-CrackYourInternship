class Solution {
    public void moveZeroes(int[] nums) {
        Queue<Integer> zero=new LinkedList<>();
        Queue<Integer> notzero=new LinkedList<>();
        for(int num:nums){
            if(num!=0){
                notzero.add(num);
            }
            else if(num==0){
                zero.add(num);
            }
        }
        int index=0;
        while(!notzero.isEmpty()){
            nums[index++]=notzero.poll();
        }
        while(!zero.isEmpty()){
            nums[index++]=zero.poll();
        }
    }
}