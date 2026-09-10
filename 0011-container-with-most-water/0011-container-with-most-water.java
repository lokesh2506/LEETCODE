class Solution {
    public int maxArea(int[] height) {
        int size = height.length;

        int i = 0;
        int j = size-1;

        int maxTrap = 0;

        while(i < j){
            int waterTrap = 0;
            if(height[i]<height[j]){
                waterTrap = (j-i)*height[i];
                i++;
            }else{
                waterTrap = (j-i)*height[j];
                j--;
            }
            maxTrap = Math.max(maxTrap,waterTrap);
        }

        return maxTrap;
    }
}