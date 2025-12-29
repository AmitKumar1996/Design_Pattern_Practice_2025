package abstracT;

public class Stock {
	
	private String id;
	private String whereHouse;
	private int stock;
	/**
	 * @param id
	 * @param whereHouse
	 * @param stock
	 */
	public Stock(String id, String whereHouse, int stock) {
		super();
		this.id = id;
		this.whereHouse = whereHouse;
		this.stock = stock;
	}
	/**
	 * 
	 */
	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the whereHouse
	 */
	public String getWhereHouse() {
		return whereHouse;
	}
	/**
	 * @param whereHouse the whereHouse to set
	 */
	public void setWhereHouse(String whereHouse) {
		this.whereHouse = whereHouse;
	}
	/**
	 * @return the stock
	 */
	public int getStock() {
		return stock;
	}
	/**
	 * @param stock the stock to set
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "Stock [id=" + id + ", whereHouse=" + whereHouse + ", stock=" + stock + "]";
	}
	public Object get(String id2) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
