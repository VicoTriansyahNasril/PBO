
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Polymorphism via inheritance
		Animal[] animal = new Animal[4];
		animal[0] = new Lion("ABC", 5, "M");
		animal[1] = new Lion("BCD", 10, "F");
		animal[2] = new Bird("DEF", 1);
		animal[3] = new Bird("FGH", 2);
		
		ISpeaker speaker;
		for(int i=0;i<animal.length;i++)
		{
			
			System.out.println(animal[i]);
			animal[i].eat();
			if(i==0 || i==1)
			{
				//Polymorphism via interface
				((Lion)animal[i]).run();
				speaker = (Lion)animal[i];
				speaker.Speak();
			}
			else
			{
				//Polymorphism via interface
				speaker = (Bird)animal[i];
				speaker.Speak();
			}
			
			
		}
		
		
		

	}

}
