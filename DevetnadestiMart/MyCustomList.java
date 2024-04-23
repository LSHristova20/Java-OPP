package DevetnadestiMart;

import java.util.ArrayList;
import java.util.Iterator;

public class MyCustomList<T> implements Iterable<T> {
    private ArrayList<T> items;

    public MyCustomList() {
        items = new ArrayList<>();
    }

    public void add(T el){
        items.add(el);
    }

    @Override
    public Iterator<T> iterator() {
        return new MyCustomListIterator();
    }

    public class MyCustomListIterator implements Iterator<T>{
        private int index = 0;
        @Override
        public boolean hasNext() {
            return items.size() > index;
        }

        @Override
        public T next() {
            T item = items.get(index++);
            index+=2;
            return item;
        }

        public void test(){
            for (int i=0;i< items.size();i++){

            }
        }
    }
}
