public class Customer {
    private int discount;
    private int ID;
    private String name;
    private char gender;

    Customer(){}
    Customer(int ID,String name,int discount){
        this.ID = ID;
        this.name = name;
        this.discount = discount;
    }

    public int getID(){
        return this.ID;
    }

    public String getName(){
        return this.name;
    }

    public char getGender(){
        return this.gender;
    }

    @Override
    public String toString() {
        return getName() + "(" + getID() + ")";
    }
}
