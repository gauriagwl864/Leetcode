class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack <Integer> st= new Stack<>();
        int n=nums.length;
        int ans[] = new int[n];
        
        for(int i = 2*n-1 ;i >= 0; i--){
            while(!st.isEmpty() && nums[st.peek()]<=nums[i%n]){
                st.pop();
            }
            if(i<n){
            if(!st.isEmpty()){
                ans[i] = nums[st.peek()];
            }
            else{
                ans[i]=-1;
            }
            }
            st.push(i % n );
        }
        return ans;
    }
}