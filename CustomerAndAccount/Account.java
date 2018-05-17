public class Account {
    private int id;
    private Customer customer;
    private double balance = 0.0;

    Account(){}
    Account(int id,Customer customer,double balance){
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }
    Account(int id,Customer customer){
        this.id = id;
        this.customer = customer;
    }

    public int getID(){
        return this.id;
    }

    public Customer getCustomer(){
        return this.customer;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    @Override
    public String toString() {
        return customer.getName() + "(" + getID() + ") balance = " + getBalance() ;
    }

    public String getCustomerName(){
        return customer.getName();
    }

    public double deposit(double amount){
        balance += amount;
        return balance;
    }

    public double withdraw(double amount){
        if(balance >= amount)
            balance -= amount;
            return balance;

    }


}
