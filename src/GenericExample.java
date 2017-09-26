/**
 * Created by nadezhda on 15/09/17.
 */
public class GenericExample<T extends Number> {

    public void sort(T[] array){

    }

    public void sort1(Object[] array){

    }

    public <E> void sort2(E[] array, Class clazz){

    }

    public static void main(String[] args) {
    //    new GenericExample<String>();
        new GenericExample<Integer>().sort1(new Integer[] {1, 2} );
        new GenericExample<Integer>().sort1(new Object[] {1, "String"} );
        new GenericExample<>().sort2(new Integer[] {1, 2}, Integer.class);
    }


//    public void sort(int[] array){
//        //sort
//    }
//
//    public void sort(double[] array){
//        //sort
//    }
//
//    public void sort(Object[] array){
//        //sort
//    }

}
