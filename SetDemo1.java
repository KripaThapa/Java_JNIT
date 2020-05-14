import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.TreeSet;

class HashSetDemo{
public static void main(String args[]){
Set<String> hs = new HashSet<>();
System.out.println("HashSet");
System.out.println("Is Empty: " + hs.isEmpty());
hs.add("Hello");
hs.add("World");
hs.add("!");
hs.add("");
hs.add("Everyone");
System.out.println(hs);
System.out.println("Is Empty: " + hs.isEmpty());
System.out.println();
System.out.println("LinkedHashSet");
Set<String> ls = new LinkedHashSet<>();
ls.add("Hello");
ls.add("World");
ls.add("!");
ls.add("");
ls.add("Everyone");
System.out.println(ls);
System.out.println();
System.out.println("TreeSet");
Set<String> ss = new TreeSet<>();
ss.add("Hello");
ss.add("World");
ss.add("!");
ss.add("");
ss.add("Everyone");
System.out.println(ss);
}

}