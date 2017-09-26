/**
 * Created by nadezhda on 15/09/17.
 *
 * Создать такой класс UserStorage – в котором будут хранится
 массив User – это будут пользователи, зарегистрированные в
 приложении. Также класс будет содержать метод –
 authenticate(User user), который будет проверять, находится ли
 пользователь или нет.
 */
public class UserStorage {

    private static User[] users;

    static {
        users = new User[]{
                new User("Nadia", "123"),
                new User("Nicola", "123123"),
                new User("Simon", "1234")
        };
    }

    public static boolean authenticate(User user) {
        for (User el : users) {
            if (el.equals(user)) {
                return true;
            }
        }
        return false;
    }
}
