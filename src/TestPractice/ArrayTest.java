package TestPractice;

import java.util.HashSet;
import java.util.LinkedList;

public class ArrayTest {
public static void main(String[] args) {
	LinkedList<String> l = new LinkedList<String>();
	l.add("Ramesh");
	l.add("god");
	l.add("faizaan");
	l.add("kamal");
	l.add("shah");
	l.set(0, "java");
	l.removeLast();
	l.add("RameshSoft");
	System.out.println(l);
	
HashSet hashset = new HashSet(l);
System.out.println(hashset);
}
}
