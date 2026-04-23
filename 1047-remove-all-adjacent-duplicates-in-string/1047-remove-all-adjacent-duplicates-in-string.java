class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!st.isEmpty() && ch==st.peek()){
                st.pop();
            }
            else{
                st.push(ch);
            }
            
        }
        StringBuilder result=new StringBuilder();
        for(int i=0;i<st.size();i++){
            char c=st.get(i);
            result.append(c);
        }
        return result.toString();
    }
}