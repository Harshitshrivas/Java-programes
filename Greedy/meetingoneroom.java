
import java.util.ArrayList;
import java.util.List;

class meeting {
    int start;
    int end;

    meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class meetingoneroom {

    public static int MaxMeeting(int start[], int end[]) {

        int n = start.length;
        List<meeting> meetings = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            meetings.add(new meeting(start[i], end[i]));
        }
        meetings.sort((a, b) -> a.end - b.end); // sort the meetings based on their end time

        int count = 1;
        int endtime = meetings.get(0).end;
        for (int i = 1; i < n; i++) {
            if (meetings.get(i).start >= endtime) { // if the start time of the current meeting is greater than or equal
                                                    // to the end time of the previous meeting then we can attend the
                                                    // current meeting
                count++;
                endtime = meetings.get(i).end; // update the end time to the end time of the current meeting
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        System.out.println("Maximum number of meetings that can be attended: " + MaxMeeting(start, end));

    }
}
