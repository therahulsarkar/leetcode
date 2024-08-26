class Solution {
    public boolean divisorGame(int n) {
        boolean[] mem = new boolean[n + 1];

        if (n == 1) {
            mem[1] = false;
            return false;
        }

        if (n == 2) {
            mem[2] = true;
            return true;
        }

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                mem[i] = !(divisorGame(n - i));
                return mem[i];
            }
        }
        return false;
    }

}