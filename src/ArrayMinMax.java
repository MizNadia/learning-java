/**
 * Created by nadezhda on 06/09/17.
 */
public class ArrayMinMax {

/** 1. Вынесите в отдельный класс метод поиска минимума и
 максимума в массиве. Параметром метода является массив.
 Возвращает мин и макс значение. ArrayUtils. */

//    static int getMinMaxInArray(int array[]){
//        int array[] = new int[245];
//        int max = array[0];
//        int min = array[0];
//
//        for(int i = 0; i < array.length; i++)
//            if(max < array[i])
//
//  //      return int min, int max;
//    }






        public static int max(int[] array) {

            int maximum = array[0];

            for (int i = 0; i < array.length; i++)
                if (maximum < array[i]) maximum = array[i];

            return maximum;
        }

    /** 2. В этом же классе напишите метод находящий среднее
     арифметическое значение элементов. */

//    static int getAverageValue(){
//        double average = 0;
//        if(array.length > 0){
//            double sum = 0;
//            for(int i = 0; i < array.length; i++){
//                sum += array[i];
//            }
//            average = sum / array.length;
//        }
//    }

}
