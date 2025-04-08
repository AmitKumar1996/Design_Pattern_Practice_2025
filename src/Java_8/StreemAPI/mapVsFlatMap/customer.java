package Java_8.StreemAPI.mapVsFlatMap;

import java.util.List;

public class customer {
	private long id;
	private String name;
	private String email;
	private List<Long> phone;
	

	@Override
	public String toString() {
		return "customer [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", getId()="
				+ getId() + ", getName()=" + getName() + ", getEmail()=" + getEmail() + ", getPhone()=" + getPhone()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Long> getPhone() {
		return phone;
	}
	public void setPhone(List<Long> phone) {
		this.phone = phone;
	}
 customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public customer(long id, String name, String email, List<Long> phone) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	
}
