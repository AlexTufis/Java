public class Main {
    public static void main(String[] args){
        Customer c1 = new Customer(1,"Alex",100);
        System.out.println(c1);

        Account a1 = new Account(2,c1,200);
        System.out.println(a1.deposit(50));
        System.out.println(a1);

    }
}
