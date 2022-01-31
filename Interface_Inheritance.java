package JavaPack;

abstract class Animal{
	protected int legs;
	
	protected Animal(int legs)
	{
		this.legs = legs;
	}
	
	public void walk()
	{
		System.out.println("This animal walks by "+legs+" legs");
	}
	
	public abstract void eat();
}

interface Pet{
	
	public String getName();
	public void setName(String name);
	public void play();
	
}

class Cat extends Animal implements Pet{
	private String cat_name;
	
	public Cat()
	{
		this("");
	}
	
	public Cat(String name)
	{
		super(4);
		cat_name = name;
	}
	
	public void eat()
	{
		System.out.println("Cat eat fishes");
	}
	
	public String getName()
	{
		return cat_name;
	}
	
	public void setName(String name)
	{
		cat_name = name;
	}
	
	public void play()
	{
		throw new UnsupportedOperationException("Not supported");
	}
}

class Fish extends Animal implements Pet{
	private String fish_name;
	public Fish()
	{
		super(0);
	}
	
	public void eat()
	{
		System.out.println("Fish eat plants");
	}
	
	public String getName()
	{
		return fish_name;
	}
	
	public void setName(String name)
	{
		fish_name = name;
	}
	
	public void play()
	{
		throw new UnsupportedOperationException("Not supported");
	}
	
	public void walk()
	{
		System.out.println("Fish has no legs");
	}
}

class Spider extends Animal{
	public Spider()
	{
		super(8);
	}
	
	public void eat()
	{
		System.out.println("Spider eat insects");
	}
}

public class javapack_test_animals {

	public static void main(String[] args) {
 
		Fish f = new Fish();
		Cat c = new Cat();
		Animal s = new Spider();
		
		System.out.println("FISH");
		f.setName("Mimi");
		System.out.println("The fish's name is "+f.getName());
		f.eat();
		f.walk();
		System.out.println("\n");

		
		System.out.println("CAT");
		c.setName("Moose");
		System.out.println("This cat's name is "+c.getName());
		c.walk();
		c.eat();
		System.out.println("This cat's name is "+c.getName());
		System.out.println("\n");
		
		System.out.println("SPIDER");
		((Spider)s).eat();
		((Spider)s).walk();
		System.out.println("\n");
		
	}
}
