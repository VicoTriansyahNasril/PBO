
public abstract class Animal {
	protected String name;
	protected int age;
	
	public Animal(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String toString()
	{
		String result;
		result ="Name = " + this.name +"\nAge = "+this.age;
		return result;
	}
	
	public abstract void eat();
}
