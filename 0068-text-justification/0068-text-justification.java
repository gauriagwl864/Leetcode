class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> ans = new ArrayList<>();
        int i = 0;

        while (i < words.length) {
            int len = words[i].length();
            int j = i + 1;

            while (j < words.length && len + 1 + words[j].length() <= maxWidth) {
                len += 1 + words[j].length();
                j++;
            }

            int gaps = j - i - 1;
            String line = "";

            if (j == words.length || gaps == 0) {
                for (int k = i; k < j; k++) {
                    line += words[k] + " ";
                }
                line = line.trim();
                while (line.length() < maxWidth) line += " ";
            }
            else {
                int spaces = maxWidth;
                for (int k = i; k < j; k++) spaces -= words[k].length();

                int each = spaces / gaps;
                int extra = spaces % gaps;

                for (int k = i; k < j; k++) {
                    line += words[k];
                    if (k < j - 1) {
                        for (int s = 0; s < each; s++) line += " ";
                        if (extra-- > 0) line += " ";
                    }
                }
            }

            ans.add(line);
            i = j;
        }
        return ans;
    }
}
