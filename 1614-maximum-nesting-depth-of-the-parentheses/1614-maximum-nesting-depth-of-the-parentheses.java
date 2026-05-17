class Solution {
    public int maxDepth(String s) {
        int depth = 0;

        int maxDepth = 0;

        for(int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // Opening bracket
            if(ch == '(') {

                depth++;

                maxDepth = Math.max(maxDepth, depth);
            }

            // Closing bracket
            else if(ch == ')') {

                depth--;
            }
        }

        return maxDepth;
    }

    }
