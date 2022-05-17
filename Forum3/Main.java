import java.util.Scanner;

public class Main {
    static bank BCA = new bank("BCA");
    static Scanner input = new Scanner(System.in);

    public static void Clear(){
        System.out.print("Continue? (Press Y)");
        String yes = input.next();
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static boolean password (int x){
        System.out.printf("Enter the password of %s %s: ", BCA.getCustomInteger(x).getFirstName(), BCA.getCustomInteger(x).getLastName());
        int password = input.nextInt();
        return password == BCA.getCustomInteger(x).getPassword();
    }

    public static void main(String[] args) {
	 while (true){
         System.out.println("Bank BCA");
         System.out.printf("Current no. of accounts; (%d) \n", BCA.getNumCustomers());
         System.out.println("What would you like to do?");
         System.out.println("1. Create new account");
         System.out.println("2. Search account");
         System.out.println("3. Display all accounts");
         System.out.println("4. Deposit");
         System.out.println("5. Withdraw");
         System.out.println("6. Exit");

         int choice = input.nextInt();
         if (choice == 1){
             Account acc = new Account (0);
             System.out.print("Enter First Name: ");
             String firstName = input.next();
             System.out.print("Enter Last Name: ");
             String lastName = input.next();
             System.out.print("Enter the password (number): ");
             int password = input.nextInt();
             BCA.addCustomer(firstName, lastName, password);
             BCA.getCustomerName(last).setAccount(acc);
             Clear();
         }

         else if (choice == 2){
             System.out.println("Person's last name: ");
             String name = input.next();
             BCA.getCustomerName(name){
                System.out.printf("\n First Name: %s", BCA.getCustomerName(name).getFirstName());
                System.out.printf("\n Last Name: %s", BCA.getCustomerName(name).getLastName());
                System.out.printf("Balance: %f \n",BCA.getCustomerName(name).getAccount().getBalance());
             }
         }

         else if (choice == 3){
             Clear();
             for(int i = 0; i <BCA.getNumCustomers(); i++){
                 System.out.printf("No. %d", i+1);
                 System.out.printf("First Name: %s", BCA.getCustomerInteger(i).getFirstName());
                 System.out.printf("First Name: %s", BCA.getCustomerInteger(i).getLastName());
                 System.out.printf("Balance: %f \n", BCA.getCustomerInteger(i), getAccount().getBalance());
             }
         }

         else if (choice == 4){
             Clear();
             System.out.println("Enter the account you wish to deposit to: ");
             for (int i = 0; i < BCA.getNumCustomers(); i++){
                 System.out.printf("%d. %s %s %n", BCA.getCustomerInteger(i),getFirstName(), BCA.getCustomerInteger(i).getLastName());
             }
             System.out.println("Please enter the index of your account: ");
             choice = input.nextInt();
             if (password(choich -1)) {
                 System.out.println("How much do you want to deposit: ");
                 int amount = input.nextInt();
                 BCA.getCustomerInteger(choice - 1).getAccount().deposit(amount);
                 System.out.printf("Your balance: %f", BCA.getCustomerInteger(choice - 1).getAccount().getBalance());
             }
             else {
                 System.out.println("Incorrect password");
             }
         }
         else if (choice == 5){
             Clear();
             System.out.println("Select your account: ");
             for (int i = 0; i < BCA.getNumCustomers(); i++){
                 System.out.printf("%d. %s %s %n", BCA.getCustomerInteger(i),getFirstName(), BCA.getCustomerInteger(i).getLastName());
             }
             System.out.println("Please enter the index of your account: ");
             choice = input.nextInt();
             if (password(choice -1)){
                 while(true) {
                     System.out.print("How much to withdraw?");
                     int amount = input.nextInt();
                     if (amount <= BCA.getCustomerInteger(choice - 1).getAccount().getBalance()){
                         BCA.getCustomerInteger(choice - 1).getAccount().withdraw(amount);
                         System.out.printf("Balance left: %f \n", BCA.getCustomerInteger(choice -1). getAccount().getBalance());
                         break;
                     }
                     else {
                         System.out.println("Error");
                     }
                 }
             }
         }
         else{
             Clear();
             break;
         }

     }
    }
}
