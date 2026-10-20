class Solution {
    public int equalPairs(int[][] grid) {
        Map<String,Integer> map = new HashMap<>();

        int count = 0;

        for(int i=0;i<grid.length;i++){
            StringBuilder row = new StringBuilder();
            for(int j=0;j<grid[0].length;j++){
                row.append(grid[i][j]).append("#");
            }

            String rowKey = row.toString();

            map.put(rowKey,map.getOrDefault(rowKey,0)+1);
        }

        for(int i=0;i<grid.length;i++){
            StringBuilder col = new StringBuilder();
            for(int j=0;j<grid[0].length;j++){
                col.append(grid[j][i]).append("#");
            }

            String colKey = col.toString();

            if(map.containsKey(colKey)){
                count += map.get(colKey);
            }
        }

        return count;

    }
}