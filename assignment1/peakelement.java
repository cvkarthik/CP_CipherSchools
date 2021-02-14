class Peak{
    static void findPeak(int[] arr){
        int i=1,n=arr.length;
        if(n==1)
            System.out.print(arr[0]);
        else if(arr[0]>arr[1]){
            System.out.print(arr[0]);
        }
        else if(arr[n-1]>arr[n-2]){
            System.out.print(arr[n-1]);
        }
        while(i<n-1){
            if(arr[i-1]<=arr[i] && arr[i+1]<=arr[i]){
                System.out.print(arr[i]);
                break;
            }
            i++;
        }
    }
    public static void main(String[] args) {
        int[] arr={5,10,20,15};
        findPeak(arr);
    }
}