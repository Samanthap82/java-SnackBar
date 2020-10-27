package snackbar;

public class Customer {
  private static int maxId = 0;
  private int id;
  private String name;
  private double cashOnHand;

  public Customer(String name, double cashOnHand)
  {
    maxId++;
    id = maxId;
    this.name = name;
    this.cashOnHand = cashOnHand;
  }

  public int getId()
  {
    return id;
  }
  public void setName(String name)
  {
    this.name = name;
  }
  public String getName()
  {
    return name;
  }
  public double addToCashOnHand(double cash)
  {
    return cashOnHand += cash;
  }
  public double getCashOnHand()
  {
    return cashOnHand;
  }
  public double buySnack(double cost)
  {
    return cashOnHand -= cost;
  }
}
