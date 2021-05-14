import java.util.Scanner;

public class Main {
  public static Scanner scanner = new Scanner(System.in);
  public static Bank bank = new Bank("National Bank of Canada");
  public static void main(String[] args) {
    boolean quit = false;
    int choice;
    System.out.println("********** Welcome to " + bank.getName() + " **********");
    System.out.println();
    printList();
    while (!quit) {
      System.out.println();
      System.out.print("Enter your choice: ");
      if (scanner.hasNextInt()) {
        choice = scanner.nextInt();
      } else {
        choice = 1_000;
      }
      scanner.nextLine();
      switch (choice) {
        case 0:
          addBranch();
          break;
        case 1:
          addCustomer();
          break;
        case 2:
          addAdditionalTransaction();
          break;
        case 3:
          displayCustomers();
          break;
        case 4:
          printList();
          break;
        case 5:
          quit = true;
          System.out.println("Quitting");
          break;
        default:
          System.out.println("Invalid input, please try again");
      }
    }
    scanner.close();
  }
  public static void addBranch() {
    System.out.println("You have chosen to add a branch to " + bank.getName() + ": ");
    System.out.println("************************************************************");
    System.out.print("Enter branch name: ");
    String branchName = scanner.nextLine();
    Branch newBranch = Branch.createBranch(branchName);
    bank.addNewBranch(newBranch);
  }

  public static void addCustomer() {
    System.out.println("You have chosen to add a customer to a branch of " + bank.getName() + ": ");
    System.out.println("************************************************************");
    System.out.print("Enter customer's name: ");
    String customerName = scanner.nextLine();
    System.out.print("Enter customer's phone number: ");
    String customerPhoneNumber = scanner.nextLine();
    System.out.print("Enter amount for initial transaction: ");
    double customerInitialTransaction = scanner.nextDouble();
    scanner.nextLine();
    System.out.print("Enter the branch to which the customer needs to be added: ");
    String branchName = scanner.nextLine();
    Branch branch = bank.searchBranch(branchName);
    if (branch != null) {
      Customer newCustomer = Customer.createCustomer(customerName, customerPhoneNumber, customerInitialTransaction);
      bank.addCustomer(branch, newCustomer);
    } else {
      System.out.println("Branch does not exist");
    }
  }

  public static void addAdditionalTransaction() {
    System.out.println("You have chosen to add an additional transaction to a customer belonging to a branch of " + bank.getName() + ": ");
    System.out.println("************************************************************");
    System.out.print("Enter customer's name: ");
    String customerName = scanner.nextLine();
    System.out.print("Enter customer's phone number: ");
    String customerPhoneNumber = scanner.nextLine();
    System.out.print("Enter the value of the additional transaction: ");
    double customerAdditionalTransaction = scanner.nextDouble();
    scanner.nextLine();
    System.out.print("Enter the name of the branch of the customer: ");
    String customerBranch = scanner.nextLine();
    Branch branch = bank.searchBranch(customerBranch);
    if (branch != null) {
      Customer customer = branch.searchCustomer(customerName, customerPhoneNumber);
      if (customer != null) {
        bank.addAdditionalTransactions(branch, customer, customerAdditionalTransaction);
      } else {
        System.out.println("Customer not found");
      }
    } else {
      System.out.println("Branch not found");
    }
  }

  public static void displayCustomers() {
    System.out.println("You have chosen to display the customers and their transactions belonging to a branch of " + bank.getName() + ": ");
    System.out.println("************************************************************");
    System.out.print("Enter the name of the branch: ");
    String branchName = scanner.nextLine();
    Branch branch = bank.searchBranch(branchName);
    if (branch != null) {
      bank.showCustomers(branch);
    } else {
      System.out.println("Branch not found");
    }
  }

  public static void printList() {
    System.out.println("Here are your choices: ");
    System.out.println("0 - Add Branch\n" +
        "1 - Add Customer\n" +
        "2 - Add additional transaction\n" +
        "3 - Show customers\n" +
        "4 - Print the choices\n" +
        "5 - Quit");
  }
}
