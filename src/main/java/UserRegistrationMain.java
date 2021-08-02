public class UserRegistrationMain {
    /*
    Declaring Main Method
     */
    public static void main(String[] args) {
        //Creating Variable With Using Of UserRegistration Class
         UserRegistration userRegistration = new UserRegistration();
        //Here Calling Validate FirstName Method Storing The Result In Result
        boolean fName = userRegistration.ValidateFirstName("Gopi");
        System.out.println(fName);//Printing Result
        //Here Calling Validate LasttName Method Storing The Result In Result
        boolean lName = userRegistration.ValidateLastName("Reddy");
        System.out.println(lName);//Printing Result
        //Here Calling Validate Email Method Storing The Result In Result
        boolean email = userRegistration.ValidateEmail("gopi1998@gmail.com");
        System.out.println(email);//Printing Result
        //Here Calling Validate PhoneNumber Method Storing The Result In Result
        boolean pNbr = userRegistration.ValidatePhoneNumber("91 9666110767");
        System.out.println(pNbr);//Printing Result
        //Here Calling Validate Password Method Storing The Result In Result
        boolean Password = userRegistration.ValidatePassword("Gopi@145");
        System.out.println(Password);//Printing Result
        //Here Calling Validate Password Contain Upper Case Method Storing The Result In Result
        boolean PasswordUC = userRegistration.ValidatePasswordUpperCase("Gopi@145");
        System.out.println(PasswordUC);//Printing Result
        //Here Calling Validate Password Contain One Numeric Number Method Storing The Result In Result
        boolean PasswordNN = userRegistration.ValidatePasswordOneNumericNumber("Gopi@145");
        System.out.println(PasswordNN);//Printing Result
        //Here Calling Validate Password Contain One Special Character Method Storing The Result In Result
        boolean PasswordSC = userRegistration.ValidatePasswordOneSpecialCharacter("Gopi@145");
        System.out.println(PasswordSC);//Printing Result
    }
}


