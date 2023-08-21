class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String conc = s + s;
        String sub = conc.substring(1, conc.length() - 1);
        return sub.contains(s);
    }
}
