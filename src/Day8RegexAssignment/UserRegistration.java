package Day8RegexAssignment;
/*UC6 = Rule2
– Should
have at least 1
Upper Case - NOTE – All rules must be passed*/


public class UserRegistration {
    public static void main(String[] args) {
        ValidateUserInfo validateUserInfo = new ValidateUserInfo();
        validateUserInfo.firstName();
        validateUserInfo.lastName();
        validateUserInfo.email();
        validateUserInfo.mobileNumber();
        validateUserInfo.passwordWithEightChar();
        validateUserInfo.passwordWithOneUpperCase();
    }
}

