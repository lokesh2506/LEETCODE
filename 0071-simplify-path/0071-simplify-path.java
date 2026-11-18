class Solution {
    public String simplifyPath(String path) {
        String [] location = path.split("/");

        Stack<String> stack = new Stack<>();

        for(int i=0;i<location.length;i++){
            String str = location[i];

            if(str.length() == 0 || str.equals(".")){
                continue;
                // Not insert the "." or  any "/" "//" "///"
            }else if(str.equals("..")){
                // move to previous director
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else{
                stack.push(location[i]);
            }
        }

        // Build the final path
        StringBuilder result = new StringBuilder();

        for (String dir : stack) {
            result.append("/");
            result.append(dir);
        }

        // Root directory case
        if (result.length() == 0) {
            return "/";
        }

        return result.toString();

    }
}