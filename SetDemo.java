import java.util.*;
class SetDemo{
public static void main(String args[]){
TreeSet<String> hs = new TreeSet<String>();

System.out.println(hs.isEmpty());
hs.add("K");
hs.add("R");
hs.add("I");
hs.add("P");
hs.add("A");
hs.add("T");
hs.add("H");
hs.add("A");
hs.add("P");
hs.add("A");
hs.add("S");
System.out.println(hs);
System.out.println(hs.size());
System.out.println(hs.contains("A"));
System.out.println(hs.remove("S"));
System.out.println("First: " + hs.first());
System.out.println("Last: " + hs.last());
System.out.println("Lower: "+ hs.lower("A"));
System.out.println("Floor: "+hs.floor("K"));
System.out.println("Ceiling: " +hs.ceiling("K"));
System.out.println("Higher: " + hs.higher("A"));
System.out.println("Poll first: "+ hs.pollFirst());
System.out.println("Poll Last: "+hs.pollLast());
System.out.println();

System.out.println();

TreeSet<Integer> f = new TreeSet<Integer>();
f.add(10);
f.add(20);
f.add(30);
f.add(40);
System.out.println(f);
System.out.println("First: " + f.first());
System.out.println("Last: " + f.last());
System.out.println("Lower: "+ f.lower(10));
System.out.println("Floor: "+f.floor(20));
System.out.println("Ceiling: " +f.ceiling(30));
System.out.println("Higher: " + f.higher(10));
System.out.println("Poll first: "+f.pollFirst());
System.out.println("Poll Last: "+f.pollLast());

}
}