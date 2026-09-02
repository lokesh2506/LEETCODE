class Solution {
    public boolean selfDividingNum(int og){
        int num = og;
        while(num != 0){
            int remd = num % 10;
            if(remd == 0 || og % remd != 0) return false;

            num /=10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new LinkedList<>();
        for(int i=left;i<=right;i++){
            if(selfDividingNum(i)){
                list.add(i);
            }
        }
        return list;
    }
}