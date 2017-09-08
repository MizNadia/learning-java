import java.util.Random;
import java.util.Scanner;

/**
 * Created by nadezhda on 01/09/17.
 */
public class Lesson_2 {

    public static void main(String[] args) {


//        byte s = 1;
//        s = (byte) (s + 3);
//        s += 3;
//
//        boolean s1 = false;
//        boolean s2 = true;
//        System.out.println(s1 & s2);
//
//        String s3 = "Hi";
//        if (s3 != "Hi") {
//            System.out.println("Equals");
//        } else {
//            if (args.length == 0) {
//                System.out.println("Not equals");
//            } else {
//                System.out.println("Not equals 2");
//            }
//        }
//        System.out.println("Not equals 2");


//        int a = 45, b = 44, c = 46;
//
//        if (a > b) {
//            if (a > c){
//                System.out.println("A");
//            } else {
//                System.out.println("C");
//            }
//        } else if (b > c){
//            System.out.println("B");
//        } else {
//            System.out.println("C");
//        }

//
//        for (int i = 0; i < 20; i++){
//            System.out.println("I = " + i);
//        }
//
//        int o = 0;
//        while (o < 20){
//            System.out.println("Hi");
//            o += 5;
//        }
//
//        Scanner scanner = new Scanner(System.in);
//            while (!scanner.hasNextDouble()){
//                System.out.println("Error");
//                scanner.next();
//            }
//        System.out.println("Number " + scanner.nextDouble());
//        }

//        int[] a = new int[10];
//        a[2] = 3;
//        System.out.println(a[2]);
//
//        int[] b = new int[] {1, 2, 3, 4};
//        for (int b = 0; b < a.length; b++) {
//            System.out.println(a[b] + " ");
//        }
    }

/** 1. Напишите программу, округляющую числа.*/
        public static void round() {
            //option 1
            double a = 16.24;
            double x = a - (int) a;
            System.out.println("Число " + a + " округляется до ");
            if (x >= 0.5) {
                a += 1;
            } else a = (int) a;

            System.out.println((int) a);

            //option 2
            double b = 16.24;
            System.out.println("b = " + Math.round(b));
    }

/** 2. Напишите программу, которая несколько раз выводит текст разными циклами.*/
        public static void cycleFor() {

            for (int i = 0; i <5; i++) {
                System.out.println("Hello world!" + i);
            }
        }

        public static void cycleWhile(){
            int i = 0;
            while (i < 6){
                System.out.println("Hey, Jude!" + i);
            }
        }

/** 3. Напишите программу, находящую максимум и минимум в массиве. Массив заполняется случайными значениями (класс Random).*/
        public static void array(){

            int array[] = new int[25];

            for(int i = 0; i < array.length; i++){
                Random random = new Random();
                array[i] = random.nextInt(125) + 1;
            }

            int min = array[0];
            int max = array[0];

            for(int i = 0; i != array.length; i++){
                if(array[i] > max){
                    max = array[i];
                }
                if(array[i] < min){
                    min = array[i];
                }
            }
            System.out.println(max + " " + min);
        }


/** 4. Напишите программу, которая находит простые числа от 0 до 10000. Простые числа делятся на себя и на 1. Полный перебор и решето Эрастофена.*/
        public static void erastofen(){
            int array[];

        }

        public static void  perebor(){
            for(int i = 2; i < 10000; i++){
                boolean isPrime = true;
                for(int j = 2; j <= Math.sqrt(i); j++){
                    if(i % j == 0){
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime){
                    System.out.println(i);
                }
            }
        }




}
