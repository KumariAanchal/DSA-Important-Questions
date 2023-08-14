class Solution
{
    //Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer>s,int x){
        // code here
        if(x%2==0){
          s.remove((s.size()/2)-1);
        }
        else{
            s.remove(s.size()/2);
        }
    } 
}
