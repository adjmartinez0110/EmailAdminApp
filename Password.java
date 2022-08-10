import java.util.Random;
import java.util.Scanner;

//Will generate randomized password here

public class Password  {





//default constructor
    public Password() {
    }





    //method to create password
    public static String generatePassword() {

        String alphabetsInUpperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphabetsInLowerCase = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!?&%$";

        String allCharacters = alphabetsInLowerCase + alphabetsInUpperCase + numbers + symbols;

        // initialize a string to hold result
        StringBuffer password = new StringBuffer(10);

        //will add a loop to generate the random password (loop 10 times to get full password length)
        Random random = new Random();
        for(int i = 0; i < 10; i++) {

            // generate a random number between 0 and length of all characters
            int randomIndex = random.nextInt(allCharacters.length());
            // retrieve character at index and add it to result
            password.append(allCharacters.charAt(randomIndex));
        }
        String genPass = password.toString();

        System.out.println("Your new password is : " + genPass + ". " + "Please keep " +
                "this safe at all times. Neither Help Desk Support nor Admins will ever ask " +
                "for your password.");

        return genPass;
        }

        public static String passChange(String email, String genPass) throws IllegalArgumentException {

            //Creating a scanner object to accept user input
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your corporate email: ");
            String input1 = scanner.next();
            try {
                if (input1.equals(email) == false) {
                    throw new IllegalArgumentException();
                }
            }
            catch (Exception e) {
                System.out.println("No such email exists within the system.");
            }

           System.out.println("Please enter current password: ");
           String input2 = scanner.next();
           try {
               //will compare both strings and if false, throw exception
               if (input2.equals(genPass) == false) {
               }
           }
           catch (IllegalArgumentException e) {
               System.out.println("Username and/or password is incorrect.");
            }

           System.out.println("Enter your new password.");
           System.out.println("Password must be 10 characters long and contain" +
           "alphanumeric characters (A - Z, a - z, 0 - 9) and at least one symbol.");
           System.out.println("No repeating characters allowed.");

           String newPass = scanner.next();

            return newPass;
        }









}
