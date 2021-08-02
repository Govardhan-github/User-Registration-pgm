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
        boolean Validation = pattern.matches("^[A-Z][a-z]{2,}$",FirstName);
        //Validation Is Boolean Type True Or False
        if (Validation) {//If Validation Is True Print The Valid Name
            System.out.println("First Name is Valid");
        } else {//If Validation Is False Print The Name Is Invalid
            System.out.println("Invalid... Enter valid name");
        }
        return Validation;//Return Validation
    }
    //Declaring Method TO Validate LastName
    public boolean ValidateLastName(String LastName) {
        //Last Name Matching With The Pattern And Stored In Validation
        boolean Validation = pattern.matches("^[A-Z][a-z]{2,}$",LastName);
        //Validation Is Boolean Type True Or False
        if (Validation) {//If Validation Is True Print The Valid Name
            System.out.println("Last Name is Valid");
        } else {//If Validation Is False Print The Name Is Invalid
            System.out.println("Invalid... Enter valid name");
        }
        return Validation;//Return Validation
    }
    //Declaring Method TO Validate Email
    public boolean ValidateEmail(String Email) {
        //email Matching With The Pattern And Stored In Validation
        boolean Validation = pattern.matches("^[a-z][a-zA-Z0-9]+([._+#-][a-zA-Z0-9]+)*@[a-zA-Z0-93]+.[a-zA-Z]{2,3}(.[a-zA-Z]{2,3})?$",Email);
        //Validation Is Boolean Type True Or False
        if (Validation) {//If Validation Is True Print The Valid Name
            System.out.println("Email is Valid");
        } else {//If Validation Is False Print The Name Is Invalid
            System.out.println("Invalid... Enter valid Email");
        }
        return Validation;//Return Validation
    }




}

