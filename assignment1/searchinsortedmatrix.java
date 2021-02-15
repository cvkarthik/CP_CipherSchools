class Search{
    static void findElement(int[][] arr, int n,int x){
        int i=0,j=n-1;
        while(i<n && j>=0){
            if(arr[i][j]==x){
                System.out.print("Element found at "+i+" "+j);
                break;
            }
            if(x<arr[i][j]){
                j--;
            }
            else{
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr={ {10,20,30,40},
                      {15,25,35,45},
                      {27,29,37,48},
                      {32,33,39,50}
                    };
        int n=arr.length;
        int x=29;
        findElement(arr,n,x);
    }
}