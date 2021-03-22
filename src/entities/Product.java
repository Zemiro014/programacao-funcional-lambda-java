package entities;

public class Product {

	private String name;
	private double price;
	
	public Product(){
	}
	
	public Product(String name, double price)
	{
		setName(name);
		setPrice(price);
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public void setPrice(double price) 
	{
		this.price = price;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public double getPrice() 
	{
		return price;
	}
	
	public String priceTag() 
	{
		return getName() + " $ "+getPrice();
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
	
}
