import java.util.Scanner;

public class passwordValidation {

  public static void main(String[] args) {
    /*
     * take input from user
     * password and confirm password
     * password must contain one upper, one lower, one num, one sp char, with min len of 6 char
     * and max len of 20 chars
     *
     * password must not contain any spaces and both password and confirm password should match.
     */
    Scanner scanner = new Scanner(System.in);

    Boolean isWhiteSpace = false;
    Boolean isUpper = false;
    Boolean isLower = false;
    Boolean isNum = false;
    Boolean isSp = false;
    Boolean isLen = false;
    System.out.println(
      "Pleae Enter Password.\nNo spaces allowed\nOne Upper one Lower, oNe Num, one Sp\n min 6 max 20"
    );
    String password = scanner.nextLine();
    // length >= 6 and <=20  completed
    // whitespace completed
    // upper
    // lower
    // number
    // spchar compled

    if (password.length() >= 6 && password.length() <= 20) {
      isLen = true;
      for (int i = 0; i < password.length(); i++) {
        if (Character.isWhitespace(password.charAt(i))) {
          System.out.println("invalid, spaces not allowed in passwords");
          return;
        } else {
          if (Character.isLetterOrDigit(password.charAt(i))) {
            if (Character.isUpperCase(password.charAt(i))) {
              isUpper = true;
            } else if (Character.isLowerCase(password.charAt(i))) {
              isLower = true;
            } else {
              isNum = true;
            }
          } else {
            isSp = true;
          }
        }
      }
    } else {
      System.out.println("invalid len");
      return;
    }

    if (isUpper && isLower && isSp && isNum) {
      System.out.println("re-enter your password");
      String confirm = scanner.nextLine();
      scanner.close();

      if (confirm.equals(password)) {
        System.out.println("Login Successful");
      } else {
        System.out.println("Both Password must match!");
      }
    } else {
      System.out.println(
        "your password does not meet the minimum requirements"
      );
    }
  }
}
