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

    public void email() {
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

    public void mobileNumber() {
        System.out.println("Enter the mobile number: ");
        sc.next();
        String mobileNumber = sc.nextLine();

        Pattern pattern = Pattern.compile("^[+][0-9]{2}[\\s][0-9]{10}$");
        Matcher matcher = pattern.matcher(mobileNumber);
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("mobile number is valid");
        } else {
            System.out.println("mobile number is invalid");
        }
    }

    public void passwordWithEightChar() {
        System.out.println("Enter the password: ");
        String password = sc.nextLine();
        Pattern pattern = Pattern.compile("^[a-zA-z]{8,}");
        Matcher matcher = pattern.matcher(password);
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("password is valid");
        } else {
            System.out.println("password is invalid");
        }
    }
    public void passwordWithOneUpperCase(){
        System.out.println("Enter the password at least with one upper case: ");
        String password = sc.nextLine();
        Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z]).+${8,}");
        Matcher matcher = pattern.matcher(password);
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("password is valid");
        } else {
            System.out.println("password is invalid");
        }
    }
    public void passwordWithOneNumeric(){
        System.out.println("Enter the password at least one number : ");
        String password = sc.nextLine();
        Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).+${8,}");
        Matcher matcher = pattern.matcher(password);
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("password is valid");
        } else {
            System.out.println("password is invalid");
        }
    }
    public void passwordWithOneSpecialChar(){
        System.out.println("Enter the password with special character : ");
        String password = sc.next();
        Pattern pattern = Pattern.compile("^(?=.+[a-z])(?=.+[A-Z])(?=.+[0-9])(?=.+[-+_!@#$%^&*., ?]).+${8,}");
        Matcher matcher = pattern.matcher(password);
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("password is valid");
        } else {
            System.out.println("password is invalid");
        }
    }
}
