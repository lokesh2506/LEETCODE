class Solution {
    public int leftMax(int AlreadyMax,int newVal){
        return Math.max(AlreadyMax,newVal);
    }
    public int trap(int[] height) {
        int size = height.length;
        int trap = 0;

        // Right Max
        int rightMax [] = new int[size];
        rightMax[size-1] = 0; 
        
        for(int i=size-2;i>=0;i--){
            rightMax[i] = Math.max(height[i+1],rightMax[i+1]);
        }

        // Left Max
        int lMax = 0,currValue = 0,minVal= 0;

        for(int i=0 ;i<size;i++){
            currValue = height[i];
            lMax = leftMax(lMax,currValue);
            minVal = Math.min(rightMax[i],lMax);

            if(minVal > currValue){
                trap += Math.abs(minVal-currValue);
            }
        }


        return trap;
    }
}