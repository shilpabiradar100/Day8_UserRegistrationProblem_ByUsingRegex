package Day8RegexAssignment;
/*UAs a User need to
follow pre-defined Password rules.
Rule1
– minimum 8 Characters - NOTE – All rules must be passed*/


public class UserRegistration {
    public static void main(String[] args) {
        ValidateUserInfo validateUserInfo = new ValidateUserInfo();
        validateUserInfo.firstName();
        validateUserInfo.lastName();
        validateUserInfo.email();
        validateUserInfo.mobileNumber();
        validateUserInfo.passwordWithEightChar();
    }
}

