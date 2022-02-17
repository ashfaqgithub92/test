import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class HashMapExample {
    public static void main(String[] args) {
        TreeMap<String,String> hm=new TreeMap<>();
        hm.put("Apple", "India");
        hm.put("Cat Fish", "Pakistan");
        hm.put("Banana", "Sri Lanka");
        hm.put("Cat", "Nepal");

        System.out.println("TreeMap before Update: "+hm);
        System.out.println();

        hm.put("Orange", "France");

        System.out.println("TreeMap after Update: "+hm);
        System.out.println();

        hm.remove("Orange");

        System.out.println("TreeMap after removal: "+hm);
        System.out.println();

        //Traversing the elements using for-each loop
            for (Entry<String, String> e : hm.entrySet()) {
                System.out.println("Key: "+e.getKey()+" "+"Value: "+e.getValue());
            }
        }
    }

