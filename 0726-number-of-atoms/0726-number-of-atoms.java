class Solution {
    public String countOfAtoms(String formula) {
        int n = formula.length();
        int i = 0;

        Stack<Map<String,Integer>> stack = new Stack<>();
        Map<String,Integer> map = new HashMap<>();

        while(i<n){
            char ch = formula.charAt(i);

             // Case 1: Opening parenthesis
            if(ch == '('){
                stack.push(map);

                map = new HashMap<>();

                i++;

            }// Case 2: Closing parenthesis
            else if(ch == ')'){
                i++; //move to number ) bracket is not needed

                int multiplier = 0;

                while(i<n && Character.isDigit(formula.charAt(i))){
                    multiplier  = (multiplier * 10) + (formula.charAt(i) - '0');
                    i++;
                }

                if(multiplier == 0){
                    multiplier = 1;
                }


                // take the previous map and multiple with multiplier and add in the map;

                Map<String,Integer> previous  = stack.pop();

                for(String atom : map.keySet()){

                    int count = map.get(atom) * multiplier;
                    // update the current map and store the current with the previous map in the stack then curren tmap also get stored

                    previous.put(atom,previous.getOrDefault(atom,0) + count);

                }


                // update the current map with the previous map
                map = previous;

            }else{
                StringBuilder atom = new StringBuilder();

                atom.append(ch); // we know first char will Upper case
                i++;// check for count or smaller case letter

                // check for lower case 
                while(i<n && Character.isLowerCase(formula.charAt(i))){
                    atom.append(formula.charAt(i));
                    i++;
                }

                // check for count
                int count = 0;
                while(i<n && Character.isDigit(formula.charAt(i))){
                    count  = (count * 10) + (formula.charAt(i) - '0');
                    i++;
                }

                if(count == 0){
                    count = 1;
                }

                String name = atom.toString();

                map.put(name,map.getOrDefault(name,0)+count);
 
            }
        }

        // Sort the map
        TreeMap<String,Integer> sorted = new TreeMap<>(map);

        StringBuilder ans = new StringBuilder();

        for(String atom : sorted.keySet()){
            ans.append(atom);

            int count = sorted.get(atom);

            if(count > 1){
                ans.append(count);
            }
        }


        return ans.toString();
    }
}