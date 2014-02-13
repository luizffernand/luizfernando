package sef.module4.activity;

import java.util.Date;

public class DateActivivity {

	private int dia;
	private int mes;
	private int ano;
	
	public DateActivivity(){
		dia = 01;
		mes = 01;
		ano = 2000;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateActivivity dateActivivity = new DateActivivity();
		System.out.println("hoje e "+dateActivivity.dia + "/" + dateActivivity.mes + "/" +
				dateActivivity.ano); 
		System.out.println("hoje: " + dateActivivity.hoje());
	}

	public Date hoje(){
	return new Date();
	}
}

