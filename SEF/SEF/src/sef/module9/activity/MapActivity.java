package sef.module9.activity;
//Needs to be completed

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class MapActivity {

		public static void main(String[] args) {
			//1 - Type code to create a HashMap of key value pair
			//where key is id of type String and value is a name
			MapActivity mapactivity = new MapActivity();
			
			Map map = new TreeMap();
			map.put("1","Joao");
			map.put("2","Pedro");
			map.put("3","Manoel");
			map.put("4","Carlos");
		
			
			//2 - Call print method to print the map passed as its parameter.
		mapactivity.print(map);
		}
		
		void print(Map map)
		{
			//3 - Type code to print this map
		
			Set keys = map.keySet();
			
			for (Object key : keys){
				System.out.print("Chave: " + key);
				Object valor = map.get(key);
				System.out.println(" Valor: " + valor);
			}
		}
	}
