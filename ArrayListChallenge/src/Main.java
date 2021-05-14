import java.util.Scanner;

public class Main {
  public static Scanner scanner = new Scanner(System.in);
  public static MobilePhone mobilePhone = new MobilePhone("9876543210", "iPhone", "Varun");
  public static void main(String[] args) {
    boolean quit = false;
    printActions();
    while(!quit) {
      System.out.print("Enter a choice: ");
      int choice = scanner.nextInt();
      scanner.nextLine();
      switch(choice) {
        case 0:
          mobilePhone.printContactList();
          break;
        case 1:
          addNewContact();
          break;
        case 2:
          updateContact();
          break;
        case 3:
          removeContact();
          break;
        case 4:
          searchContact();
          break;
        case 5:
          printActions();
          break;
        case 6:
          quit = true;
          System.out.println("Quitting");
          break;
      }
    }
    scanner.close();
  }
  public static void addNewContact() {
    System.out.println("You have chosen to add a contact: ");
    System.out.println("*************************************************");
    System.out.print("Enter the name of the new contact: ");
    String name = scanner.nextLine();
    System.out.print("Enter the phone number of the new contact: ");
    String phoneNumber = scanner.nextLine();
    Contact newContact = Contact.createContact(name, phoneNumber);
    mobilePhone.addNewContact(newContact);
    System.out.println();
  }
  public static void updateContact() {
    System.out.println("You have chosen to update a contact: ");
    System.out.println("*************************************************");
    System.out.print("Enter the name of the contact to be updated: ");
    String currentName = scanner.nextLine();
    Contact currentContact = mobilePhone.searchContact(currentName);
    if(currentContact != null) {
      System.out.print("Enter the name of the replacing contact: ");
      String updatedName = scanner.nextLine();
      System.out.print("Enter the phone number of the replacing contact: ");
      String updatedPhoneNumber = scanner.nextLine();
      Contact updatedContact = Contact.createContact(updatedName, updatedPhoneNumber);
      mobilePhone.updateContact(currentContact, updatedContact);
    }
  }
  public static void removeContact() {
    System.out.println("You have chosen to remove a contact: ");
    System.out.println("*************************************************");
    System.out.print("Enter the name of the contact to be removed: ");
    String name = scanner.nextLine();
    Contact contactToBeRemoved = mobilePhone.searchContact(name);
    if(contactToBeRemoved != null) {
      mobilePhone.removeContact(contactToBeRemoved);
    }
  }
  public static void searchContact() {
    System.out.println("You have chosen to search for a contact: ");
    System.out.println("*************************************************");
    System.out.println("Enter the name of the contact to be searched: ");
    String name = scanner.nextLine();
    Contact contactFound = mobilePhone.searchContact(name);
    if(contactFound != null) {
      System.out.println("Phone number of " + name + " is " + contactFound.getPhoneNumber());
    }
  }
  public static void printActions() {
    System.out.println("Available actions: ");
    System.out.println("0 - Print contact list\n" +
        "1 - Add new contact\n" +
        "2 - Update existing contact\n" +
        "3 - Remove existing contact\n" +
        "4 - Search existing contact\n" +
        "5 - Print actions\n" +
        "6 - Quit");
    System.out.println();
  }
}
