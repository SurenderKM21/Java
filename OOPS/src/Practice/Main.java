package Practice;

class Animal{}
class Monkey extends Animal{}
class Elephant extends Animal{}

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        Animal an = new Animal();
        Monkey monkey = new Monkey();
        Elephant elephant = new Elephant();

        Animal an2 = new Elephant();

        main.m1(an);
        main.m1(monkey);
        main.m1(an2);
        main.m1(elephant);
    }
    public void m1(Animal a){
        System.out.println("animal");
    }
    public void m1(Monkey m) {
        System.out.println("Monkey");
    }
    public void m1(Elephant e) {
        System.out.println("Elephant");
    }
}
