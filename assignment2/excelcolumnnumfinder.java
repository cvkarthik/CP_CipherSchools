class ExcelColumnNumber{
    static void columnNumber(String s){
        int res=0;
        int i=0;
        columnNumberHelper(s,res,i);
    }
    static void columnNumberHelper(String s,int result,int i){
        if(i>=s.length()){
            System.out.print(result);
            return;
        }
        if(s.length()==1){
            int num=(int)(s.charAt(i));
            num-=64;
            result+=num;
            columnNumberHelper(s,result,i+1);
        }
        else{
            int num=(int)(s.charAt(i));
            num-=64;
            for(int j=i;j<s.length()-1;j++)
                num*=26;
            result+=(num);
            columnNumberHelper(s,result,i+1);
        }
    }
    public static void main(String[] args){
        columnNumber("ZZ");
    }
}