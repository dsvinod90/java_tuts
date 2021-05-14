import java.util.ArrayList;

public class Customer {
  private String name;
  private String phoneNumber;
  private double initialTransactionAmount;
  private ArrayList<Double> transactions;

  public Customer(String name, String phoneNumber, Double initialTransactionAmount) {
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.initialTransactionAmount = initialTransactionAmount;
    this.transactions = new ArrayList<>();
    transactions.add(initialTransactionAmount);
  }

  public String getName() {
    return name;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public double getInitialTransactionAmount() {
    return initialTransactionAmount;
  }

  public ArrayList<Double> getTransactions() {
    return transactions;
  }

  public double accountBalance() {
    double sum = 0.0;
    for (Double transaction : transactions) {
      sum += transaction;
    }
    return (Double.parseDouble(String.format("%.2f", sum)));
  }

  public static Customer createCustomer(String name, String phoneNumber, double initialTransactionAmount) {
    return new Customer(name, phoneNumber, initialTransactionAmount);
  }
}
