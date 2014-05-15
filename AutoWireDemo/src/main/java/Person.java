import org.springframework.beans.factory.annotation.Autowired;

public class Person {

	private String name;
//autowire by type
	@Autowired
	private DepartmentType departmentType;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DepartmentType getDepartment() {
		return departmentType;
	}

	public void setDepartment(Department department) {
		this.departmentType = departmentType;
	}

}
