import oop.Encapsulation;
import oop.HewanAsInheritance;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        // Constructor default value
        Encapsulation encapsulation = new Encapsulation("John Doe", 30);

        // Update data
        encapsulation.setName("John Does");
        encapsulation.setAge(31);

        System.out.println("Name: " + encapsulation.getName());
        System.out.println("Age: " + encapsulation.getAge());

        HewanAsInheritance hewan = new HewanAsInheritance("Kucing");
        hewan.makan();
    }
}
