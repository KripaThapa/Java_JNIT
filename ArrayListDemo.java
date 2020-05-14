import java.util.ArrayList;

class ArrayListDemo{
public static void main(String args[]){
ArrayList<Integer>  list = new ArrayList<Integer>();
System.out.println("Empty: " + list.isEmpty());
list.add(10);
list.add(30);
list.add(40);
list.add(60);
list.add(50);
list.add(40);
list.add(40);
System.out.println(list);
System.out.println("Empty: " + list.isEmpty());

list.add(1, 20);
System.out.println("After Adding Values: "+ list);

System.out.println("Get: " + list.get(1));
System.out.println("Set: " + list.set(6, 70));
System.out.println( list);
System.out.println("List contains: " + list.contains(40));
System.out.println("List size: " + list.size());


}

}