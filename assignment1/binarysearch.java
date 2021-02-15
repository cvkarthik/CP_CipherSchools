class BinarySearch{
    static int findElement(int[] arr,int x,int low,int high){
        while(low<high){
            int mid=low+(high-low)/2;
            if(x==arr[mid]){
                return mid;
            }
            else if(x<arr[mid]){
                return findElement(arr,x,low,mid-1);
            }
            else{
                return findElement(arr,x,mid+1,high);
            }
        }
        return -1;     
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,8,10};
        int low=0,mid,high=arr.length-1;
        int result=findElement(arr,8,low,high);
        if(result==-1)
            System.out.print("Not found");
        else
            System.out.print("Found at "+result);
    }
}