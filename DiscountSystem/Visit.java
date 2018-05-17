import java.util.Date;

public class Visit extends Customer {
    Customer customer;
    Date date;
    double serviceExpense;
    double productExpense;

    Visit(String name,Date date){
        super(name);
        date = new Date();
    }

    public String getName(){
        return this.name;
    }

    public double getServiceExpense(){
        return this.serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense(){
        return this.productExpense;
    }

    public void setProductExpense(double productExpense){
         this.productExpense = productExpense;
    }

    public double getTotalExpense(){
        return productExpense+serviceExpense;
    }

    @Override
    public String toString() {
        return "total expense= " + getTotalExpense() + ",service expense= " + getServiceExpense() + ",produc expense= " + getProductExpense() + ",date= " + date;
    }
}
