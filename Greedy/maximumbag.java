public class maximumbag {
    public static void main(String[] args) {
        int capacity [] = {2, 3, 4, 5};
        int rocks [] = {1, 2, 4, 4};
        int additionalRocks = 2;

        int count = 0;
        for(int i =0; i<capacity.length; i++){
            if(capacity[i] - rocks[i] <= additionalRocks){ // if the additional rocks can fill the bag to its capacity
                count++;
                additionalRocks -= (capacity[i] - rocks[i]);
            }else{
                break;
            }
        }
        System.out.println("count: " + count);
    }
}
