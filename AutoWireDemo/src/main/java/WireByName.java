import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class WireByName {

	private ApplicationContext context;
	private Employee employee;
	private Department department;
	
	public void loadApplicationContext() {
		context = new FileSystemXmlApplicationContext("spring-beans.xml");
		this.employee = (Employee) context.getBean("employee");
		this.department = (Department)employee.getDepartment();
	}

	public Employee getValuesByName() {
		return this.employee;
	}

}
