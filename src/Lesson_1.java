import java.util.Scanner;

/**
 * Created by nadezhda on 29/08/17.
 */
public class Lesson_1 {

    public static void main(String[] args) {
//disregard//

//        int a = 5;
//        int b = 10;
//        int c;
//        c = a + b;
//
//        System.out.println(c);
//        System.out.println("Сумма = " + (a + b));
//        System.out.println(c++);
//        System.out.println(++c);
//        System.out.println("\"экранирование символов\"");

/** 1. Написать программу осуществляющую решение линейного уравнения ax + b = 0.
 a и b задаете в программе, х выводите на экран. */

        int a = 5;
        int b = 10;
        int x = (0 - b) / a;

        System.out.println(x);

/** 2. В первую задачу добавьте возможность пользователю самому вводить данные a и b.
 Используйте класс Scanner.*/

        Scanner sc = new Scanner(System.in);
        int c;
        int d;
        System.out.println("How much is c?");
        c = sc.nextInt();
        System.out.println("How much is d?");
        d = sc.nextInt();

        System.out.println("x = " + (0 - d) / c);

///** 3. Напишите программу вычисляющую квадратное уравнение ax*x + b * x + c = 0.
// Коэффициенты вводятся с клавиатуры.*/
//
//        Scanner sc = new Scanner(System.in);
//        int a, b, c;
//
//        System.out.println("How much is a?");
//        a = sc.nextInt();
//        System.out.println("How much is b?");
//        b = sc.nextInt();
//        System.out.println("How much is c?");
//        c = sc.nextInt();
//
//        private static int discriminant(){
//            int discriminant;
//            if(discriminant > 0){
//
//            }
//            else if(discriminant == 0){
//
//            }
//            else if(discriminant < 0){
//                System.out.println("No solution.");
//            }
//
//
//        }


            //       System.out.println("x = " + );

      //  }
    }
}
