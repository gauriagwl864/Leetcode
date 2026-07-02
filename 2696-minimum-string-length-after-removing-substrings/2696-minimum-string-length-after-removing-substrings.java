class Solution {
    public int minLength(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='B' || ch=='D'){
                if(!st.isEmpty() && (st.peek()=='A' && ch=='B' || st.peek()=='C' && ch=='D')){
                    st.pop();
                }
                else{
                    st.push(ch);
                }
            }
            else{
                st.push(ch);
            }
            
        }
        // String res= "";
        // int count=0;
        // for(int i =0;i<st.size();i++){
        //     char c=st.get(i);
        //     count++;
        //     res= res+c;
        // }
        
        return (st.size());
    }
}