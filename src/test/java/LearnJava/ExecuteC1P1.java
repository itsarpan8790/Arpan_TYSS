package LearnJava;

public class ExecuteC1P1 {

	public static void main(String[] args) {
		C1P1_CheckScope c1 = new C1P1_CheckScope();
		c1.method1();
		
		
		
		P1C1_CheckScope p1 = new P1C1_CheckScope();
		p1.method1();
		
		
		P1C1_CheckScope upcastOb = new C1P1_CheckScope();
		upcastOb.method1();
	}

}
