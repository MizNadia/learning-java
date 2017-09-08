import com.sun.corba.se.impl.orbutil.ObjectWriter;

import java.util.Date;

/**
 * Created by nadezhda on 08/09/17.
 */
public class App {

    public static void main(String[] args) {

        News news = new News("Nadia", new Date(), "My VLOG");
        Publisher publisher = new Publisher("Nadia", new Date());

        publisher.print();
        news.print();

        Publisher publisher1 = news;
        publisher1.print();


        publish(publisher1);
        publish(publisher);
        publish(new Article());

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

    private static void publish(Publisher publisher){
        System.out.println("Publish...");
        publisher.print();
    }
}
