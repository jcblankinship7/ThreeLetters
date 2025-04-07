public class Main {
    
public static String solution(int A, int B) {
  StringBuilder result = new StringBuilder();
  char charA = 'a';
  char charB = 'b';

  while (A > 0 || B > 0) {
    if (result.length() >= 2 && result.charAt(result.length() - 1) == result.charAt(result.length() - 2)) {
      if (result.charAt(result.length() - 1) == charA) {
        if (B > 0) {
          result.append(charB);
          B--;
        } else {
          return "Not possible to generate string without three consecutive letters being the same";
        }
      } else {
        if (A > 0) {
          result.append(charA);
          A--;
        } else {
          return "Not possible to generate string without three consecutive letters being the same";
        }
      }
    } else {
      if (A >= B) {
        if (A > 0) {
          result.append(charA);
          a--;
        }
      } else {
        if (B > 0) {
          result.append(charB);
          B--;
        }
      }
    }
  }

  return result.toString();
}
    
  public static void main(String args[]) {
    System.out.println(solution(5, 3));
  }
}
