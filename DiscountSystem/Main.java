import java.util.Date;

public class Main {
    public static void main(String[] args){
        Customer c1 = new Customer("Alex");
        System.out.println(c1.toString());

        Visit v1 = new Visit("Alex",new Date(2,3,4));
        System.out.println(v1.toString());

        DiscountRate dr1 = new DiscountRate();
        System.out.println(dr1.getServiceDiscountRate("Gold"));
        System.out.println(dr1.getProducDiscountRate("Premium"));
    }
}
