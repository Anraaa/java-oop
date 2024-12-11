package praktikum.sesi9.animal;

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println  (name + " say woof");
    }
}

public class AnimalTester {
    public static void main(String[] args) {
        Animal animal = new Animal("Buddy");
        animal.speak();
        
        Dog dog = new Dog ("Radit");
        dog.speak();
    }
}
