class Solution
{
     long floorSqrt(long x){
		 if (x == 0 || x == 1) {
            return x;
        }
        long i = 0, j = x;
        while (i <= j) {
            long mid = i + (j - i)/2;
            long sqr = mid*mid;
            if (sqr == x) {
                return mid;
            }
            if (sqr < x) {
               i = mid + 1; 
            } else {
                j = mid - 1;
            }
        }
        return i-1;
	 }
}
