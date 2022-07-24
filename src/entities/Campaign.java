package entities;

public class Campaign {
	private int id;
    private String name;
    private double discountRate;
    
	public Campaign() {
	}


	public int getId() {
		return id;
	}
	

	public Campaign(int id, String name, double discountRate) {
		super();
		this.id = id;
		this.name = name;
		this.discountRate = discountRate;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
    
    

}
