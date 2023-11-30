import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<T> {

    private int capacity = 10;
    private Object[] array = new Object[capacity];
    private int size = 0;

    public MyArrayList() {}

    public MyArrayList(int capacity) {
        this.capacity = capacity;
    }

    public void add(T car) {
        ensureCapacity();
        array[size] = car;
        size++;
    }

    public void add(int index, T car) {
        checkIndex(index);
        ensureCapacity();
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = car;
        size++;
    }

    public void addAll(Object[] car) {
        for (int i = 0; i < car.length; i++) {
            ensureCapacity();
            array[size] = car[i];
            size++;
        }
    }


    public void addAll(int index, Object[] car) {
        checkIndex(index);
        for (int i = 0; i < car.length; i++) {
            ensureCapacity();
            for (int j = size; j > index; j--) {
                array[j] = array[j - 1];
            }
            array[index] = car[i];
            size++;
            index++;
        }
    }


    public T get(int index) {
        checkIndex(index);
        return (T) array[index];
    }


    public boolean remove(int index) {
        checkIndex(index);
        if (size * 2 < capacity) {
            capacity = capacity / 2;
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return true;
    }


    public int size() {
        return size;
    }

    public boolean contains(Object car) {
        for (Object carFor : array) {
            if ((car.hashCode() == carFor.hashCode()) && (car.equals(carFor))) {
                return true;
            }
        }
        return false;
    }

    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public T next() {
                return (T) array[index++];
            }
        };
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }

    public boolean remove(T car) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(car)) {
                return remove(i);
            }
        }
        return false;
    }

    public void clear() {
        capacity = 10;
        array = new Car[capacity];
        size = 0;
    }

    public void ensureCapacity() {
        if (size >= capacity) {
            capacity = (array.length * 2) + 1;
            array = Arrays.copyOf(array, capacity);
        }
    }

    public int getCapacity() {
        return capacity;
    }
}