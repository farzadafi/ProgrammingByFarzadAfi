import java.lang.reflect.Array;

public class DynamicArray<T> {
    private T[] elements;
    private int size;
    private final Class<T> clazz;

    @SuppressWarnings("unchecked")
    public DynamicArray(Class<T> clazz) {
        elements = (T[]) Array.newInstance(clazz, 10);
        size = 0;
        this.clazz = clazz;
    }

    public boolean add(T element) {
        if (size == elements.length)
            resize();
        elements[size] = element;
        ++size;
        return true;
    }

    @SuppressWarnings("unchecked")
    public void resize() {
        T[] newElement = (T[]) Array.newInstance(clazz, elements.length * 2);
        for (int i = 0; i < elements.length; i++) {
            newElement[i] = elements[i];
        }
        elements = newElement;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T getByIndex(int index) {
        if (index < 0 || index > size)
            return null;
        return elements[index];
    }

    @SuppressWarnings("unchecked")
    public void clear() {
        elements = (T[]) Array.newInstance(clazz, 10);
        size = 0;
    }

    public boolean contain(Object element) {
        if (element == null)
            return false;
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element))
                return true;
        }
        return false;
    }
}
