public class DynamicArray {
    private Object[] elements;
    private int size;

    public DynamicArray() {
        elements = new Object[10];
        size = 0;
    }

    public void add(Object element) {
        if (size == elements.length)
            resize();
        elements[size] = element;
        ++size;
    }

    public void resize() {
        Object[] newElement = new Object[elements.length * 2];
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

    public Object getByIndex(int index) {
        if (index < 0 || index > size)
            return null;
        return elements[index];
    }

    public void clear() {
        elements = new Object[10];
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
