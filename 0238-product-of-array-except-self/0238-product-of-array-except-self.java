class Solution {
    public int[] productExceptSelf(int[] nums) {

        // size of the array
        int size = nums.length;

        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();

        // default value;
        map1.put(0,1);
        map2.put(size-1,1);

        // Assign a values to the map1 i-1
        for(int i=1;i<size;i++){
            int preVal = map1.get(i-1); //0 -> 1
            int product = nums[i-1] *  map1.get(i-1); // 1 * 1;
            map1.put(i,product);
        }

        // Assign a values to the map2 i+1
        for(int i= size-2;i>=0;i--){
            int preVal = map2.get(i+1); //3 -> 1
            int product = nums[i+1] *  map2.get(i+1); // 1 * 4;
            map2.put(i,product); // 2 - > 4
        }

        for(int i=0;i<size;i++){
            nums[i] = map1.get(i) * map2.get(i);
        }

        return nums;
    }

}