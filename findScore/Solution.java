class Solution {
    public long findScore(int[] nums) {
        boolean[] marker = new boolean[nums.length];
        long sum = 0;
        int marked = 0;
        while(marked<nums.length){
        int j = -1;
        for(int i = 0;i<nums.length;i++){
            if(!marker[i] && (j == -1 || nums[i] < nums[j])){
            j = i;
            }
        }
        if(j!=-1){
        sum = nums[j] + sum;
        marker[j] = true;
        marked++;
        if(j > 0 && marker[j - 1] != true){
            marker[j - 1] = true;
            marked++;
        }
        if(j<nums.length - 1 && marker[j + 1] != true){
            marker[j + 1] = true;
            marked++;
        }
        }
        }
        return sum;
        }
}
