import java.util.ArrayList;

public class Bank {
  private String name;
  private ArrayList<Branch> branches;

  public Bank(String name) {
    this.name = name;
    this.branches = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public ArrayList<Branch> getBranches() {
    return branches;
  }

  public void addNewBranch(Branch branch) {
    int position = findBranch(branch.getName());
    if (position < 0) {
      branches.add(branch);
      System.out.println(branch.getName() + " has been successfully added as a branch");
    } else {
      System.out.println("Branch " + branch.getName() + " already exists");
    }
  }

  public void addCustomer(Branch branch, Customer customer) {
    if (branchExists(branch)) {
      if (branch.getCustomers().contains(customer)) {
        System.out.println("Customer already exists for the specified branch");
      } else {
        branch.addNewCustomer(customer);
      }
    } else {
      System.out.println("Branch not found");
    }
  }

  public void addAdditionalTransactions(Branch branch, Customer customer, Double transaction) {
    if (branchExists(branch)) {
      if (branch.getCustomers().contains(customer)) {
        branch.addAdditionalTransactions(customer, transaction);
      } else {
        System.out.println("Customer not found");
      }
    } else {
      System.out.println("Branch not found");
    }
  }

  public void showCustomers(Branch branch) {
    if (branchExists(branch)) {
      System.out.println("Customer list of branch -> " + branch.getName());
      for (int i = 0; i < branch.getCustomers().size(); i++) {
        System.out.println("Name: " + branch.getCustomers().get(i).getName());
        System.out.println("Transactions: ");
        for (int j = 0; j < branch.getCustomers().get(i).getTransactions().size(); j++) {
          System.out.println(branch.getCustomers().get(i).getTransactions().get(j));
        }
        System.out.println("Account Balance: " + branch.getCustomers().get(i).accountBalance());
        System.out.println("_________________________________");
      }
    } else {
      System.out.println("Branch not found");
    }
  }

  public Branch searchBranch(String name) {
    int position = findBranch(name);
    if (position >= 0) {
      return branches.get(position);
    }
    return null;
  }

  private int findBranch(String name) {
    for (int i = 0; i < branches.size(); i++) {
      if (branches.get(i).getName().equals(name)) {
        return i;
      }
    }
    return -1;
  }

  private boolean branchExists(Branch branch) {
    return branches.contains(branch);
  }
}
