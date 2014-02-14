package sef.module9.activity;
//Needs to be completed

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListActivity {

	public static void main(String[] args) {
		ListActivity listactivity = new ListActivity();
		//1 - Type code to create a list of names. Use ArrayList.

		List lista = new ArrayList();
		lista.add("Joao");
		lista.add("Jose");
		lista.add("Pedro");
		lista.add("Manoel");
		//2 - Call print method to print the list passed as its parameter.
		listactivity.print(lista);
	}
	
	void print(List list)
	{
		//3 - Type code to print this list
		//Notice the order in which elements get printed.
	
		for (Object nome : list){
			System.out.println(nome);
		}
		
		for (int i = 0; i < list.size();i++){
			Object nome = list.get(i);
			System.out.println(nome);
		}
		System.out.println("");
		
		Iterator iterator = list.iterator();
		
		while (iterator.hasNext()){
			String nome = (String) iterator.next();
			System.out.println(nome);
		}
	}
}
