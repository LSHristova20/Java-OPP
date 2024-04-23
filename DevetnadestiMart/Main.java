package DevetnadestiMart;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyCustomList<String> names = new MyCustomList<>();
        names.add("Ivan");
        names.add("Georgi");
        names.add("Stoyan");

//        for (String name : names) {
//            System.out.println(name);
//        }

//        Iterator myIterator = names.iterator();
//        while (myIterator.hasNext()){
//            System.out.println(myIterator.next());
//        }

        names.forEach(e -> System.out.println(e));
    }
}
