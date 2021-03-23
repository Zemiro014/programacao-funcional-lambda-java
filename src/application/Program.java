package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));		
	
		//list.sort(new MyComparator());
		
		/* 
		 * 		Definindo um objecto que recebe uma class anonima
			Comparator<Product> comp = new Comparator<Product>() {
				@Override
				public int compare(Product p1, Product p2) {				
					return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
				}
				
			};
		*/
		
		// Usando vers�o do Lambda mais simplificada
		// (p1, p2) -> : � assim que se define de forma enxuta uma fun��o anonima
		// p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()) : implementa��o ada fun�ao anonima
		// Comparator<Product> comp02 = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		
		// Usar comparator na forma de Lambda como argumento
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		for(Product p : list) {
			System.out.println(p);
		}

	}

}
