class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // Stack <Integer> st = new Stack<>();
        // int ans[] = new int[temperatures.length];
        // for(int i=0;i<temperatures.length;i++){
        //     int count=1;
        //     for(int j=i+1;j<temperatures.length;j++){
        //         if(temperatures[i]<temperatures[j]){
        //             ans[i]=count;
        //             break;
        //         }
        //         else{
        //             count++;
        //         }
        //     }
        // }
        // return ans;

        Stack <Integer> st = new Stack<>();
        int n = temperatures.length;
        int[] ans = new int[n];

        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() &&
                   temperatures[st.peek()] <= temperatures[i]) {
                st.pop();
            }

            if (!st.isEmpty()) {
                ans[i] = st.peek() - i;
            }

            st.push(i);
        }

        return ans;
    }
}