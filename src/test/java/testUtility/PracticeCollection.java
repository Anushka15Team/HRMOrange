package testUtility;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class PracticeCollection 
{
public static void main(String[] args)
{
	System.out.println("--------------ArrayList-----------");
	
	ArrayList a1 = new ArrayList();
	a1.add(111);
	a1.add("test");
	a1.add(1671);
	a1.add("AJ");
	a1.add(null);
	a1.add(true);
	a1.add(false);
	a1.add('a');
	a1.add(19);
	a1.add(110);
	a1.add(null);
	
	System.out.println(a1);
	System.out.println(a1.get(4));
	
	System.out.println("-------------LinkedList-----------");
	
	LinkedList l1 = new LinkedList();
	l1.add(111);
	l1.add("test");
	l1.add(1671);
	l1.add("AJ");
	l1.add(null);
	l1.add(true);
	l1.add(false);
	l1.add('a');
	l1.add(19);
	l1.add(110);
	l1.add(null);
	
//	for (int i=0; i<a1.size();i++)               not used in collection but iterator is used
//	{
//		System.out.println(a1.get(i));
//	}
//	
	
	Iterator it =a1.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	System.out.println("--------------Hashset-----------");
	
	HashSet hs = new HashSet();
	hs.add(111);
	hs.add("test");
	hs.add(null);
	hs.add(true);
	hs.add(null);
	System.out.println(hs);
	
	HashSet hs2 = new HashSet();
	hs2.addAll(a1);
	System.out.println(hs2);
	
	System.out.println("-------------Vector-----------");
	
	Vector v = new Vector();
	
}
}
