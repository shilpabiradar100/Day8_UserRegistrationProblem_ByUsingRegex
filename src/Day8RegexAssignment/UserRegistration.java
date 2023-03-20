package Day8RegexAssignment;
/*UC8 =Rule4 – Has exactly
1 Special Character
- NOTE – All rules must be passed*/

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
    }
}

