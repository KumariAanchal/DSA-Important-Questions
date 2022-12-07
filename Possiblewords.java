//Given a keypad as shown in the diagram, and an N digit number which is 
//represented by array a[ ], the task is to list all words which are possible by pressing these numbers.
public class Possiblewords {
    static ArrayList <String> possibleWords(int a[], int N)
    {
        String words[] = {"0","0", "abc", "def","ghi","jkl", "mno","pqrs", "tuv", "wxyz"};
        ArrayList<String> res = new ArrayList<>();
        fun(a,words,res,0,"");
        return res;
    }
    static void fun(int a[],String words[],ArrayList<String> res, int digit, String str)
    {
        if(digit == a.length){
            res.add(str);
            return;
        }
        String keyWord  = words[a[digit]];
        for(int i = 0;i < keyWord.length();i++)
            fun(a,words,res,digit+1,str + keyWord.charAt(i));
    }
}
