package TestPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {
public static void main(String[] args) {
	ArrayList a = new ArrayList();
	a.add("10");
	a.add("Rameshsoft");
	a.add("30");
	a.add("selenium");
	a.add("A");
	a.add("50.5f");
	System.out.println("10".compareTo("2"));
	System.out.println(a);
	
	Iterator iterator = a.iterator();
	while(iterator.hasNext())
	{
		String s = (String)iterator.next();
	if(s.equalsIgnoreCase("Rameshsoft"))
	{
		System.out.println("Welcome to rameshsoft");
	}
	}
}
}
