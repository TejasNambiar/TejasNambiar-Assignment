package q1_MinMaxFinder;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("Upon initalizing MinMaxFinderTest, ")
class MinMaxFinderTest {

	MinMaxFinder minMaxFinder;
	static List<Integer> list;
	
	@BeforeEach
	void Init() {
		minMaxFinder = new MinMaxFinder();
		list = new ArrayList<>();
		list.add(10);
		list.add(50);
		list.add(20);
		list.add(60);
		list.add(30);
		list.add(1);
	}
	
	@Nested
	class TestingSeperately {
		@Test
		@DisplayName("Tests if length is 2")
		void testSize() {
			assertEquals(2, minMaxFinder.findMinMax(list).size(),"returns the right size");
		}
		
		@Test
		@DisplayName("Tests if min max, match")
		void testMinMax() {
			assertAll(
					() -> assertEquals(1, minMaxFinder.findMinMax(list).get(0) ,"returns the right minimum value"),
					() -> assertEquals(60, minMaxFinder.findMinMax(list).get(1),"returns the right maximum value")
				);
		}
		
		@Test
		@DisplayName("Tests object generated for min, max")
		void testObject() {
			
			minMaxFinder = new MinMaxFinder(minMaxFinder.findMinMax(list).get(0), minMaxFinder.findMinMax(list).get(1));
			
			assertAll(
					() -> assertEquals(1, minMaxFinder.getMin() ,"returns the right minimum value"),
					() -> assertEquals(60, minMaxFinder.getMax(),"returns the right maximum value")
				);
		}
	}

}
