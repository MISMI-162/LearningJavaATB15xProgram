package CodingExam_10Feb2026_OOPsConcept;
class Animal {
    public void makeSound() {
        System.out.println("Animals make sound.");
    }
}
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dogs bark.");
    }
}
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cats meow.");
    }
}
public class Challenge5_AnimalSoundPolymorphism {
    public static void main(String[] main) {
        Dog d=new Dog();
        d.makeSound();
        Cat c=new Cat();
        c.makeSound();
    }
}
