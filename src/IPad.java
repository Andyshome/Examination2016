
public class IPad extends Product{
	private boolean internet;
	public IPad(String modelName, String screensize, String processor, String color, int price, String memory,boolean internet) {
		super(modelName, screensize, processor, color, price, memory);
		this.internet = internet;
		// TODO Auto-generated constructor stub
	}
	
	public boolean getInternet() {
		return this.internet;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (internet ? 1231 : 1237);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		IPad other = (IPad) obj;
		if (internet != other.internet)
			return false;
		return true;
	}
	@Override
	public String writeFormat() {
		// TODO Auto-generated method stub
		return super.getModelName() + ", " + super.getScreensize() + ", " + super.getProcessor() + ", " + this.getInternet() + ", " + super.getColor() + ", " + super.getMemory() + ", " + super.getPrice() + "\n";
	}
	@Override
	public String printFormat() {
		String temp = null;
		if (this.getInternet() == true) {
			temp = "WiFi and 4G technology";
		} else {
			temp = "WiFi technology";
		}
		String result = "Apple " + this.getModelName() + " with " + this.getMemory() + " of memory\n";
		result = result + "\twith " + super.getProcessor() + " processor and " + this.getScreensize() + " inch screen\n" + "\thaving " + temp + "\n" + "\t" + this.getPrice() + " euros\n";
		return result;
	}

}
