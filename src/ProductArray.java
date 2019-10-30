import java.io.*;
import java.util.*;
public class ProductArray {
	private List<Product> productArray;
	public ProductArray() {
		this.productArray = new ArrayList<Product>();
	}
	public List<Product> getProductArray() {
		return productArray;
	}

	public synchronized void addProduct(Product e) {
		productArray.add(e);
	}
	public static ProductArray read(String fileName) throws FileNotFoundException {
		File testFile = new File(fileName);
		Scanner myScanner = new Scanner(testFile);
		ProductArray result = new ProductArray();
		while(myScanner.hasNextLine()) {
			Product tempProduct = Product.read(myScanner.nextLine());
			result.addProduct(tempProduct);
		}
		return result;
	}
	public void write(String fileName) throws IOException {
		File testFile = new File(fileName);
		BufferedWriter writer = new BufferedWriter(new FileWriter(testFile));
		for (int i = 0; i< productArray.size() ; i++) {
			Product temp = productArray.get(i);
			writer.write(temp.writeFormat());
		}
		writer.flush();
		writer.close();
		
	}
	public String printFormat() {
		String result = "";
		for (int i = 0 ; i < productArray.size() ; i++ ) {
			result += productArray.get(i).printFormat();
		}
		return result;
	}
	public synchronized void sort(Comparator<Product> tool) {
		productArray.sort(tool);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((productArray == null) ? 0 : productArray.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductArray other = (ProductArray) obj;
		if (productArray == null) {
			if (other.productArray != null)
				return false;
		} else if (!productArray.equals(other.productArray))
			return false;
		return true;
	}

}
