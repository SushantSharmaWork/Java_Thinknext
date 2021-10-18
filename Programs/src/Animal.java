import java.util.*;

class Animal
{
	public void eat(String food)
	{
	System.out.println("Animal is eating " + food);
	}
}

class Dog extends Animal
{
	String name;
	public Dog(String namee)
	{
		this.name = namee;
	}
	
	public void display()
	{
	System.out.println("Name is "+ name);
	}
}

class Info
{
	public static void main(String[] args)
	{
		Dog pet = new Dog("Tommy");
		pet.display();
		pet.eat("snacks");
	}
}