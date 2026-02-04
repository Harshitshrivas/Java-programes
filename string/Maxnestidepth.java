public class Maxnestidepth {

    static int maxDepth(String s){
        int count = 0;
        int depth = 0;

        for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                count ++;
                depth = Math.max(depth, count);
            }
            else if( ch == ')'){
                count --;
            }
        }
        return  depth;
    }
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println("Maximum Nesting Depth: " + maxDepth(s));
    }
}
