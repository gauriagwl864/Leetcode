class Solution {
    public int calPoints(String[] operations) {
        Stack <Integer> st=new Stack<>();
        for(int i=0;i<operations.length;i++){
            String s = operations[i];
        
        if(s.equals("+")){
            int last = st.pop();
            int seclast=st.peek();

            st.push(last);
            st.push(last+seclast);
        }
        else if(s.equals("D")){
            st.push(2 * st.peek());
        }
        else if(s.equals("C")){
            st.pop();
        }
        else {
            st.push(Integer.parseInt(s));
        }
        }
        int sum=0;
        for(int i=0;i<st.size();i++){
            sum=sum+st.get(i);       
        }
        return sum;
    }
}