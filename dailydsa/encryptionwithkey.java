class encryption {
    public static void main(String[] args) {
        String s="abvyesxc";
        int key[]={2,1,3,4};
        System.out.println(encrypt(s,key));
    }
    public static String encrypt(String s, int key[]){
        char arr[]=s.toCharArray();
        int m=26;
        for(int i=0; i<s.length();i++){
            if(key.length==1){
                arr[i]=(char)((arr[i])-key[0]);
                if(arr[i]<'a'){
                    arr[i]=(char)(arr[i]+m);
                }
            }
            else if(key.length>i){
                arr[i]=(char)(arr[i]-key[i]);
                if(arr[i]<'a'){
                    arr[i]=(char)(arr[i]+m);
                }
            }
             else {
                continue;
            }
            
        }
        String res="";
        for(int i=0; i<arr.length; i++){
            res+=arr[i];
        }
        return res;
    }
}
