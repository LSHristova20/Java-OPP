package Classwork.Dwanadesetimart;


import Classwork.animal.Dog;

import java.util.Comparator;

public class DogComparatorByAge implements Comparator<Dog> {

    @Override
    public int compare(Dog first, Dog second) {
        if (first.getName().compareTo(second.getName()) > 0) {
            return 1;
        } else if (first.getName().compareTo(second.getName()) < 0) {
            return -1;
        } else {
            if (first.getAge() > second.getAge()) {
                return 1;
            } else if (first.getAge() < second.getAge()) {

            } else {
                return -1;
            }
        }
        return 0;
    }
}
