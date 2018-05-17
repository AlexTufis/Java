public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Alex","alex_4u49");
        System.out.println(p1.toString());

        Student s1 = new Student("Denis","denos_denis","8-2",2,20.15);
        System.out.println(s1.toString());

        Staff sf1 = new Staff("Jhon","jhon_staff","LTMV",50.500);
        System.out.println(sf1.toString());
    }
}
