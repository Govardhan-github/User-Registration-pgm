import java.util.regex.Pattern;
/*
Program Of User Registration Details
 */
public class UserRegistration {
    private Pattern pattern;

    //UC1
    //Declaring Method TO Validate FirstName
    public boolean ValidateFirstName(String FirstName) {
        //First Name Matching With The Pattern And Stored In Validation
        boolean Validation = pattern.matches("^[A-Z][a-z]{2,}$", FirstName);
        //Validation Is Boolean Type True Or False
        if (Validation) {//If Validation Is True Print The Valid Name
            System.out.println("First Name is Valid");
        } else {//If Validation Is False Print The Name Is Invalid
            System.out.println("Invalid... Enter valid name");
        }
        return Validation;//Return Validation
    }

    //UC2
    //Declaring Method TO Validate LastName
    public boolean ValidateLastName(String LastName) {
        //Last Name Matching With The Pattern And Stored In Validation
        boolean Validation = pattern.matches("^[A-Z][a-z]{2,}$", LastName);
        //Validation Is Boolean Type True Or False
        if (Validation) {//If Validation Is True Print The Valid Name
            System.out.println("Last Name is Valid");
        } else {//If Validation Is False Print The Name Is Invalid
            System.out.println("Invalid... Enter valid name");
        }
        return Validation;//Return Validation
    }

    //UC3
    //Declaring Method TO Validate Email
    public boolean ValidateEmail(String Email) {
        //email Matching With The Pattern And Stored In Validation
        boolean Validation = pattern.matches("^[a-z][a-zA-Z0-9]+([._+#-][a-zA-Z0-9]+)*@[a-zA-Z0-93]+.[a-zA-Z]{2,3}(.[a-zA-Z]{2,3})?$", Email);
        //Validation Is Boolean Type True Or False
        if (Validation) {//If Validation Is True Print The Valid Name
            System.out.println("Email is Valid");
        } else {//If Validation Is False Print The Name Is Invalid
            System.out.println("Invalid... Enter valid Email");
        }
        return Validation;//Return Validation
    }

    //UC4
    //Declaring Method TO Validate Phone Number
    public boolean ValidatePhoneNumber(String PhoneNumber) {
        //Phone Number Matching With The Pattern And Stored In Validation
        boolean Validation = pattern.matches("^[9][1] [6-9]{1}[0-9]{9}$", PhoneNumber);
        //Validation Is Boolean Type True Or False
        if (Validation) {//If Validation Is True Print The Valid Number
            System.out.println("Phone Number is Valid");
        } else {//If Validation Is False Print The Number Is Invalid
            System.out.println("Invalid... Enter valid Phone  Number");
        }
        return Validation;//Return Validation
    }

    //UC5
    //Declaring Method TO Validate Password
    public boolean ValidatePassword(String Password) {
        //Password Matching With The Pattern And Stored In Validation
        boolean Validation = pattern.matches("(?=.*[a-z])(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%!]).{8,}", Password);
        //Validation Is Boolean Type True Or False
        if (Validation) {//If Validation Is True Print The Valid Password
            System.out.println("Password is Valid");
        } else {//If Validation Is False Print The Password Is Invalid
            System.out.println("Invalid... Enter valid Password");
        }
        return Validation;//Return Validation
    }

    //UC6
    //Declaring Method TO Validate Password
    public boolean ValidatePasswordUpperCase(String Password) {
        //Password Matching With The Pattern And Stored In Validation
        boolean Validation = pattern.matches("(?=.*[a-z])(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%!]).{8,}", Password);
        //Validation Is Boolean Type True Or False
        if (Validation) {//If Validation Is True Print The Valid Password
            System.out.println("PasswordUC is Valid");
        } else {//If Validation Is False Print The Password Is Invalid
            System.out.println("Invalid... Enter valid Password");
        }
        return Validation;//Return Validation
    }
    //UC7
    //Declaring Method TO Validate Password Has One Numeric Number
    public boolean ValidatePasswordOneNumericNumber(String Password) {
        //Password Matching With The Pattern And Stored In Validation
        boolean Validation = pattern.matches("(?=.*[a-z])(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%!]).{8,}", Password);
        //Validation Is Boolean Type True Or False
        if (Validation) {//If Validation Is True Print The Valid Password
            System.out.println("PasswordNnumber is Valid");
        } else {//If Validation Is False Print The Password Is Invalid
            System.out.println("Invalid... Enter valid Password");
        }
        return Validation;//Return Validation
    }
    //UC8
    //Declaring Method TO Validate Password Has One Special Character
    public boolean ValidatePasswordOneSpecialCharacter(String Password) {
        //Password Matching With The Pattern And Stored In Validation
        boolean Validation = pattern.matches("(?=.*[a-z])(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%!]).{8,}", Password);
        //Validation Is Boolean Type True Or False
        if (Validation) {//If Validation Is True Print The Valid Password
            System.out.println("PasswordSC is Valid");
        } else {//If Validation Is False Print The Password Is Invalid
            System.out.println("Invalid... Enter valid Password");
        }
        return Validation;//Return Validation
    }
}



