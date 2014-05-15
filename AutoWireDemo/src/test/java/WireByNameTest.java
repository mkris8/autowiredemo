import org.junit.Before;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class WireByNameTest {

	private WireByName wireByName;
	private Employee employee;
	
	@Before
	public void init() {
		wireByName = new WireByName();
		wireByName.loadApplicationContext();
	}
	
	@Test
	public void testValuesByName(){
		employee = wireByName.getValuesByName();
		assertNotNull(employee);
	}
	
	@Test
	public void testDepartmentinEmployeeisNotNULL(){
		employee = wireByName.getValuesByName();
//		assertEquals("els-science",employee.getDepartment().getDepartmentName());
		assertThat("els-science", is(equalTo(employee.getDepartment().getDepartmentName())));
	}

}
