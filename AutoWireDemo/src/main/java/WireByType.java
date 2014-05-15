import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class WireByType {

	private ApplicationContext context;
	private Person person;
	private DepartmentType departmentType;

	public void getApplicationContext() {
		context = new FileSystemXmlApplicationContext("spring-beans.xml");
		this.person = (Person) context.getBean("person");
		this.departmentType = (DepartmentType) person.getDepartment();
	}

	public DepartmentType getDepartmentTypeValue() {
		return this.departmentType;
	}

}
