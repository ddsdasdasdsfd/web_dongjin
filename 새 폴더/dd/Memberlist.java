package dd;

public class Memberlist {

	

	public String id;
	public int password;
	
	
	
	
	public Memberlist(String id, int password) {
		super();
		this.id = id;
		this.password = password;
	}




	public String getId() {
		return id;
	}




	public void setId(String id) {
		this.id = id;
	}




	public int getPassword() {
		return password;
	}




	public void setPassword(int password) {
		this.password = password;
	}
	
	
}
