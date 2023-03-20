package Day8RegexAssignment;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ValidateUserInfo {
    Scanner sc = new Scanner(System.in);

    public void firstName() {
        System.out.println("Enter the first name: ");
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

    public void lastName() {
        System.out.println("Enter the last name: ");
        String lastName = sc.next();

        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}");
        Matcher matcher = pattern.matcher(lastName);
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("last name is valid");
        } else {
            System.out.println("last name is invalid");
        }
    }
    public void email(){
        System.out.println("Enter the email: ");
        String email = sc.next();

        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+([.][0-9a-zA-Z]+)*@[a-zA-Z]+.[a-z]{2,4}([.][a-z]{2,4})*$");
        Matcher matcher = pattern.matcher(email);
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("email is valid");
        } else {
            System.out.println("email is invalid enter the email again");
        }
    }
}
