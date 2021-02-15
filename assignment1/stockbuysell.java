class StockBuySell{
    static int findMaxProfit(int[] arr){
        int maxprofit=0,profit,minval=arr[0];
        for(int i=1;i<arr.length;i++){
            if(minval<=arr[i]){
                profit=arr[i]-minval;
                maxprofit=Math.max(profit,maxprofit);
            }
            else if(minval>arr[i]){
                minval=arr[i];
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int[] arr={100,180,260,310,40,535,645};
        int result=findMaxProfit(arr);
        System.out.print(result);
    }
}