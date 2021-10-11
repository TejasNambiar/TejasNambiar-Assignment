package q1_MinMaxFinder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinMaxFinder {

	private int min, max;
	
	public MinMaxFinder() {}
	
	public MinMaxFinder(int min, int max) {
		this.min = min;
		this.max = max;
	}

	public List<Integer> findMinMax(List<Integer> inputList){
		List<Integer> list = new ArrayList<>();
		list.add(Collections.min(inputList));
		list.add(Collections.max(inputList));
	
		return list;
	}

	public int getMin() {
		return min;
	}

	public int getMax() {
		return max;
	}

}
