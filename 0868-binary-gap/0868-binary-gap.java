class Solution {
    public int binaryGap(int n) {
        String bin = Integer.toBinaryString(n);
        int max = 0;
        int last = -1;

        for (int i = 0; i < bin.length(); i++) {
            if (bin.charAt(i) == '1') {
                if (last != -1) {
                    max = Math.max(max, i - last);
                }
                last = i;
            }
        }
        return max;
    }
}