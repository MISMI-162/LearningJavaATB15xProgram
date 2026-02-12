package CodingExam_10Feb2026_OOPsConcept;
class Vehicle {
    public void start() {
        System.out.println("Parent vehicle starting");
    }
}
class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car starts.");
    }
}
class Bike extends Vehicle {
    @Override
    public void start() {
        System.out.println("Bike starts.");
    }
}
public class Challenge6_VehicleInheritanceHierarchy {
    public static void main(String[] main) {
        Vehicle car=new Car();
        car.start();
        Vehicle bike=new Bike();
        bike.start();
    }
}
