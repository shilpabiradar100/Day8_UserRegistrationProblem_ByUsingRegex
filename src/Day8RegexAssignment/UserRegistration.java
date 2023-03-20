package Day8RegexAssignment;
/*UC7 = Rule3– Should
have at least 1
numeric number in
the password - NOTE – All rules must be passed*/

public class UserRegistration {
    public static void main(String[] args) {
        ValidateUserInfo validateUserInfo = new ValidateUserInfo();
        validateUserInfo.firstName();
        validateUserInfo.lastName();
        validateUserInfo.email();
        validateUserInfo.mobileNumber();
        validateUserInfo.passwordWithEightChar();
        validateUserInfo.passwordWithOneUpperCase();
        validateUserInfo.passwordWithOneNumeric();
    }
}

