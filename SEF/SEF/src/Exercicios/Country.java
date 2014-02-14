/**
 * 
 */
package Exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Luiz Fernando
 *
 */
public class Country implements Comparable {

	private String name;

	public Country(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setNome(String name) {
		this.name = name;
	}
	
	@Override
	public int compareTo(Object o) {

		Country country = (Country) o;
		System.out.println(this.getName()+"vs "+country.getName()+
				this.getName().compareToIgnoreCase(country.getName()));
		return this.getName().compareToIgnoreCase(country.getName());
	}
	public static void main(String []args){
		
		List CountryList = new ArrayList();
		
		CountryList.add(new Country("Brasil "));
		CountryList.add(new Country("Argentina "));
		CountryList.add(new Country("EUA "));
		CountryList.add(new Country("Uruguai "));
		
		for (Object object : CountryList){
			Country c = (Country) object;
			System.out.println(c.getName()+ "");
		}
		
		System.out.println("");
		
		Collections.sort(CountryList);
		
		for (Object object : CountryList){
			Country c = (Country) object;
			System.out.println(c.getName()+ "");
		}
	}

	
}
