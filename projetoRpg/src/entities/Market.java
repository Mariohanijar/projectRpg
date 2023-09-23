package entities;

/**
 * 
 */
public class Market {
	private String mercant;
	private String district;
	private String products;
	private String description;
	private int cost;
	
	public Market(String mercant, String district, String products, String description, int cost) {
		this.mercant = mercant;
		this.district = district;
		this.products = products;
		this.description = description;
		this.cost = cost;
		
	}
	
	public String getMercant() {
		return mercant;
	}
	
	public void setMercant(String mercant) {
		this.mercant = mercant;
	}
	
	public String getDistrict() {
		return district;
	}
	
	public void setDistrict(String district) {
		this.district = district;
	}
	
	public String getProducts() {
		return products;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setProducts(String products) {
		this.products = products;
	}
	
	public int getCost() {
		return cost;
	}
	
	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Market [mercant=" + mercant + ", district=" + district + ", products=" + products + ", description="
				+ description + ", cost=" + cost + "]";
	}

	
	
	
	
	
}
