package q4_Hooks;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HooksArithTest {

	static HooksArith hooksArith;
	
	@BeforeAll
	static void setUpBeforeClass() {
		hooksArith = new HooksArith();
	}

	@AfterAll
	static void tearDownAfterClass(){
		System.out.println("Close All");
	}

	@BeforeEach
	void setUp()  {
		hooksArith = new HooksArith();
	}

	@AfterEach
	void tearDown() {
		System.out.println("End test instance");
	}

	@Test
	@DisplayName("Should Test1 Add Method")
	void test1() {
		
		int expected = 5;
		int actual = hooksArith.add(2, 3);
		assertEquals(expected,actual,"returns the right sum");
	}
	
	@Test
	@DisplayName("Should Test2 Add Method")
	void test2() {
		
		int expected = 6;
		int actual = hooksArith.add(3, 3);
		assertEquals(expected,actual,"returns the right sum");
	}

}
