public class BankAccount2
{ 
  private String accountName;   
  private String accountHolder;  
  private double balance;     
  
  public BankAccount2(String name, String holder, double amount)
  {
    accountName = name; 
    accountHolder = holder; 
    balance = amount; 
  }

  public BankAccount2(String name, String holder)
  {
    accountName = name; 
    accountHolder = holder; 
    balance = 0;
  }
  
  public BankAccount2(String holder)
  {
    accountName = "Savings"; 
    accountHolder = holder; 
    balance = 10; 
  }

  public void nameChange(String name)
  {
    accountName = name;
  }

  public double getBalance() 
  {
    return balance; 
  }
  public void changeHolder(String holder)
  {
    accountHolder = holder;
  }
  public String getHolder()
  {
    return accountHolder; 
  }
  public String getAccountName()
  {
    return accountName; 
  }
  public void deposit(double money)
  {
    balance += money; 
  }
  public boolean withdrawal(double money)
  { 
    if(money <= balance)
    {
      balance -= money; 
      return true; 
    }
    else 
    {
      return false; 
    } 
  }
  public void transfer(BankAccount2 account, double amount)
  {
    account.balance += amount; 
  }
  public void closeAccount()
  {
    accountName = "closed"; 
    accountHolder = "closed"; 
    balance = 0; 
  }
  public void changeName(String name)
  {
    accountName = name; 
  }
}