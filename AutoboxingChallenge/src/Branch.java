import java.util.ArrayList;

public class Branch {
  private String name;
  private ArrayList<Customer> customers;

  public Branch(String name) {
    this.name = name;
    this.customers = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public ArrayList<Customer> getCustomers() {
    return customers;
  }

  public void addNewCustomer(Customer customer) {
    int position = findCustomer(customer.getName(), customer.getPhoneNumber());
    if (position < 0) {
      customers.add(customer);
      System.out.println( customer.getName() +
          " with phone number " +
          customer.getPhoneNumber() +
          " has been successfully added as a customer to the bank branch " +
          name);
    } else {
      System.out.println(customer.getName() +
          " with phone number " +
          customer.getPhoneNumber() +
          " already exists for the bank branch " +
          name);
    }
  }

  public void addAdditionalTransactions(Customer customer, double transaction) {
    if (customerPresent(customer)) {
      customer.getTransactions().add(transaction);
      System.out.println("Additional transaction of " + transaction + " added to customer " + customer.getName());
    } else {
      System.out.println("Customer not found");
    }
  }

  public static Branch createBranch(String name) {
    System.out.println("Successfully created branch " + name);
    return new Branch(name);
  }

  public Customer searchCustomer(String name, String phoneNumber) {
    int position = findCustomer(name, phoneNumber);
    if (position >= 0) {
      return customers.get(position);
    }
    return null;
  }

  private boolean customerPresent(Customer customer) {
    return customers.contains(customer);
  }

  private int findCustomer(String name, String phoneNumber) {
    for (int i = 0; i < customers.size(); i++) {
      if (customers.get(i).getName().equals(name) && customers.get(i).getPhoneNumber().equals(phoneNumber)) {
        return i;
      }
    }
    return -1;
  }
}
