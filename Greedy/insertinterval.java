public class insertinterval {

    public static int[][] insert(int intervals[][], int newInterval[]) {
        int ans[][] = new int[intervals.length + 1][2];
        int index = 0;
        for (int i = 0; i < intervals.length; i++) {    
            if (intervals[i][1] < newInterval[0]) {  // no overlap
                ans[index][0] = intervals[i][0];
                ans[index][1] = intervals[i][1];
                index++;
            } else if (intervals[i][0] > newInterval[1]) {
                ans[index][0] = newInterval[0];
                ans[index][1] = newInterval[1];
                index++;
                for (int j = i; j < intervals.length; j++) {
                    ans[index][0] = intervals[j][0];
                    ans[index][1] = intervals[j][1];
                    index++;
                }
                break;
            } else {
                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            }
        }
        if (index == 0 || ans[index - 1][1] < newInterval[0]) {
            ans[index][0] = newInterval[0];
            ans[index][1] = newInterval[1];
            index++;
        }
        int result[][] = new int[index][2];
        for (int i = 0; i < index; i++) {
            result[i][0] = ans[i][0];
            result[i][1] = ans[i][1];
        }
        return result; 
    }

    public static void main(String[] args) {
        int intervals[][] = { { 1, 3 }, { 6, 9 } };
        int newInterval[] = { 2, 5 };
        int ans[][] = insert(intervals, newInterval);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i][0] + " " + ans[i][1]);
        }
    }
}
