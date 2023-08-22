class Solution {
    public String convertToTitle(int n) {
        if (n < 27) {
            return Character.toString((char) ('A' + (n - 1) % 26));
        }
        StringBuilder c = new StringBuilder();
        while (n > 0) {
            if (n % 26 == 0) {
                c.append((char) ('A' + 25));
                n -= 1;
            } else {
                c.append((char) ('A' + n % 26 - 1));
            }
            n /= 26;
        }
        return c.reverse().toString();
    }
}
