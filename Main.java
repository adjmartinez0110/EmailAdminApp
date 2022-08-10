

/*
Once completed, the program should do a few things:

        • It should generate a new email based on the employee’s first name, last name, and department.
        • Generate a random string for their password.
        • Have set methods to change the password.
        • Have get methods to display name, email, and mailbox capacity.
*/

public class Main {

    public static void main(String[] args) throws Exception {
        EmailAdminApp emailAdminApp = new EmailAdminApp("John", "Deer", "Accounting");
        Password password = new Password();

        EmailAdminApp details = new EmailAdminApp("John", "Deer", "JDeer.Accounting@company.com",500);

        emailAdminApp.Email();
        password.generatePassword();
        details.getDetails();

        password.passChange("JDeer.Accounting@company.com", "");


    }
}
