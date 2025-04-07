import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static List<String> solution(int A, int B) {
        List<String> result = new ArrayList<>();
        backtrack(result, new StringBuilder(), A, B, 0, 0);
        return result;
    }

    private static void backtrack(List<String> result, StringBuilder sb, int A, int B, int countA, int countB) {
        if (A == 0 && B == 0) {
            result.add(sb.toString());
            return;
        }

        if (A > 0 && countA < 2) {
            sb.append('a');
            backtrack(result, sb, A - 1, B, countA + 1, 0); 
            sb.deleteCharAt(sb.length() - 1);
        }

        if (B > 0 && countB < 2) {
            sb.append('b');
            backtrack(result, sb, A, B - 1, 0, countB + 1); 
            sb.deleteCharAt(sb.length() - 1);
        }
    }
    
    public static void main(String[] args) {
        int A = 3;
        int B = 3;
        List<String> result = solution(A, B); 
        for (String S : result) {
            System.out.println(S);
        }
    }
}
