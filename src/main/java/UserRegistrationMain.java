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
    }
}


