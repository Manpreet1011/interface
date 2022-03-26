import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MapSet {
    public static void main(String[] args) {
        //Set<Map.Entry<Integer,String>> map=
        HashMap<Integer,String> cities=new HashMap<Integer, String>();
        cities.put(1,"Moga");
        cities.put(2,"Ludhiana");
        cities.put(3,"Chandigarh");
        cities.put(4,"Moga");
        cities.putIfAbsent(4,"Moga1qw");
        System.out.println("Key set="+cities.keySet());
        System.out.println("Values ="+cities.values());
        System.out.println("Entry Set="+cities.entrySet());
        cities.replace(4,"Masitan");
        System.out.println(cities);
    }
}
