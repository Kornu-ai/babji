package javaque;

import java.util.*;


public class Queewclasss {

	public static void main(String[] args) {
		PriorityQueue<String> listofque= new PriorityQueue<String>();
		listofque.add("babji");
		listofque.add("dileep");
		listofque.add("naresh");
		listofque.add("mani");
       System.out.println("head:"+listofque.element());
       System.out.println("head:"+listofque.peek());
       Iterator<String> itr=listofque.iterator();  
       while(itr.hasNext()){  
       System.out.println(itr.next());  
       }  
       listofque.remove();  
       listofque.poll();  
       System.out.println("after removing two elements:");  
       Iterator<String> itr2=listofque.iterator();  
       while(itr2.hasNext()){  
       System.out.println(itr2.next());  
       }  
	}

}
