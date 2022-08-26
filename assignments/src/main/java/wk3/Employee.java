package wk3;

public class Employee {
	int id;
	String firstname;
	String lastname;
	String dept;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee (int id, String firstname, String lastname, String dept){
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.dept = dept;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", dept=" + dept + "]";
	}
}
