package com.collectionframework.automation.selenium;

import java.util.Iterator;
import java.util.LinkedList;


public class ArrayListDemo {

public static void main(String[] args) {
	LinkedList<String> l = new LinkedList<String>();
    l.add("10");
    l.add("ramesh");
    l.add("20");
    l.add("practice");
    
    for(String string : l ){
    System.out.println(string);
    if(string=="20")
    {
    	System.out.println("20 is found");
    }
    }
//Iterator ite = l.iterator();
//while(ite.hasNext())
//{
//String string = (String) ite.next();	
//if (string.equalsIgnoreCase("ramesh"))
//{
//System.out.println("ramesh class");	
//}
//
//if (string.equalsIgnoreCase("10"))
//{
//System.out.println("10 class");	
//}
//}
}
}
