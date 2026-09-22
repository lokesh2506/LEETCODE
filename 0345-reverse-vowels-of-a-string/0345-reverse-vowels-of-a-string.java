class Solution {
    public String reverseVowels(String s) {

        int i=0,j=s.length()-1;

        char arr [] = s.toCharArray();


        while(i<j){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);

            if(ch1 != 'a' && ch1 != 'A' && ch1 != 'e' && ch1 != 'E' && ch1 != 'i' && ch1 != 'I' && ch1 != 'o' && ch1 != 'O' && ch1 != 'u' && ch1 != 'U'){
                i++;
                continue;
            }

            if(ch2 != 'a' && ch2 != 'A' && ch2 != 'e' && ch2 != 'E' && ch2 != 'i' && ch2 != 'I' && ch2 != 'o' && ch2 != 'O' && ch2 != 'u' && ch2 != 'U'){
                j--;
                continue;
            }


            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
            
        }

        return new String(arr);
    }
}


// class Solution {
//     public String reverseVowels(String s) {
//         char[] word = s.toCharArray();
//         int start = 0;
//         int end = s.length() - 1;
//         String vowels = "aeiouAEIOU";
        
//         while (start < end) {
//             // Move start pointer until it points to a vowel
//             while (start < end && vowels.indexOf(word[start]) == -1) {
//                 start++;
//             }
            
//             // Move end pointer until it points to a vowel
//             while (start < end && vowels.indexOf(word[end]) == -1) {
//                 end--;
//             }
            
//             // Swap the vowels
//             char temp = word[start];
//             word[start] = word[end];
//             word[end] = temp;
            
//             // Move the pointers towards each other
//             start++;
//             end--;
//         }
        
//         String answer = new String(word);
//         return answer;
//     }
// }