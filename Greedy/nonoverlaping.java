import java.util.Arrays;

public class nonoverlaping {
    public static int eraseOverlapIntervals(int intervals[][]) {
        int count = 0;

        Arrays.sort(intervals, (a, b) -> a[1] - b[1]); // sort the intervals based on their end time ex: [[1, 2], [2,
                                                       // 3], [1 , 3], [3, 4]]
        int prevend = intervals[0][1]; // end time of the first interval
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < prevend) { // if the start time of the current interval is less than the end time of
                                             // the previous interval then we have to remove the current interval
                count++;
            } else {
                prevend = intervals[i][1]; // update the end time to the end time of the current interval
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] intervals = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 1, 3 } };
        System.out.println(eraseOverlapIntervals(intervals));

    }
}
