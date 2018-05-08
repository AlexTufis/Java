public class Main {
    public static void main(String[] args){
        InvoiceItem i = new InvoiceItem("trei","asd",5,5);

        System.out.println("id= " + i.getID() + " desc= " + i.getDesc() + " qty= " + i.getQty() + " unitPrice= " + i.getUnitPrice() + "\nTotal= " + i.getTotal());
    }
}
