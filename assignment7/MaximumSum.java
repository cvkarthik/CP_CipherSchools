class MaximumSum //Maximum sum such that no two elements are adjacent
{ 
    int findMaximumSum(int arr[], int n) 
    { 
        int including=arr[0]; 
        int excluding=0; 
        int excluding_new; 
        int i; 
        for (i = 1; i < n; i++) 
        { 
            excluding_new=(including > excluding) ? including : excluding; 
            including=excluding + arr[i]; 
            excluding=excluding_new; 
        } 
        return ((including>excluding) ? including : excluding); 
    } 
    public static void main(String[] args) 
    { 
        MaximumSum obj=new MaximumSum(); 
        int[] arr={5,5,10,40,50,35}; 
        System.out.print(obj.findMaximumSum(arr,arr.length));
    } 
} 
