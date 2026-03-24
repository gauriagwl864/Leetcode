class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int mod = 12345;

        int size = m * n;
        long[] arr = new long[size];

        int idx = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[idx++] = grid[i][j];
            }
        }

        long[] prefix = new long[size];
        long[] suffix = new long[size];

        prefix[0] = 1;
        for (int i = 1; i < size; i++) {
            prefix[i] = (prefix[i - 1] * arr[i - 1]) % mod;
        }

        suffix[size - 1] = 1;
        for (int i = size - 2; i >= 0; i--) {
            suffix[i] = (suffix[i + 1] * arr[i + 1]) % mod;
        }

        int[][] res = new int[m][n];
        idx = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                long val = (prefix[idx] * suffix[idx]) % mod;
                res[i][j] = (int) val;
                idx++;
            }
        }

        return res;
    }
}