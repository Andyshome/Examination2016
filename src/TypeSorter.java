import java.util.*;
public class TypeSorter implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		if (o1.getModelName().split(" ")[0].hashCode() > o2.getModelName().split(" ")[0].hashCode()) {
			return 1;
		} else if (o1.getModelName().split(" ")[0].hashCode() == o2.getModelName().split(" ")[0].hashCode()) {
			return 0;
		} else {
			return -1;
		}
	}

}
