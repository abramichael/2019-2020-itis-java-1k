import java.util.Collection;
import java.util.Iterator;

// deadline - Feb, 14, 2020, 12:00
public class IntegerArrayCollection implements Collection<Integer> {

    private int [] array;
    private int size;
    private int capacity;

    public IntegerArrayCollection() {
        capacity = 1000;
        array = new int[capacity];
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {

        return (size == 0);

    }
    // +
    @Override
    public boolean contains(Object o) {
        return false;
    }
    // -
    @Override
    public Iterator<Integer> iterator() {
        return null;
    }
    // +
    @Override
    public Object[] toArray() {
        return new Object[0];
    }
    // -
    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Integer x) {
        array[size] = x;
        size++;
        return true; // capacity?????
    }
    // +
    @Override
    public boolean remove(Object o) {
        return false;
    }
    // + (contains)
    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    // + (add)
    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        return false;
    }

    // + (remove)
    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    // +
    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    // +
    @Override
    public void clear() {

    }
}
