/**
 * Created by nadezhda on 05/09/17.
 */
public class Car {

    int weight;
    int maxSpeed;
    String name;

    Car(int weight1, int maxSpeed1, String name1) {
        weight = weight1;
        maxSpeed = maxSpeed1;
        name = name1;
    }

    Car(int maxSpeed1, String name1){
        weight = 1000;
        maxSpeed = maxSpeed1;
        name = name1;
    }

    Car(String name1){
        name = name1;
        weight = 0;
        maxSpeed = 0;
    }

    void go(){
        System.out.println("GOOOOOOOO!");
    }

    void go(String to){
        System.out.println("Go to " + to);
    }

    void go(String to, int averageSpeed){
        System.out.println("Go to " + to + " with" + "average speed" + averageSpeed);
    }

    int getDoubleMaxSpeed(){
        return maxSpeed * 2;
    }


}
