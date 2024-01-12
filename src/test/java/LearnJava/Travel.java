package LearnJava;

public class Travel {
	public static void main(String[] args) {
		//100 percent Abstraction of Country Interface
		Country c=new Visa();
		c.usa();
		c.uk();
		c.canada();
		/*c.frana(); Own method of visa
		             cant be called on Upcated reference */ 
		
		//DownCasting
		Visa v2=(Visa) c;
		v2.France();
		
		//or 
		
		Visa v=new Visa();
		v.France(); //Own method of visa
		v.usa();
		v.uk();
		v.canada();
		
	}

}
