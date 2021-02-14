class Find{
    static int findFirstPosition(int[] arr,int x,int low,int high, int n){
        if(high>=low){
            int mid=low+(high-low)/2;
            if((mid==0 || x>arr[mid-1]) && arr[mid]==x)
                return mid;
            else if(x>arr[mid])
                return findFirstPosition(arr,x,mid+1,high,n);
            else
                return findFirstPosition(arr,x,low,mid-1,n);
        }
        return -1;
    }
    static int findLastPosition(int[] arr,int x,int low,int high, int n){
        if(high>=low){
            int mid=low+(high-low)/2;
            if((mid==n-1 || x<arr[mid+1]) && arr[mid]==x)
                return mid;
            else if (x < arr[mid])
                return findLastPosition(arr,x,low,mid-1,n);
            else
                return findLastPosition(arr,x,mid+1,high,n); 
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,2,3,3,3,4,5,6};
        int f=findFirstPosition(arr,2,0,arr.length-1,arr.length);
        int l=findLastPosition(arr,2,0,arr.length-1,arr.length);
        System.out.print("First position is "+f+" Last position is "+l);
    }
}