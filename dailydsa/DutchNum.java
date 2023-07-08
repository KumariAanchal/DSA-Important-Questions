//program to find whether a number is Dutch number or not, a dutch number is a number that contains a zero in between the digits or end but it should not start with zero.
import java.util.*;
class Solution {
    public static void main(String[] args) {
        int n=3102;
        System.out.println(checkdutch(n));
    }
    public static boolean checkdutch(int number){
        String numString = String.valueOf(number);
        int n = numString.length();
        if (numString.charAt(0) == '0') {
            return false;
        }
        for (int i = 1; i < n; i++) {
            if (numString.charAt(i) == '0') {
                return true;
            }
        }
        return false;
    }
}
