class Animal {
    void makeSound() {
        System.out.println("Sanimal sound");
    }
}
class Dog extends Animal {
    void makeSound() {
        System.out.println("Woof");
    }
}
class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow");
    }
}
class Cow extends Animal {
    void makeSound() {
        System.out.println("Moo");
    }
}
public class poly{
    public static void main(String[] args) {
        Animal animal;
        animal = new Dog();
        animal.makeSound();
        animal = new Cat();
        animal.makeSound();
        animal = new Cow();
        animal.makeSound();
    }
}