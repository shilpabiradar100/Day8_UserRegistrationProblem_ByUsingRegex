package Day8RegexAssignment;
/*UC9 = Should clear all
email samples
provided separately*/

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
        validateUserInfo.passwordWithOneSpecialChar();
        validateUserInfo.verifyValidEmails();
    }
}

