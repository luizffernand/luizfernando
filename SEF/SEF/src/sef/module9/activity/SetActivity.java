package sef.module9.activity;

import java.util.Iterator;
//Needs to be completed
import java.util.Set;
import java.util.TreeSet;


public class SetActivity {

	public static void main(String[] args) {
		//1 - Type code to create a set of names.
		//Names must be sorted by their natural order.
		//Do research to find if you already have such a class. 
		//Also try adding a few duplicate entries to this set.
		SetActivity setactivity = new SetActivity();
		
		
		Set set = new TreeSet();
		set.add("Paulo");
		set.add("Luiz");
		set.add("Joao");
		set.add("Marcos");
		set.add("Paulo");
		set.add("Paulo");
		
		
		//2 - Call print method to print the set passed as its parameter.
		setactivity.print(set);
	}
	
	void print(Set set)
	{
		//3 - Type code to print this set
		//Notice the order in which elements get printed.
	
		Iterator iterator = set.iterator();
		
		while (iterator.hasNext()){
			String nome = (String) iterator.next();
			System.out.println(nome);
		}
		iterator = set.iterator();
		
		for(Object nome ; iterator.hasNext();){
			System.out.println();
			nome = iterator.next();
			System.out.println(nome);
		}
		
		System.out.println("");
		
		for (Object nome : set){
			System.out.println(nome);
		}
	}
}
