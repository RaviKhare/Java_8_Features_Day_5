package main.java.com.generics.multipletypeparameter;

import main.java.com.generics.service.OrderedPair;
import main.java.com.generics.service.Pair;

public class MultipleTypeParameterDemo {

	public static void main(String[] args) {
		
		Pair<String, String> pair = new OrderedPair<String, String>("USA", "California");
		Pair<String, Integer> pair2 = new OrderedPair<String, Integer>("California Population", 39000000);
		
		pair.getKey();
		pair2.getValue();
		
	}

}
