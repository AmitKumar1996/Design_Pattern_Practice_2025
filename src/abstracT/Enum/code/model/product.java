package abstracT.Enum.code.model;

public abstract class product {
	private String name;
	private String category;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public product(String name, String category) {
		super();
		this.name = name;
		this.category = category;
	}
	public product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "product [name=" + name + ", category=" + category + "]";
	}
	
	
	

}
