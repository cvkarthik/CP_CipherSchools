class Search{//in sorted rotated array
    static int search(int[] arr,int target,int left,int right){
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==target)
                return mid;
            else if(arr[left]<=arr[mid]){
                if(target<=arr[mid] && target>=arr[left])
                    right=mid-1;
                else
                    left=mid+1;
            }
            else if(arr[right]>=arr[mid]){
                if(target>=arr[mid] && target<=arr[right])
                    left=mid+1;
                else
                    right=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={4,5,6,7,8,1,2,3};
        int target=2;
        int result=search(arr,target,0,arr.length-1);
        if(result==-1)
            System.out.print("target not found");
        else
            System.out.print("target found at "+result);
    }
}