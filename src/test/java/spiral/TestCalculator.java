package spiral;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCalculator {
	   @Test
	   public void testAdd() {
		   Calculator c = new Calculator();
		   assertEquals(2, c.telop(1,1));
	   }
	   
//	   @Test
//	   public void testSubtract() {
//		   Calculator c = new Calculator();
//		   assertEquals(0, c.subtract(1,1));
//	   }
//	   
//	   @Test
//	   public void testMultiply() {
//		   Calculator c = new Calculator();
//		   assertEquals(1, c.multiply(1,1));
//	   }
//	   
//	   @Test
//	   public void testDivide() {
//		   Calculator c = new Calculator();
//		   assertEquals(1, c.divide(1,1));
//	   }
}