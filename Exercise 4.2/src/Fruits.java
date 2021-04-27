import java.util.Scanner;
public class Fruits {
	String name, colour, taste;
	double weight,price;
	int quantity;
	public Fruits(String name) {
		this.name = name;
	    System.out.println("Fruit constructor is invoked");
	  }
}

class Apple extends Fruits{
	public Apple(String name, double weight) {
		super (name);
		this.weight = weight;
	    System.out.println(this.name + " constructor is invoked");
	    System.out.println(this.name + " weight is " + this.weight + "kg");
	  }
}

class RedApple extends Apple{
	public RedApple(String name, String color, double weight , int quantity ) {
		super (name, weight);
		this.colour = color;
		this.quantity = quantity;
		this.price = (this.weight * this.quantity) * 15;
		System.out.println("Color = " + this.colour);
		System.out.println("Price per kg = " + this.price);
	}
}

class GreenApple extends Apple{
	public GreenApple(String name, String color, double weight , int quantity) {
		super (name, weight);
		this.colour = color;
		this.quantity = quantity;
		this.price = (this.weight * this.quantity) * 18;
		System.out.println("Color = " + this.colour);
		System.out.println("Price per kg = " + this.price);
	}
}

class Pineapple extends Fruits{
	public Pineapple(String name, String color, String taste, double weight , int quantity) {
		super (name);
		this.colour = color;
		this.taste = taste;
		this.weight = weight;
		this.quantity = quantity;
		this.price = (this.weight * this.quantity) * 5;
	    System.out.println(this.name + " constructor is invoked");
	    System.out.println(this.name + " color is "+ this.colour);
	    System.out.println(this.name + " taste is "+ this.taste);
	    System.out.println(this.name + " weight is " + this.weight + "kg");
	    System.out.println("Price per kg = " + this.price);
	  }
}

class Orange extends Fruits{
	public Orange(String name, String color, String taste, double weight , int quantity) {
		super (name);
		this.colour = color;
		this.taste = taste;
		this.weight = weight;
		this.quantity = quantity;
		this.price = (this.weight * this.quantity) * 7;
		System.out.println(this.name + " constructor is invoked");
	    System.out.println(this.name + " color is "+ this.colour);
	    System.out.println(this.name + " taste is "+ this.taste);
	    System.out.println(this.name + " weight is " + this.weight + "kg");
	    System.out.println("Price per kg = " + this.price);
	}
}

class Main {
	public static void main(String[] args) {
		Apple a = new Apple("Apple", 0.4);
		System.out.println();
		RedApple b = new RedApple("Pink lady", "Red", 0.7, 10);
		System.out.println();
		GreenApple c = new GreenApple("Granny Smith", "Green", 0.4, 20);
		System.out.println();
		Pineapple d = new Pineapple("Pineapple","Yellow", "Sweet and Sour", 1.3 , 9);
		System.out.println();
		Orange e = new Orange("Orange", "Orange", "Sweet and Sour", 0.75 , 15);
	}
}