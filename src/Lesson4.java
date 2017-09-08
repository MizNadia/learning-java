import java.util.Date;

/**
 * Created by nadezhda on 08/09/17.
 */
public class Lesson4 {

    public static void main(String[] args) {

        Post[] posts = new Post[5];

        for (Post post : posts) {
            System.out.println(post.getPostId());
        }

        System.out.println();


        posts[0] = Post.createInstance(2, "title2", "text2", new Date());
        posts[1] = new Post(1, "title", "text", new Date());
        posts[1] = new Post(3, "title3", "text3", new Date());
        posts[1] = new Post(4, "title4", "text4", new Date());
        posts[1] = new Post(5, "title5", "text5", new Date());

        for (int i = 0; i < posts.length; i++) {
            for (int j = i + 1; j < posts.length; j++) {
                if (posts[i].getTitle().compareTo(posts[j].getTitle()) < 0) {
                    Post temp = posts[j];
                    posts[j] = posts[i];
                    posts[i] = temp;
                }
            }
        }
        for (Post post : posts) {
            System.out.println(post.getPostId() + " ");
        }
    }
}
