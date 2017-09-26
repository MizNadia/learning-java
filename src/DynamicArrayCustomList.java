/**
 * Created by nadezhda on 15/09/17.
 */
public class DynamicArrayCustomList<T> implements CustomList<T> {

    private Object[] array;
    private int size;

    public DynamicArrayCustomList() {
        this(5);

    }

    public DynamicArrayCustomList(int initialLength) {
        this.array = new Object[initialLength];
        this.size = 0;
    }

    @Override
    public void add(T value) {
        if(size == array.length){
            System.out.println("increase length. current size = " + size + ", new size = " + array.length * 1.5);
            Object[] oldArray = array;
            array = new Object[(int) (array.length * 1.5)];
            System.arraycopy(oldArray, 0, array, 0, size);

        }
        array[size++] = value;
    }

    @Override
    public void delete(int index) {

    }
}
