public class validparanthesisistring {
    public static boolean isValid(String s) {
        int minopen = 0, maxopen = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            switch (ch) {
                case '(' -> {
                    minopen++;
                    maxopen++;
                }
                case ')' -> {
                    minopen--;
                    maxopen--;
                }
                case '*' -> {
                    minopen--;
                    maxopen++;
                }
                default -> {
                }
            }
        }
        return minopen <= 0 && maxopen >= 0;
    }

    public static void main(String[] args) {
        String s = "(*))";
        System.out.println(isValid(s));
    }
}
