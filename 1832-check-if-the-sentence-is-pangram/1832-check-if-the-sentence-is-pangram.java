class Solution {
    public boolean checkIfPangram(String sentence) {
        int size = sentence.length();

        if(size < 26) return false;

        boolean status = true;
        for(char ch ='a';ch <= 'z';ch++){
            if(!sentence.contains(String.valueOf(ch))){
                // you can check only string "" in the .contains methos not char ''
                // So you need to conver the string -> char String.valueOf()
                status = false;
                break; 
            }
        }

        return status;
    }
}