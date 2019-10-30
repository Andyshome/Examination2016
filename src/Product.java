
public abstract class Product {
	private String modelName;
	private String screensize;
	private String processor;
	private String color;
	private int price;
	private String memory;
	
	public Product(String modelName,String screensize,String processor,String color,int price,String memory) {
		this.memory = memory;
		this.screensize = screensize;
		this.processor = processor;
		this.modelName  = modelName;
		this.price = price;
		this.color = color;
	}

	public String getModelName() {
		return modelName;
	}

	public String getScreensize() {
		return screensize;
	}

	public String getProcessor() {
		return processor;
	}

	public String getColor() {
		return color;
	}

	public int getPrice() {
		return price;
	}

	public String getMemory() {
		return memory;
	}

	
	public static Product read(String line) {
		String[] lineContent = line.split(", ");
		String[] models = lineContent[0].split(" ");
		if (models[0].equals("IPHONE")) {
			String modelName = lineContent[0];
			String screensize = lineContent[1];
			String processer = lineContent[2];
			String modem = lineContent[3];
			String color = lineContent[4];
			String memory = lineContent[5];
			boolean ThreeDTouch = Boolean.parseBoolean(lineContent[6]);
			int price = Integer.parseInt(lineContent[7]);
			return new IPhone(modelName, screensize, processer, color, price, memory, modem, ThreeDTouch);
		} else {
			String modelName = lineContent[0];
			String screensize = lineContent[1];
			String processer = lineContent[2];
			boolean modem = Boolean.parseBoolean(lineContent[3]);
			String color = lineContent[4];
			String memory = lineContent[5];
			int price = Integer.parseInt(lineContent[6]);
			return new IPad(modelName, screensize, processer, color, price, memory, modem);
		}
	} 
	public abstract String writeFormat();
	public abstract String printFormat();
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((memory == null) ? 0 : memory.hashCode());
		result = prime * result + ((modelName == null) ? 0 : modelName.hashCode());
		result = prime * result + price;
		result = prime * result + ((processor == null) ? 0 : processor.hashCode());
		result = prime * result + ((screensize == null) ? 0 : screensize.hashCode());
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
		Product other = (Product) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (memory == null) {
			if (other.memory != null)
				return false;
		} else if (!memory.equals(other.memory))
			return false;
		if (modelName == null) {
			if (other.modelName != null)
				return false;
		} else if (!modelName.equals(other.modelName))
			return false;
		if (price != other.price)
			return false;
		if (processor == null) {
			if (other.processor != null)
				return false;
		} else if (!processor.equals(other.processor))
			return false;
		if (screensize == null) {
			if (other.screensize != null)
				return false;
		} else if (!screensize.equals(other.screensize))
			return false;
		return true;
	}
	
	
	
}
