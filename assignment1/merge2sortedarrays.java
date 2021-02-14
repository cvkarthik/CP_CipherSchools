import java.util.*;
class merge2sortedarray{
    static int[] mergesortedarray(int[] a1, int[] a2){
       int i=0,j=0,k=0;
        int[] result=new int[a1.length+a2.length];
        while(i<a1.length && j<a2.length){
            if(a1[i]<=a2[j]){
                result[k]=a1[i];
                i++;
            }
            else{
                result[k]=a2[j];
                j++;
            }
            k++;
        }
        while(i<a1.length){
            result[k]=a1[i];
            i++;
            k++;
        }
        while(j<a2.length){
            result[k]=a2[j];
            j++;
            k++;
        }
        return result;
    }
    public static void main(String[] args){
        int[] a1={1,3,5,7,9,11};
        int[] a2={2,4,6,8};
        int[] result=mergesortedarray(a1,a2);
        
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
