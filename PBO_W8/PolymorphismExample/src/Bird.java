
public class Bird extends Animal implements ISpeaker {
	
	public Bird(String name, int age)
	{
		super(name, age);
	}
	@Override
	public void eat()
	{
		System.out.println("Saya makan biji-bijian.. ");
	}

	@Override
	public void Speak() {
		System.out.println("Saya adalah burung..");
		
	}
}
