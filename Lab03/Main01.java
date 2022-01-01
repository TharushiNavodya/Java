class Pet 
{
	protected String name;
	protected String owner;
	protected int age;
	
	public Pet(String n, String o, int a) 
	{
		this.name = n;
		this.owner = o;
		this.age = a;
	}
	public Pet(String n, String o)
	{
		this.name = n;
		this.owner = o;
	}
	
	public void showDetails()
	{
		System.out.println("I am a pet.\nMy name is "+this.name+".\nMy owner is "+this.owner);
	}
}

class Dog extends Pet
{
	private int noOfMasters;
	
	public Dog(String n, String o, int a,int m)
	{
		super(n,o,a);
		this.noOfMasters = m;
	}
	
	public Dog(String n, String o)
	{
		super(n,o);
		this.age = 0;
		this.noOfMasters = 1;
	}
	
	public void showDetails()
	{
		System.out.println("I am a pet.\nMy name is "+this.name+".\nMy owner is "+this.owner+".\nNo of Masters "+this.noOfMasters);
	}
}

class Cat extends Pet
{
	private int livesLeft;
	
	public Cat(String n, String o, int a,int l)
	{
		super(n,o,a);
		this.livesLeft = l;
	}
	public Cat(String n, String o)
	{
		super(n,o);
		this.age = 0;
		this.livesLeft =7;
	}
	public void showDetails()
	{
		System.out.println("I am a pet. My name is "+this.name+".\nMy owner is "+this.owner+"\nMy livesLeft is "+this.livesLeft);
	}
}
public class Main01
{
	public static void main(String args[])
	{
		Pet p = new Pet("Lissie","Smith",3); 
		p.showDetails(); 
		Cat c = new Cat("Kyan", "Silva", 4, 4); 
		c.showDetails();
	}
}