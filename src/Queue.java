/**
 * Created by nadezhda on 26/09/17.
 */
public class Queue {

    int size;

    public Queue(int size){
        this.size = size;
    }

    public void dequeue() throws EmptyQueueException {
        if(size < 0){
            throw new EmptyQueueException("Empty message");
        }

        System.out.println("dequeue");
    }

    public void uncheckedDequeue(){
        if(size < 0){
            throw new UncheckedEmptyQueueException();
        }
        System.out.println("uncheckeed dequeue");
    }

    public int getSize(){
        return size;
    }
}


