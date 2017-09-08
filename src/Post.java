import java.util.Date;

/**
 * Created by nadezhda on 06/09/17.
 */
public class Post {


    /** 3. Создайте класс Post:

     Поля класса – postId (long), title (String), text (String), postedAt
     (java.util.Date). Setters and getters.

     Создайте массив постов (Post[]). Добавьте туда значений (около 5-7).
     Напишите метод, который сортирует массив постов по postId.
     Используйте сортировку пузырьком */

    private int postId;
    private String title;
    private String text;
    private Date postedAt;

    private Post() {};

    public Post(int postId, String title, String text, Date postedAt) {
        this.postId = postId;
        this.title = title;
        this.text = text;
        this.postedAt = postedAt;
    }

    public static Post createInstance(int postId, String title, String text, Date postedAt){
        if (postId < 0) {
            return null;
        }
        return new Post(postId, text, title, postedAt);
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getPostedAt() {
        return postedAt;
    }

    public void setPostedAt(Date postedAt) {
        this.postedAt = postedAt;
    }

}