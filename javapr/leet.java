class Solution {
    public int lengthOfLIS(int[] nums) {
        return helper(nums,0,-1);
    }
    int helper(int nums[], int index,int prevIndex){
        //base case
        if(nums.length == index){
            return 0;
        }
        //choice made
        int pick = 0;
        if(prevIndex == -1 || nums[index]>nums[prevIndex]){
            pick =  1+helper(nums,index+1,index);
        }
        //2.choice not made
        int notPick = helper(nums, index + 1,prevIndex);
        return Math.max(pick,notPick);
    }
}
//this is not feasible code because recuression uses STACK AND  stack take up a lot of memory therefore this is not feasible