import java.util.ArrayList;

public class MobilePhone {
  private String number;
  private String model;
  private String owner;
  private ArrayList<Contact> contacts;

  public MobilePhone(String number, String model, String owner) {
    this.number = number;
    this.model = model;
    this.owner = owner;
    this.contacts = new ArrayList<>();
  }

  public String getNumber() {
    return number;
  }

  public String getModel() {
    return model;
  }

  public String getOwner() {
    return owner;
  }

  public ArrayList<Contact> getContacts() {
    return contacts;
  }

  public void addNewContact(Contact contact) {
    if (findContact(contact.getName()) < 0) {
      contacts.add(contact);
      System.out.println(contact.getName() + " with number " + contact.getPhoneNumber() + " has been added to your contacts.");
    } else {
      System.out.println(contact.getName() + " already exists in your contacts.");
    }
  }

  public Contact searchContact(String name) {
    int position = findContact(name);
    if (position >= 0) {
      System.out.println("Contact found for " + name);
      return contacts.get(position);
    } else {
      System.out.println("No contact found for " + name);
      return null;
    }
  }

  public void updateContact(Contact oldContact, Contact newContact) {
    int position = findContact(oldContact);
    if (position < 0) {
      System.out.println("Provided contact not found");
    } else {
      contacts.set(position, newContact);
      System.out.println("Contact with name " + oldContact.getName() + " successfully updated to " + newContact.getName());
    }
  }

  public void removeContact(Contact contact) {
    int position = findContact(contact);
    if (position < 0) {
      System.out.println("Provided contact not found");
    } else {
      String name = contacts.get(position).getName();
      contacts.remove(position);
      System.out.println("Removed contact with name " + name);
    }
  }

  public void printContactList() {
    for (Contact contact : contacts) {
      System.out.println(contact.getName() + " -> " + contact.getPhoneNumber());
      System.out.println("============================");
    }
  }

  private int findContact(Contact contact) {
    return contacts.indexOf(contact);
  }

  private int findContact(String name) {
    for (int i = 0; i < contacts.size(); i++) {
      if (contacts.get(i).getName().equals(name)) {
        return i;
      }
    }
    return -1;
  }
}
