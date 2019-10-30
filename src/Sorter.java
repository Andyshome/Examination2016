import java.util.*;
public class Sorter extends Thread {
	private ProductArray testArray;
	Comparator<Product> comparator;
	
	Sorter(Comparator<Product> tool,ProductArray testArray) {
		this.comparator = tool;
		this.testArray = testArray;
		
	}
	
	
	@Override
	public void run() {
		System.out.println("Sort is starting");
		testArray.sort(comparator);
		System.out.println("Sort finished");
	}
}
