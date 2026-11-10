class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        Arrays.sort(nums);

        boolean used [] = new boolean[nums.length];

        solve(nums,ans,curr,used);

        return ans;
    }

    public void solve(int [] nums, List<List<Integer>> ans,List<Integer> curr,boolean [] used){

        if(curr.size() == nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(used[i]){
                continue;
            }

            // if( i > 0 && nums[i] == nums[i - 1] && !used[i-1]){
            //     continue;
            // }

            curr.add(nums[i]);
            used[i] = true;

            solve(nums,ans,curr,used);

            curr.remove(curr.size()-1);
            used[i] = false;

            while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                i++;
            }
        }
    } 
}