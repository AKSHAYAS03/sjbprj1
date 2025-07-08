package dsa.mca.collection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;
public class DemoDSA{
	
	

	public static void main(String[] args) {
	//SET	
	TreeSet<Integer> h=new TreeSet<Integer>();
	h.add(100);
	h.add(200);
	h.add(89);
	h.add(100);
	h.add(900);
	h.add(2);

	System.out.println(h);
	
	//HASHMAP
		HashMap<Integer, String> d=new HashMap<Integer, String>();
		d.put(100,"Desktop");
		d.put(200,"Ram");
		d.put(100,"Laptop");
		d.put(200,"Ram");
		System.out.println(d);
		
		//LINKEDLIST
		LinkedList<Integer> n=new LinkedList<Integer>();
		n.add(100);
		n.add(29);
		n.add(200);
		n.addFirst(30);
		n.addLast(7);
		System.out.println(n);
		
//		Array
		ArrayList<Integer> n1=new ArrayList<Integer>();
		n1.add(10);
		n1.add(3);
		n1.add(20);
		System.out.println(n1);
		System.out.println(n1.get(0));
		
		//HashSet
		HashSet<Integer> h1=new HashSet<Integer>();
		h1.add(100);
		h1.add(200);
		h1.add(90);
		System.out.println(h1);
	}
		
	}

