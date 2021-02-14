class findmissingnumber{
    static int find(int[] a){
        if(a.length==0)
            return 0;
        int n=a.length+1;
        int totalsum=(n*(n+1))/2;
        int sum=0;
        for(int i:a){
            sum=sum+i;
        }
        int missingnum=totalsum-sum;
        return missingnum;
    }
    public static void main(String[] args) {
        int[] a={1,3,4,5};
        int result=find(a);
        System.out.print(result);
    }
}