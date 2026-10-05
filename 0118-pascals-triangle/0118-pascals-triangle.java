class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for(int row=0;row<numRows;row++){
            List<Integer> current = new ArrayList<>();
            current.add(1);
            for(int col=1;col<row;col++){
                List<Integer> previous = result.get(row-1);
                current.add(previous.get(col)+previous.get(col-1));
            }

            if(row > 0){
                current.add(1);
            }

            result.add(current);
        }

        return result;
    }
}