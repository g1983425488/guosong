package lab1;
import static org.junit.Assert.*;
import org.junit.Test;
public class testcal {
	
	private static calculate cal = new calculate();
	@Test
	public void testTriangle(){
		
	cal.triangle(5, 5, 5);
	assertEquals(3, cal.getReuslt());
	cal.triangle(5, 5, 6);
	assertEquals(2, cal.getReuslt());
	cal.triangle(3, 4, 5);
	assertEquals(1, cal.getReuslt());
	cal.triangle(12, 5, 5);
	assertEquals(0, cal.getReuslt());
	}
	

}
