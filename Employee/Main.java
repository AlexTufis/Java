public class Main {
    public static void main(String[] args){

        Employee e1 = new Employee(2,"Tufis","Alexandru",2500); //i call the builder

        System.out.println("The name of the employee is " + e1.getName() + " and has it annual salary " + e1.getAnnualSalary() + "." );
    }
}

