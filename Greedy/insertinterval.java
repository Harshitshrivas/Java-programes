public class insertinterval {
     
    public static int[][] insert(int intervals[][], int newInterval[]){
          
    }
    public static void main(String[] args) {
        int intervals[][] = {{1, 3}, {6, 9}};
        int newInterval[] = {2, 5};
        int ans[][] = insert(intervals, newInterval);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i][0] + " " + ans[i][1]);
        }
    }
}
