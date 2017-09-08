import jdk.management.resource.internal.inst.DatagramDispatcherRMHooks;

import java.util.Date;

/**
 * Created by nadezhda on 08/09/17.
 */
public class Publisher {

    String author;
    Date date;

    public Publisher() {}

    public Publisher(String author, Date date){
        this.author = author;
        this.date = date;
        System.out.println("Constructor of Publisher executed.");
    }

    public void print() {
        System.out.println(author + date);
    }
}
