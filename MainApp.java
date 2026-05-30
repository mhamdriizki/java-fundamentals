import oop.Encapsulation;
import oop.HewanAsInheritance;
import oop.HewanAsPolymorphism;
import oop.PersegiAsAbstraction;

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
        HewanAsPolymorphism hewanPolymorphism = new HewanAsPolymorphism("Anjing");
        hewan.makan();
        hewanPolymorphism.makan();

        PersegiAsAbstraction persegi = new PersegiAsAbstraction(4);
        System.out.println("Luas persegi: " + persegi.hitungLuas());

        // Kita gabisa akses namaBentuk karena itu adalah atribut dari class Abstraction, bukan PersegiAsAbstraction
        // System.out.println("Keliling persegi: " + persegi.tampilkanNamaBentuk());

        // Tapi kita bisa akses method tampilkanNamaBentuk() karena itu adalah method dari class Abstraction, dan PersegiAsAbstraction mewarisi class Abstraction
        persegi.tampilkanNamaBentuk();
    }
}
