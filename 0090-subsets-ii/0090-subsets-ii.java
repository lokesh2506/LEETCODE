class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> current = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);
        solve(nums,0,current,ans);

        return ans;
    }

    public void solve(int [] nums, int index,List<Integer> current,List<List<Integer>> ans){
        if(index == nums.length){
            ans.add(new ArrayList<>(current));
            return;
        }

        int next = index +1;
        while(next < nums.length && nums[index] == nums[next]){
            next++;
        }
        
        solve(nums,next,current,ans);


        current.add(nums[index]);
        solve(nums,index+1,current,ans);
        current.remove(current.size() -1);


    }
}

