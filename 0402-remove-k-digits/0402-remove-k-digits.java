class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st=new Stack<>();

        for(int i=0;i<num.length();i++){
            char ch=num.charAt(i);
            while(!st.isEmpty() && k>0 && st.peek()>ch){
                st.pop();
                k--;
            }
            st.push(ch);
        }
        while(k>0){
            st.pop();
            k--;
        }
        if(st.isEmpty()){
            return "0";
        }
        String res="";
        while(!st.isEmpty()){
            res=res+st.peek();
            st.pop();
        }
        StringBuilder sb = new StringBuilder(res);
        sb.reverse();
        res = sb.toString();

        int i = 0;

        while(i < res.length() - 1 && res.charAt(i) == '0') {
            i++;
        }

        res = res.substring(i);

        if(res.length() == 0) {
            return "0";
        }

        return res;
    }
}