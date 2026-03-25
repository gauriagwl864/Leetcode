class Solution {
    public String simplifyPath(String path) {
        String[] arr = path.split("/");
        Stack<String> st = new Stack<>();

        for (String s : arr) {
            if (s.equals("") || s.equals(".")) continue;
            
            if (s.equals("..")) {
                if (!st.isEmpty()) st.pop();
            } else {
                st.push(s);
            }
        }

        String ans = "";
        for (String s : st) {
            ans += "/" + s;
        }

        return ans.equals("") ? "/" : ans;
    }
}