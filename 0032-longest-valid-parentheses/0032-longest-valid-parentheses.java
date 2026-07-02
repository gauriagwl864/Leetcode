// class Solution {
//     public int longestValidParentheses(String s) {
//         Stack<Character> st=new Stack<>();
//         int count=0;
//         int ans=0;
//         for(int i=0;i<s.length();i++){
//             char ch= s.charAt(i);
//             if(ch=='('){
//                 st.push(ch);
//                 ans++;
//             }
//             else if(!st.empty() && ch==')' && st.peek()=='(' && ans==1){
//                 st.pop();
//                 count=count+2;
//             }
//         }
        
//         return (count);
//     }
// }
import java.util.Stack;

class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(-1);

        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(i);
            } else {
                st.pop();

                if (st.isEmpty()) {
                    st.push(i);
                } else {
                    ans = Math.max(ans, i - st.peek());
                }
            }
        }

        return ans;
    }
}