class Solution {

    List<String> list = new ArrayList<>();

    public String getHappyString(int n, int k) {
        dfs("", n);

        if (k > list.size()) return "";
        return list.get(k - 1);
    }

    public void dfs(String s, int n) {

        if (s.length() == n) {
            list.add(s);
            return;
        }

        for (char c : new char[]{'a','b','c'}) {
            if (s.length() == 0 || s.charAt(s.length()-1) != c) {
                dfs(s + c, n);
            }
        }
    }
}