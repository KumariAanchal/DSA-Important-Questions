class Solution
{
    static int majorityElement(int A[], int size)
    {
        // your code here
        int majorityElement = A[0];
        int count = 1;
        
        for (int i = 1; i < size; i++) {
            if (A[i] == majorityElement) {
                count++;
            } else if (count > 0) {
                count--;
            } else {
                majorityElement = A[i];
                count = 1;
            }
        }
        count = 0;
        for (int i = 0; i < size; i++) {
            if (A[i] == majorityElement) {
                count++;
            }
        }
        
        if (count > size / 2) {
            return majorityElement;
        } else {
            return -1;
        }
    }
}
