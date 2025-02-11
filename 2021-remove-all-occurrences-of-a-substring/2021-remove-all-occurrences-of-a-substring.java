// class Solution {
//     public String removeOccurrences(String s, String part) {
//         while (s.contains(part)) {
//             s = s.replace(part, "");
//         }
//         return s;


//      import java.util.Stack;
//     }
// }
class Solution {
    public String removeOccurrences(String s, String part) {
        Stack<Character> stack = new Stack<>();
        int partLength = part.length();

        for (char c : s.toCharArray()) {
            stack.push(c);

            // Check if the top of the stack matches the part string
            if (stack.size() >= partLength) {
                boolean match = true;
                for (int i = 0; i < partLength; i++) {
                    if (stack.get(stack.size() - partLength + i) != part.charAt(i)) {
                        match = false;
                        break;
                    }
                }
                
                // If a match is found, pop the last partLength characters
                if (match) {
                    for (int i = 0; i < partLength; i++) {
                        stack.pop();
                    }
                }
            }
        }

        // Build the result from the stack
        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }

        return result.toString();
    }
}
