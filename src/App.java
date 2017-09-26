import com.sun.corba.se.impl.orbutil.ObjectWriter;

import java.util.Date;

/**
 * Created by nadezhda on 08/09/17.
 */
public class App {

    public static void main(String[] args) throws EmptyQueueException{

        Queue queue = new Queue(10);
        Queue queue1 = new Queue(-10);

        try {
            queue1.dequeue();
        } catch (EmptyQueueException exc) {
            System.out.println(exc.getMessage());
        }

        queue.dequeue();
        method(queue1);

//        CustomList<Integer> list = new OneWayList<>();
//        int count = 0;
//
//        list.add(count++);
//        list.add(count++);
//        list.add(count++);
//        list.add(count++);
//        list.add(count++);
//        list.add(count++);
//        list.add(count++);
//        list.add(count++);
//        list.add(count++);
//        list.add(count++);
//        list.add(count++);
//        list.add(count++);
//        list.add(count++);
//
//
//        list.delete(5);
//        System.out.println("");


//        User user = new User(1, "Nadia", "D", "adfsjhf", new Date());
//        User user1 = new User(1, "Nadia", "D", "adfsjhf", new Date());

//        System.out.println(user);
//        System.out.println(user1.toString());

//        Message message1 = new Message(1, "Text", "Author");
//        Message message2 = new Message(1, "Text", "Author");
//        Message message3 = new Message(2, "Text", "Author");
//        System.out.println(message1.equals(message2));

//        System.out.println(message1 == message3);
//
//        News news = new News("Nadia", new Date(), "My VLOG");
//        Publisher publisher = new Publisher("Nadia", new Date());
//
//        publisher.print();
//        news.print();
//
//        Publisher publisher1 = news;
//        publisher1.print();
//
//
//        publish(publisher1);
//        publish(publisher);
//        publish(new Article());

//        System.out.println(news.author + " " + news.getSource());
//
//        Publisher publisher = news;
//        Object object = news;
//
//        News news1 = (News)object;
//        System.out.println(news1.author);
//
//        News NEWS2 = (News)publisher;
    }

//    private static void publish(Publisher publisher){
//        System.out.println("Publish...");
//        publisher.print();
//    }

    static class Task implements Runnable{
        @Override
        public void run(){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    private static void method(Queue queue){
        queue.uncheckedDequeue();
    }
}
