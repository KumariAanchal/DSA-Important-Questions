public class CheckPattern {
    public static boolean searchPattern(String str, String pat) {
        return str.contains(pat);// code here
    }
    public static void main(String args[]){
        String str="abcds";
        String pat="bce";
        System.out.println(searchPattern(str, pat));

    }
}
