import java.text.SimpleDateFormat;

public class Demo {

	public static void main(String[] args) throws Exception {
		
		SimpleDateFormat dob = new SimpleDateFormat("mm-dd-yyyy");
		
		Person p1 = new Person("Joe", "Smith", 1000, dob.parse("02-08-1996"));
		System.out.println(p1);
		Person p2 = new Student("Jim", "Jack", 1002, dob.parse("14-10-2000"), "Bainbridge High School");
		System.out.println(p2);
		Person p3 = new Person("Jack", "Jay", 1001, dob.parse("1-2-2000"));
		System.out.println(p3);
		Person p4 = new Person("jim", "jay", 1004, dob.parse("1-12-2001"));
		System.out.println(p4);
		Person p5 = new Person("vish", "mondi", 1003, dob.parse("2-22-2005"));
		System.out.println(p5);
		Person p6 = new Person("vish", "mondi", 1006, dob.parse("2-22-2005"));
		System.out.println(p6);
		
		System.out.println(p1.equals(p2));
		
		SortedDblList<Person> sb = new SortedDblList<Person>();
		SortedDblList<Person> sb1 = new SortedDblList<Person>();
		
		System.out.println(sb.add(p1));
		System.out.println(sb1.add(p2));
		System.out.println(sb.add(p3));
		System.out.println(sb1.add(p4));
		System.out.println(sb.add(p5));
		System.out.println(sb1.add(p6));
		sb.printList();
		System.out.println();
		sb1.printList();
		System.out.println();
		
		sb.union(sb1).printList();;
		
		sb.writeObject("newList");
		
		System.out.println(sb.indexOf(p1));
		System.out.println(sb.indexOf(p2));
		System.out.println(sb.indexOf(p3));
		System.out.println(sb.indexOf(p4));
		System.out.println(sb.indexOf(p5));
		System.out.println(sb.indexOf(p6));
		
		sb.printList();
		
		System.out.println(sb.remove(p1));
		System.out.println(sb.remove(p2));
		System.out.println(sb.remove(p3));
		System.out.println(sb.remove(p4));
		
		sb.printList();
		System.out.println();
		
		sb.readObject("newList").printList();

	}

}
