public class Main {
    public static void main(String[] args){

        Author authors = new Author("Tufis Alexandru","alex_4u49@yahoo.com",'m');


        Book book = new Book("Simple Java",authors,19.99,99);
        System.out.println(book);

    }
}
