/* 
 Parking Lot Matrix

A parking lot in a mall has R × C number of parking spaces. Each parking space is either empty (0) or full (1).
The status of each parking space is represented as an element of a R × C matrix.
Your task is to find the index of the row that contains the maximum number of full parking spaces (1s).

Input:

* The first line contains two integers R and C, representing the number of rows and columns of the matrix.
* The next R lines contain C integers, where each element is either 0 or 1.

Output:

Print the **index of the row** having the maximum number of `1`s.

Constraints:

* `R × C` represents the size of the matrix.
* Each matrix element must be either `0` or `1`.
* Row indexing starts from **0**.

### Example:

Input: 

4 4
1 0 1 0
1 1 1 0
0 0 1 0
1 1 0 1

Output:

1
Explanation:
Row `1` contains the maximum number of `1`s, i.e. 3, so the answer is 1.
 */

public class parkinglot {
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 0, 1, 0},
            {1, 1, 1, 0},
            {0, 0, 1, 0},
            {1, 1, 0, 1}
        };
        int maxcount = 0;
        int maxrows = 0;

        for(int i =0; i< matrix.length; i++){
            int count = 0;
            for(int j =0; j<matrix[i].length; j++){
                if(matrix[i][j] == 1){
                    count++;
                }
            }
            if(count > maxcount){
                maxcount = count;
                maxrows = i;
            }
        }
        System.out.println("Maximum Count: "+ maxcount);
        System.out.println("Row index : "+ maxrows);
    }
}
