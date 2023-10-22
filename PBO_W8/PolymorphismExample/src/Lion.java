
public class Lion extends Animal implements ISpeaker {
	protected String gender;
	
	public Lion(String name, int age, String gender)
	{
		super(name, age);
		this.gender = gender;
	}
	
	public String toString()
	{
		String result = super.toString();
		result+="\nGender = "+this.gender;
		
		return result;
	}
	
	public void run()
	{
		System.out.println("Saya sedang berlari..");
	}
	
	public void eat()
	{
		System.out.println("Saya makan daging-dagingan");
	}

	@Override
	public void Speak() {
		System.out.println("Saya adalah singa.. ");
		
	}
}
