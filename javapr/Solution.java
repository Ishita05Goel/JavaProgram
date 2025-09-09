import java.util.*;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> smallLisit = new ArrayList<>();
        List<List<Integer>> bigList = new ArrayList<>();
        helper(nums,smallList,bigList);
        return bigList;
    }
    void helper(int []nums, List<Integer> smallList, List<List<>Integer> bigList){
        //base case
        if(smallList.size() == nums.length){
        //old smallList copy and added into biglist. so that information does not dissapear
            bigList.add(new ArrayList<>(smallList));
            return;
        }
        for(int i = 0; i<nums.length; i++){
            if(!smalllist.contains(nums[i])){
            smallList.add(nums[i]);
            helper(nums,smallList,bigList);
            // backtracking starts from here;
            smallList.remove(smallList.size()-1);//remove the lat index element.
            }
        }
    }
}
