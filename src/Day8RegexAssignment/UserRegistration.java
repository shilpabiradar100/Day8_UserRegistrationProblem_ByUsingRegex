package Day8RegexAssignment;
/*UC3 = As a User need to
enter a valid email
- E.g. abc.xyz@bl.co.in - Email has 3 mandatory parts (abc, bl
& co) and 2 optional (xyz & in) with
precise @ and . positions*/


public class UserRegistration {
    public static void main(String[] args) {
        ValidateUserInfo validateUserInfo = new ValidateUserInfo();
        validateUserInfo.firstName();
        validateUserInfo.lastName();
        validateUserInfo.email();
    }
}

