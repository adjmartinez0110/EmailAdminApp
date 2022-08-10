/*
Once completed, the program should do a few things:

        • It should generate a new email based on the employee’s first name, last name, and department.
        • Generate a random string for their password.
        • Have set methods to change the password.
        • Have get methods to display name, email, and mailbox capacity.
*/

public class EmailAdminApp {

    private static String firstName;

    private static String lastName;
    private static String department;
    private static int mailboxCapacity;
    private static String email = "";


    //Constructor
    public EmailAdminApp(String firstName, String lastName, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;

    }

    //Constructor
    public EmailAdminApp(String firstName, String lastName, String email, int mailboxCapacity) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mailboxCapacity = mailboxCapacity;
    }



    //Getters and setters
    public static String getFirstName() { return firstName; }

    public static void setFirstName(String firstName) {
        EmailAdminApp.firstName = firstName;
    }

    public static String getLastName() {
        return lastName;
    }

    public static void setLastName(String lastName) {
        EmailAdminApp.lastName = lastName;
    }

    public static String getDepartment() {
        return department;
    }

    public static void setDepartment(String department) {
        EmailAdminApp.department = department;
    }

    public static int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public static void setMailboxCapacity(int mailboxCapacity) {
        EmailAdminApp.mailboxCapacity = mailboxCapacity;
    }


    //Make an email address method
    public static String Email() {

        String first = firstName.toUpperCase();
        char dot = '.';
        String comp = "@company.com";
        String email = first.charAt(0) + lastName + dot + department + comp;
        System.out.println("Your new corporate email is: " + email);
        return email;
    }

    //Returning user details
    public static void getDetails() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Mailbox Capacity: " + mailboxCapacity);
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
