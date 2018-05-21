package Chapter21;

import java.util.ArrayList;

public class GenericStack<E> {
    private ArrayList<E> list = new ArrayList<>();

    public int getSize() {
        return list.size();
    }

    public E peek() {
        return list.get(getSize() - 1);
    }

    public void pop(){
        E o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
    }

    public void push(E o) {
        list.add(o);
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }
}
