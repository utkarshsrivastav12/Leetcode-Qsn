class Solution {
    public String removeOccurrences(String s, String part) {
        while (s.contains(part)) {
            s = s.replaceFirst(part, "");
        }
        return s;


    }  
}
















// class Solution {
//     public String removeOccurrences(String s, String part) {
//         Stack<Character> stack = new Stack<>();
//         int pL = part.length();
//         for (char c : s.toCharArray()) {
//             stack.push(c);
//             if (stack.size() >= pL) {
//                 boolean match = true;
//                 for (int i = 0; i < pL; i++) {
//                     if (stack.get(stack.size() - pL + i) != part.charAt(i)) {
//                         match = false;
//                         break;
//                     }
//                 }
//                 if (match) {
//                     for (int i = 0; i < pL; i++) {
//                         stack.pop();
//                     }
//                 }
//             }
//         }
//         StringBuilder result = new StringBuilder();
//         for (char c : stack) {
//             result.append(c);
//         }

//         return result.toString();
//     }
// }
