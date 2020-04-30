class School{
    int schoolId;
    String name;
    static String schoolName;
}

class Student{
    public static void main(String args[]){
	School priya = new School();
	priya.schoolId = 320;
	priya.name = "Priya Thapa";
	School.schoolName = "Little Angel's School";
	System.out.println(priya.name + " goes to " + School.schoolName + " and her ID is " + priya.schoolId);

	School rahul = new School();
	rahul.schoolId = 321;
	rahul.name = "Rahul gh";
	System.out.println(rahul.name + " goes to " + School.schoolName + " and his ID is " + rahul.schoolId);
    }
}