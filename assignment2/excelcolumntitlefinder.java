class ExcelColumnTitle{
    static void finder(int n){
        String result="";
        finderHelper(n,result);
    }
    static void finderHelper(int n,String result){
        if(n<=0){
            for(int i=result.length()-1;i>=0;i--)
                System.out.print(result.charAt(i));
            return;
        }
        if(n<26){
            char x=(char)(n+64);
            n=(n/26)-1;
            result+=x;
            finderHelper(n,result);
        }
        else{
            int temp=n%26;
            if(temp==0){
                temp=26;
                n=(n/26)-1;
            }
            else{
                n=n/26;
            }
            char c=(char)(temp+64);
            result+=c;
            finderHelper(n,result);
        }
    }
    public static void main(String[] args){
        finder(18278);
    }
}