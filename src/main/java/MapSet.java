import java.util.*;
import java.util.ArrayList;

public class MapSet {
    public static void main(String[] args) {
        ArrayList<Person> p = new ArrayList<Person>();
        p.add(new Person("Manpreet", 35));
        p.add(new Person("Abhay", 16));
        p.add(new Person("Param", 38));
        p.add(new Person("Batusad",1));

        Collections.sort(p);
        for (Person p1 : p) {
            System.out.println(p1);
        }
        System.out.println("Sorting by age");
        Collections.sort(p, new CompareByAge());
        for (Person p1 : p) {
            System.out.println(p1);
        }
        System.out.println("Sorting by name");
        Collections.sort(p,new CompareByName());
        for(Person p1 :p)
        {
            System.out.println(p1);
        }

        // Collections.sort(p,new );


        //Set<Map.Entry<Integer,String>> map=
//        HashMap<Integer,String> cities=new HashMap<Integer, String>();
//        cities.put(1,"Moga");
//        cities.put(2,"Ludhiana");
//        cities.put(3,"Chandigarh");
//        cities.put(4,"Moga");
//        cities.putIfAbsent(4,"Moga1qw");
//        System.out.println("Key set="+cities.keySet());
//        System.out.println("Values ="+cities.values());
//        System.out.println("Entry Set="+cities.entrySet());
//        cities.replace(4,"Masitan");
//        System.out.println("Size ="+cities.size());
//        System.out.println(cities);
//        for(Integer i:cities.keySet())
//        {
//            System.out.println("key ="+i +" Values= "+cities.get(i));
//        }
    }
}
