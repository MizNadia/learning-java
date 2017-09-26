import sun.plugin2.message.Message;

/**
 * Created by nadezhda on 12/09/17.
 *
 *  4. Создайте класс MessageStore – в нем будет одно поле – массив Message.
 Также добавьте метод add(), который будет добавлять в массив сообщения.
 */
public class MessageStorage {

    private static Message[] messages;
    private static int length;

    private MessageStorage(){}

    static  {
        messages = new Message[10];
     //   messages[0] = new Message(m);
    }

    public static void add(Message message){
        messages[length++] = message;
    }
}
