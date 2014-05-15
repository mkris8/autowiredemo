import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class WireByTypeTest {

	private WireByType wireByType;
	private DepartmentType departmentType;
	
	@Before
	public void init() {
		wireByType = new WireByType();
		wireByType.getApplicationContext();
	}

	@Test
	public void testWireByTypeContextisNotNULL(){
		wireByType.getApplicationContext();
	}
	
	@Test
	public void testIfDepartmentFromPersonByTypeisNotNULL(){
		departmentType = wireByType.getDepartmentTypeValue();
		assertNotNull(departmentType);
		assertThat("elsevier-science", equalTo(wireByType.getDepartmentTypeValue().getDepartmentName()));
	}
}
