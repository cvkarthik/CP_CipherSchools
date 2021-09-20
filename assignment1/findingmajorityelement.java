class Majority{ // Moore's Voting Algorithm
    static int getCandidate(int[] arr){
        int candidate=arr[0],count=1;
        for(int i=1;i<arr.length;i++){
            if(count==0){
                candidate=arr[i];
                count=1;
            }
            if(arr[i]==candidate)
                count++;
            else
                count--;
        }
        return candidate;
    }
    static void findingMajorityElement(int[] arr){
        int candidate=getCandidate(arr);
        int count=0,n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==candidate)
                count++;
        }
        if(count>n/2)
            System.out.print("Majority element is "+ candidate);
        else
            System.out.print("No majority element is found");
    }
    public static void main(String[] args) {
        int[] arr={1,1,2,1,3,1,1,5,6,7,1};
        findingMajorityElement(arr);
        
    }
}
