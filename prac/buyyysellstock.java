public class buyyysellstock {
    public static void main(String[] args) {
          int arr[] = {7,1,5,3,6,4};
          int n = arr.length;
          int min = arr[0];
          int profit = 0;

          int buyprice = arr[0];
          int sellprice = arr[0];

          for(int i =1; i<n; i++){

            int cost = arr[i] - min;

            if(cost > profit){
                profit = cost;
                buyprice = min;
                sellprice = arr[i];
            }
            min = Math.min(min, arr[i]);
          }
        System.out.println("Buy at: " + buyprice);
        System.out.println("Sell at: " + sellprice);
        System.out.println("Maximum Profit: " + profit);
    }
}
