class Solution {
    public String removeDuplicates(String s) {
        Scanner sc=new Scanner (System.in);
        Stack <Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
        
            if(!st.isEmpty() && st.peek()==ch){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        // StringBuilder res=new StringBuilder();
        // for(int i=0;i<st.size();i++){
        //     char c=st.get(i);
        //     res.append(c);
        // }
        // return res.toString();
        String res = "";
        for(int i=0;i<st.size();i++){
            char c=st.get(i);
            res = res+c;
        }
        return res;
    }
}