import java.util.*;
import java.util.ArrayList;

public class demo {
    public static void main(String[] args) {
       HashMap<String,Integer> map=new HashMap<>();
       map.put("Manpeet",1);
       map.put("Abhay",2);
       map.put("Param",3);
        System.out.println(map.size());
        for(String h:map.keySet())
        {

            System.out.println(h+"  values = "+map.get(h));
        }

    }
}
