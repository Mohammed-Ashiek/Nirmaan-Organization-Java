package school;

public class Student {

	private int id;
	private String name;
	private long phno;
	private String email;
	
	public Student() {
		
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", phno=" + phno + ", email=" + email + "]";
	}

	public int getId() {
		return id;
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
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Student(int id, String name, long phno, String email) {
		super();
		this.id = id;
		this.name = name;
		this.phno = phno;
		this.email = email;
	}
	
	
}
