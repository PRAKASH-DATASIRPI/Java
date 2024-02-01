package com.example.junit.testing;//package com.example.junit.testing;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//
//@SpringBootTest
//class TestingApplicationTests {
//
//	@Test
//	void contextLoads() {
//
//
//
//
//	}
//
//}
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;




public class CalculatorTest {




	private Calculator calculator;




	@BeforeEach

	void setUp() {

		calculator = new Calculator();

	}




	@Test

	void testAdd() {

		int result = calculator.add(5, 3);

		Assertions.assertEquals(8, result);

	}




	@Test

	void testSubtract() {

		int result = calculator.subtract(10, 4);

		Assertions.assertEquals(6, result);

	}




	@Test

	void testMultiply() {

		int result = calculator.multiply(2, 5);

		Assertions.assertEquals(10, result);

	}




	@Test

	void testDivide() {

		int result = calculator.divide(10, 2);

		Assertions.assertEquals(5, result);

	}




	@Test

	void testDivideByZero() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {

			calculator.divide(10, 0);

		});

	}

}