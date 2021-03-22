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
		
		// Usando expressões mais enxuto, ou seja expressões lambda
		// (p1, p2) -> : é assim que se define de forma enxuta uma função anonima
		Comparator<Product> comp02 = (p1, p2) ->{
			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		};
		
		list.sort(comp02);
		
		for(Product p : list) {
			System.out.println(p);
		}

	}

}
