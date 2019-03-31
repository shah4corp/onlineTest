package TestPractice;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapTest {
public static void main(String[] args) {
	TreeMap t = new TreeMap(new MyComparator());
	t.put("xyz", 52);
	t.put("aaa", 56);
	t.put("lll", 55);
	t.put("hhh", 22);
	t.put("ggg", 14);
	System.out.println(t);
}
}

