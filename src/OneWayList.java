/**
 * Created by nadezhda on 15/09/17.
 */
public class OneWayList<T> implements CustomList<T> {

    private Element head;
    private Element tail;
    private int size;

    private class Element{
        Element next;
        Element prev;
        T value;
        Element(T value){
            this.value = value;
        }
    }

    @Override
    public void add(T value) {
        Element el = new Element(value);
        if(head == null){
            head = el;
            tail = el;
        } else {
//            Element current = head;
//            while(current.next != null){
//                current = current.next;
//            }
//            current.next = el;
            tail.next = el;
            el.prev = tail;
            tail = el;
        }
        size++;
    }

    @Override
    public void delete(int index) {
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("Index must be positive" + "and less than size");
        }

        int currentIndex = 0;
        Element current = head;
        Element prev = null;

        if(index == 0){
            head = head.next;
        } else {

            while (currentIndex != index) {
                prev = current;
                current = current.next;
                currentIndex++;
            }
        }

        prev.next = current.next;
        size--;
    }
}
