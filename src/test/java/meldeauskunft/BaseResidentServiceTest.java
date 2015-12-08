package meldeauskunft;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;
import org.easymock.EasyMock;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Test;
 
public class BaseResidentServiceTest {
	
	@Test
	public void testgetFilteredResidentsList(){
		Date d = new Date();
		d.setTime(50);
		
		BaseResidentService brs = new BaseResidentService();
	//	ResidentR rs = createMock(ResidentRepository.class);
		brs.setResidentRepository(new BaseResidenRepositoryStub());
		List<Resident> output = brs.getFilteredResidentsList(new Resident("*","*","*","*", d));
		
		assertEquals(output.size(), 3);
	}
	@Test
	public void testgetFilteredResidentsList1(){
		Date d = new Date();
		d.setTime(50);
		
		BaseResidentService brs = new BaseResidentService();
		
		brs.setResidentRepository(new BaseResidenRepositoryStub());
		List<Resident> output = brs.getFilteredResidentsList(new Resident("b","*","*","*", d));
		
		assertEquals(output.size(), 0);
	}
	@Test
	public void testgetFilteredResidentsList2(){
		Date d = new Date();
		d.setTime(50);
		
		BaseResidentService brs = new BaseResidentService();
		
		brs.setResidentRepository(new BaseResidenRepositoryStub());
		List<Resident> output = brs.getFilteredResidentsList(new Resident("test2","family2","teststreet2","testcity2", d));
		
		assertEquals(output.size(), 1);
	}
	@Test
	public void testgetUniqueResident(){
		Date d = new Date();
		d.setTime(50);
		BaseResidentService brs = new BaseResidentService();
		
		brs.setResidentRepository(new BaseResidenRepositoryStub());

		Resident output = null;
		try {
			output = brs.getUniqueResident(new Resident("test2","family2","teststreet2","testcity2", d));
		} catch (ResidentServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(output.getGivenName(), "test2"); 
	}
	@Test
	public void testgetUniqueResident1(){
		Date d = new Date();
		d.setTime(50);
		BaseResidentService brs = new BaseResidentService();
		
		brs.setResidentRepository(new BaseResidenRepositoryStub());

		Resident output = null;
		try {
			output = brs.getUniqueResident(new Resident("*","*","teststreet2","testcity2", d));
			fail();
		} catch (ResidentServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Test
	public void testgetUniqueResident2(){
		Date d = new Date();
		d.setTime(50);
		BaseResidentService brs = new BaseResidentService();
		
		brs.setResidentRepository(new BaseResidenRepositoryStub());

		Resident output = null;
		try {
			output = brs.getUniqueResident(new Resident("e","e","teststreet2","testcity2", d));
			fail();
		} catch (ResidentServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
