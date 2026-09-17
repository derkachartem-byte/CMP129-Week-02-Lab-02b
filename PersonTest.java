public class PersonTest {
    public static void main(String[] args){
        Person fp = new Person("Sarah Hilton", 12, "Iloveponies@yahoo.com");
        Person sp = new Person("Hopper Scotch", 8, "Iamtooyounforthis@gmail.com");
        System.out.println(fp.displayInfo());
        System.out.println("");
        System.out.println(sp.displayInfo());
    }
}