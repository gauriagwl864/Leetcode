class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st= new Stack<>();
        Stack<Character> ts= new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='#'){
            if(!st.isEmpty() ){
                st.pop();
            }
            }
            else{
                st.push(ch);
            }
        }
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            if(c=='#'){
            if(!ts.isEmpty() && c=='#'){
                ts.pop();
            }
            }
            else{
                ts.push(c);
            }
        }
        String res="";
        for(int i=0;i<st.size();i++){
            char g=st.get(i);
            res=res+g;
        }
        String ser="";
        for(int i=0;i<ts.size();i++){
            char a=ts.get(i);
            ser=ser+a;
        }
        return (res.equals(ser));
        
    }
}