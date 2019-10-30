
public class IPhone extends Product {
	
	private String modem;
	private boolean ThreeDTouch;
	
	
	public IPhone(String modelName, String screensize, String processor, String color, int price, String memory,String modem,boolean ThreeDTouch) {
		super(modelName, screensize, processor, color, price, memory);
		this.modem = modem;
		this.ThreeDTouch = ThreeDTouch;
		// TODO Auto-generated constructor stub
	}


	public String getModem() {
		return modem;
	}


	public boolean isThreeDTouch() {
		return ThreeDTouch;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (ThreeDTouch ? 1231 : 1237);
		result = prime * result + ((modem == null) ? 0 : modem.hashCode());
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
		IPhone other = (IPhone) obj;
		if (ThreeDTouch != other.ThreeDTouch)
			return false;
		if (modem == null) {
			if (other.modem != null)
				return false;
		} else if (!modem.equals(other.modem))
			return false;
		return true;
	}
	
	@Override
	public String writeFormat() {
		// TODO Auto-generated method stub
		return super.getModelName() + ", " + super.getScreensize() + ", " + super.getProcessor() + ", " + this.getModem() + ", " + super.getColor() + ", " + super.getMemory() + ", " + this.isThreeDTouch() + ", "+ super.getPrice() + "\n";
	}
	@Override
	public String printFormat() {
		String result = "Apple " + this.getModelName() + " with " + this.getMemory() + " of memory\n";
		result = result + "\twith " + super.getProcessor() + " processor and " + this.getScreensize() + " inch screen\n" + "\t" + this.getPrice() + " euros\n";
		return result;
	}

}
