class Solution {
    public int countNicePairs(int[] nums) {
        int ans []= new int[nums.length];

        for(int i=0;i<nums.length;i++){
            ans[i] = nums[i] - rev(nums[i]);
        }

        Map<Integer,Integer> map = new HashMap<>();

        int result = 0;

        int MOD = 1000000007;

        for(int i=0;i<nums.length;i++){
            result = (result + map.getOrDefault(ans[i],0)) % MOD;
            map.put(ans[i],map.getOrDefault(ans[i],0)+1);
        }

        return result;

    }

    public int rev(int num){
        int reverse = 0;

        while(num != 0){
            int reminder = num % 10;
            reverse  = (reverse * 10) + reminder;
            num /= 10;
        }

        return reverse;
    }
}