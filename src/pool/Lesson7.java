package pool;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by nadezhda on 19/09/17.
 */
public class Lesson7 {

    public static void main(String[] args) {

        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        try {
            Date date = format.parse("19.09dd.2017");
        } catch (ParseException e){
            System.out.println("Exception occurred. Message = " + e.getMessage());
        } finally {
            System.out.println("finally");
        }


        Map<Key, Integer> map = new LinkedHashMap<>();
        map.put(new Key("one"), 1);
        map.put(new Key("two"), 2);
        map.put(new Key("three"), 3);
        map.put(new Key("four"), 4);


        System.out.println(map.get(new Key("two")));
        System.out.println(map.get(new Key("two")));
        System.out.println(map.get(new Key("two")));
        System.out.println(map.get(new Key("two")));


        for (Key key: map.keySet()){
            System.out.println("Key = " + key.s + ", value = " + map.get(key));
        }


        Set<String> strings = new HashSet<>();
        System.out.println(strings.add("s1"));
        System.out.println(strings.add("s2"));
        System.out.println(strings.add("s3"));
        System.out.println(strings.add("s4"));
        System.out.println(strings.add("s4"));
        System.out.println(strings.size());

    }

    static class Key{
        String s;
        public Key(String s) {
            this.s = s;
        }

        @Override
        public boolean equals(Object obj) {
            Key other = (Key)obj;
            return Objects.equals(s, other.s);
        }

        @Override
        public int hashCode() {
            return 1;
        }

    }
}
