package perscholas.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorTest {

	@ParameterizedTest
	@CsvSource({
		"5,5,10",
		"10,10,20",
		"5.5,5.5,11.0"
	})
	public void additionTest(double a,double b,double answer) {
		Calculator c = new Calculator();
		
		//double expected =10.0;
		double actual =c.add(a,b);
		
		Assertions.assertEquals(answer,actual);
		//Assertions.assertEquals(15,c.add(7.5,7.5));
		

	}
	
	@ParameterizedTest
	@CsvSource({
		"5,5,11",
		"10,10,24",
		"5.5,5.5,12.0"
	})
	public void additionErrorTest(double a,double b,double answer) {
		Calculator c = new Calculator();
		
		//double expected =10.0;
		double actual =c.add(a,b);
		
		Assertions.assertNotEquals(answer,actual);
		//Assertions.assertEquals(15,c.add(7.5,7.5));
		

	}
	@ParameterizedTest
	@CsvSource({
		"10,10,0",
		"10.5,8,2.5"
	})
	public void subtractionTest(double a,double b,double answer) {
		Calculator c = new Calculator();
		
		//double expected =10.0;
		double actual =c.subtract(a,b);
		
		//Assertions.assertEquals(expected,actual);
		Assertions.assertEquals(answer,actual);
		

	}
	
	@ParameterizedTest
	@CsvSource({
		"10,5,10",
		"10,10,21",
		"5.5,5.5,12.35"
	})
	public void subtractionErrorTest(double a,double b,double answer) {
		Calculator c = new Calculator();
		
		double actual =c.subtract(a,b);
		
		Assertions.assertNotEquals(answer,actual);
		//Assertions.assertEquals(15,c.add(7.5,7.5));
		

	}
	
	@ParameterizedTest
	@CsvSource({
		"5,5,25",
		"10,10,100",
		"5.5,5.5,30.25"
	})
	public void multiplyTest(double a,double b,double answer) {
		Calculator c = new Calculator();
		
		
		double actual =c.multiply(a,b);
		
		Assertions.assertEquals(answer,actual);

}
	
	@ParameterizedTest
	@CsvSource({
		"5,5,28",
		"10,10,10",
		"5.5,5.5,30"
	})
	public void multiplyErrorTest(double a,double b,double answer) {
		Calculator c = new Calculator();
		
		
		double actual =c.multiply(a,b);
		
		Assertions.assertNotEquals(answer,actual);
	}
	
	@ParameterizedTest
	@CsvSource({
		"5,5,1",
		"100,10,10",
		"25,5,5"
	})
	public void divideTest(double a,double b,double answer) {
		Calculator c = new Calculator();
		
		
		double actual =c.divide(a,b);
		
		Assertions.assertEquals(answer,actual);

}
	@ParameterizedTest
	@CsvSource({
		"5,5,10",
		"100,10,101",
		"25,5,5.12"
	})
	public void divideErrorTest(double a,double b,double answer) {
		Calculator c = new Calculator();
		
		
		double actual =c.divide(a,b);
		
		Assertions.assertNotEquals(answer,actual);

}
	
	
}
