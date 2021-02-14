import java.util.*;
class AlternateSorting{
    static int[] alternateSorting(int[] arr){
        int[] sortedarray=new int[arr.length];
        Arrays.sort(arr);
        int left=0,right=arr.length-1,k=0;
        while(left<right){
            sortedarray[k]=arr[right];
            k++;
            right--;
            sortedarray[k]=arr[left];
            k++;
            left++;
        }
        if(arr.length%2!=0)
            sortedarray[k]=arr[left];
        return sortedarray;
    }
    public static void main(String[] args) {
        int[] arr={7,6,1,3,4,5,2,8};
        int[] result=alternateSorting(arr);
        for(int i:result)
            System.out.print(i+" ");
    }
}