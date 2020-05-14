import java.util.*;
class TreeMapDemo{
public static void main(String args[]){
Map<Integer, String> hm=new TreeMap<>();
hm.put(1034, "Kripa");
hm.put(1035, "Susila");
hm.put(1036, "Tshering");
hm.put(1039, "Dolma");
hm.put(1037, "Gautam");
hm.put(1038, "Sweta");
System.out.println(hm);
System.out.println(hm.containsKey(1034));
System.out.println(hm.containsValue("Kripa"));
System.out.println(hm.get(1034));
System.out.println("Keys: "+hm.keySet());
System.out.println("Values: " +hm.values());

}
}