import java.util.*;
public class PriceSorter implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		if (o1.getPrice() > o2.getPrice()) {
			return 1;
		} else if (o1.getPrice() == o2.getPrice()) {
			return 0;
		} else {
			return -1;
		}
	}

}
