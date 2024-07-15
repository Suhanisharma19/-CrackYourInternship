class Solution {
    public void sortColors(int[] nums) {
         Queue<Integer> zeros=new LinkedList<>();
        Queue<Integer> ones= new LinkedList<>();
        Queue<Integer> twos=new LinkedList<>();
        for(int num:nums){
            if(num==0){
                zeros.add(num);
            }
            else if(num==1){
                ones.add(num);
            }
            else if(num==2){
                twos.add(num);
            }
        }
        int index=0;
        while(!zeros.isEmpty()){
            nums[index++]=zeros.poll();
        }
        while(!ones.isEmpty()){
            nums[index++]=ones.poll();
        }
        while(!twos.isEmpty()){
            nums[index++]=twos.poll();
        }
        }
}