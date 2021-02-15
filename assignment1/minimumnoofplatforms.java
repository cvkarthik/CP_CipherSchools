import java.util.*;
class MinPlatforms{
    static int findingMinPlatforms(int[] arr,int[] dep){
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=1,j=0,result=1;
        int minplatforms=1;
        while(i<arr.length && j<dep.length){
            if(arr[i]<=dep[j]){
                minplatforms++;
                i++;
            }
            else if(arr[i]>dep[j]){
                minplatforms--;
                j++;
            }
            if(minplatforms>result){
                result=minplatforms;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
        int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
        int result=findingMinPlatforms(arr,dep);
        System.out.print("Min platforms = "+result);
    }
}