import java.util.Date;

/**
 * Created by nadezhda on 08/09/17.
 */
public final class News extends Publisher {

    private String source;

    private static final int MAX_NEWS = 1;

    public News(String author, Date date, String source){
        super(author, date);
        this.source = source;
        System.out.println("Constructor of News executed.");
    }

    public String getSource() {
        return source;
    }

    @Override
    public void print() {
        System.out.println(author + ": " + source + " - " + date);
    }
}
