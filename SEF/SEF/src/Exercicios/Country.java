/**
 * 
 */
package Exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author paulo.victor.moura
 * 
 */
public class Country implements Comparable {

	private String name;

	private Integer population;

	private String continent;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Country(String nome) {
		this.name = nome;
	}

	public Country(String nome, Integer population) {
		this.name = nome;
		this.population = population;
	}
	
	public Country(String nome, Integer population, String continent) {
		this.name = nome;
		this.population = population;
		this.continent = continent;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List paises = new ArrayList();

		paises.add(new Country("Brasil", 1000, "America"));
		paises.add(new Country("Holanda", 80, "Europa"));
		paises.add(new Country("Uruguai", 20, "America"));
		paises.add(new Country("Italia", 2000, "Europa"));
		paises.add(new Country("Mexico", 5000, "America"));
		paises.add(new Country("China", 50000, "Asia"));

		for (Object object : paises) {

			Country c = (Country) object;

			System.out.print(c.getName() + " ");
		}

		System.out.println("");

		Collections.sort(paises);

		for (Object object : paises) {

			Country c = (Country) object;

			System.out.print(c.getName() + " ");
		}

	}

	@Override
	public int compareTo(Object o) {

		Country country = (Country) o;
		int retorno;

		if (this.continent.equals(country.continent)) {
			if (this.population == country.population) {
				retorno = 0;
			} else if (this.population > country.population) {
				retorno = 1;
			} else {
				retorno = -1;
			}
		} else if (this.continent.compareTo(country.continent) > 0) {
			retorno = 1;
		} else {
			retorno = -1;
		}
		
		return retorno;
	}

}
