class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        generateSubsets(nums,0,curr,ans);

        return ans;
    }

    public void generateSubsets(int [] nums, int index, List<Integer> curr,List<List<Integer>> ans){

        // Base Case

        if(index == nums.length){
            ans.add(new ArrayList<>(curr));
            return ;
        }

        // Choice 1: NOT choose this element
        generateSubsets(nums, index + 1, curr, ans);


        // Choice 2: Choose this element
        curr.add(nums[index]);

        generateSubsets(nums, index + 1, curr, ans);

        // Backtracking
        curr.remove(curr.size() - 1);
    }
}