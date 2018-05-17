public class Main {
    public static void main(String[] args){
        Time t1 = new Time(12,59,59);

        System.out.println(t1);
        System.out.println(t1.nextSecond());

        Time t2 = new Time(13,1,0);

        System.out.println(t2);
        System.out.println(t2.previousSecond());
    }
}
