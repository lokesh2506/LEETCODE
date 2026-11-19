class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0;i<s.length();i++){
            sb.append(s.charAt(i));

            if(sb.length() >= part.length()){
                int start = sb.length() - part.length(); //3-3  = 0

                if(sb.substring(start).equals(part)){
                    sb.delete(start,sb.length());
                }
            }
        }

        return sb.toString();
    }
}