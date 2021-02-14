class DutchnationalFlag{
    static void dutchnationalFlagsSort(int[] arr){
        int low=0,mid=0,high=arr.length-1,temp;
        while(low<=mid && mid<high ){
            if(arr[mid]==0){
                temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else if(arr[mid]==2){
                temp=arr[high];
                arr[high]=arr[mid];
                arr[mid]=temp;
                mid++;
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={00,1,1,2,0,0,1,2,1};
        dutchnationalFlagsSort(arr);
        for(int i:arr)
            System.out.print(i+" ");
    }
}
