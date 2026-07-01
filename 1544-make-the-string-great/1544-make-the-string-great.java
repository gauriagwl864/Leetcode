class Solution {
    public String makeGood(String s) {
        Stack <Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            
            if(!st.isEmpty() && Character.toUpperCase(st.peek())==Character.toUpperCase(ch) && st.peek()!=ch ){
                st.pop();
            }
            
            else{
                st.push(ch);
            }
        }
        String res="";
        for(int i=0;i<st.size();i++){
            char c = st.get(i);
            res = res + c;
        }
        return res;
    }
}