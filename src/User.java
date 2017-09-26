import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/**
 * Created by nadezhda on 12/09/17.
 *
 * 1. Класс User с полями – userId (int), name (String), lastName (String), email
 (String), registrationDate (java.util.Date).


 2. Для задания конкретной даты используйте класс Calendar.
 */
public class User {

    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || !getClass().equals(obj.getClass())) return false;
        User other = (User) obj;

        return Objects.equals(login, other.login)
                && Objects.equals(password, other.password);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + login.hashCode();
        result = 31 * result + password.hashCode();

        return result;
    }

    //    private int userId;
//    private String name;
//    private String lastName;
//    private String email;
//    private Date registrationDate;
//
//    private String[] strings;
//
//    public User(int userId, String name, String lastName, String email, Date registrationDate) {
//        this.userId = userId;
//        this.name = name;
//        this.lastName = lastName;
//        this.email = email;
//        this.registrationDate = registrationDate;
//        this.strings = new String[]{ "s1", "s2", "s3" };
//    }
//
//    @Override
//    public String toString() {
//        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
//
//        return "User: id =  " + userId + ", name = " + name + ", " + "date = " + dateFormat.format(registrationDate) + ", strings = " + getArrayString(strings);
//    }
//
//    private String getArrayString(Object[] array){
//        String s = " ";
//        for(Object el: array){
//            s += el.toString();
//        }
//        return s;
//    }

}
