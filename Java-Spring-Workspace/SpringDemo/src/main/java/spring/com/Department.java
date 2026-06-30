package spring.com;

public class Department {

	int id = 12;
	String Departmentname= "hr";
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDepartmentname() {
		return Departmentname;
	}
	public void setDepartmentname(String departmentname) {
		Departmentname = departmentname;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", Departmentname=" + Departmentname + "]";
	}
	
	
}
