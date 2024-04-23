package Classwork.TwentyFirstNovember;

import Classwork.FourteenthNovember.Human;

public class Student extends Human {
    public Student(String name, int age) {
        super(name, age);
    }

    public void test(){
        super.name = "Petio";
    }
}
