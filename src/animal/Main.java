package animal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Beagle", 5);
        dog.eat();
        System.out.println(dog);

        Animal animal = new Animal(10);
        List<Animal> animals = new ArrayList<>();
        animals.add(animal);
        animals.add(dog);

        MyCustomList myCustomList = new MyCustomList();
        myCustomList.add("asddsa");



        for(Animal animal1: animals){
            System.out.println(animal1);
        }
    }
}
