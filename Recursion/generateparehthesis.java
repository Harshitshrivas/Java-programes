public class generateparehthesis {
    public static void generateParenthesis(int open, int close, String output) {
    
        if( open == 0 && close == 0){
            System.out.println(output);
            return;
        }
        if(open > 0){
            generateParenthesis(open - 1, close, output + "(");
        }
        if(close > 0 && open < close){
            generateParenthesis(open, close - 1, output + ")");
        }
    }
    public static void main(String[] args) {
        int n = 3;
        generateParenthesis(n, n, "");
    }
}
