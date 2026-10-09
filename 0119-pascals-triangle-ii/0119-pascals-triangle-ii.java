class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        list.add(1);

        long ans = 1;

        for(int i=1;i<=rowIndex;i++){
            ans *= (rowIndex - i + 1);
            ans /= i;

            list.add((int)ans);
        }

        return list;
    }
}