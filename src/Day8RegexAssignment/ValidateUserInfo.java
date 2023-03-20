package Day8RegexAssignment;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ValidateUserInfo {
    Scanner sc = new Scanner(System.in);

    public void firstName() {
        System.out.println("Enter the first name ");
        String firstName = sc.next();

        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}");
        Matcher matcher = pattern.matcher(firstName);
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("first name is valid");
        } else {
            System.out.println("first name is invalid");
        }
    }
}
