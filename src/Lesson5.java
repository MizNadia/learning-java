import java.util.Scanner;

/**
 * Created by nadezhda on 12/09/17.
 *
 * В main нужно добавить консольное меню: при запуске
 программы, пользователю будет предложено ввести логин и
 пароль. Если аутентификация успешна, вывести на экран
 сообщение:
 1. Показать все мои посты


 2. Написать сообщение пользователю


 3. Оставить комментарий к посту


 4. Выход


 При вводе 4 – выход из программы. Также нужно
 предусмотреть, чтобы пользователь не мог ввести некорректные
 данные.


 Ограничения – можно использовать ключевое слово continue;
 использовать только массивы; нужна корректная реализация
 equals и hashCode (продуманная).
 */
public class Lesson5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter login");
        System.out.println("enter password");

        System.out.println("1. Показать все мои посты");
        System.out.println("2. Написать сообщение пользователю");
        System.out.println("3. Оставить комментарий к посту");
        System.out.println("4. Выход");



    }
}
