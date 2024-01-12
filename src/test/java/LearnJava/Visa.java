package LearnJava;

public class Visa implements Country{

	@Override
	public void usa() {
		System.out.println("NewYork");
		
	}

	@Override
	public void uk() {
		System.out.println("London");
		
	}

	@Override
	public void canada() {
		System.out.println("Toranto");
		
	}
	public void France() {
		System.out.println("Paris");
	}

}
