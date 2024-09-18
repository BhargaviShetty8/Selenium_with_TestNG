package collectionsPractice;

import java.util.ArrayList;
import java.util.Iterator;


public class DynamicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList ar = new ArrayList();
		
		ar.add("Tom");
		ar.add(102);
		ar.add(1.5);
		ar.add('D');
		
		System.out.println(ar.get(3));
		System.out.println(ar.size());
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		/*ArrayList<Integer> ai =new ArrayList<Integer>();
		ArrayList<String> as = new ArrayList<String>();
		
		ai.add(20);
		ai.add(33);
		ai.add(200);
		
		as.add("bob");
		as.add("bubby");
		
		System.out.println("Integer size: " + ai.size() + " String Size: " + as.size());
		
		*/
		//ArrayList<E> ae = new ArrayList<E>;
		
		Variables var = new Variables("Bhargavi", 207, 27);
		Variables var1 = new Variables("Raju", 201, 25);
		Variables var2 = new Variables("Sonu", 202, 22);
		
		ArrayList<Variables> av = new ArrayList<Variables>();
		
		av.add(var);
		av.add(var1);
		av.add(var2);
		
		Iterator<Variables> it = av.iterator();
		while(it.hasNext()) {
		Variables v = it.next();
		System.out.println(v.name);
		System.out.println(v.age);
		System.out.println(v.id);
		}
		
	}

}
