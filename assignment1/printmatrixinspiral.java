class spiral{
    static void printSpiralMatrix(int[][] arr){
        int rs=0,cs=0,re=arr.length-1,ce=arr[0].length-1;
        while(rs<=re && cs<=ce){
            for(int i=cs;i<=ce;i++){
                System.out.print(arr[rs][i]+" ");
            }
            rs++;
            for(int j=rs;j<=re;j++){
                System.out.print(arr[j][ce]+" ");
            }
            ce--;
            if(rs<=re){
                for(int i=ce;i>=cs;i--){
                    System.out.print(arr[re][i]+" ");
                }
                re--;
            }
            if(cs<=ce){
                for(int j=re;j>=rs;j--){
                    System.out.print(arr[j][cs]+" ");
                }
                cs++;
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4,5},
                     {6,7,8,9,10},
                     {11,12,13,14,15},
                     {16,17,18,19,20}
                    };
        printSpiralMatrix(arr);
    }
}