package meldeauskunft;

import static org.junit.Assert.*;
import static org.easymock.EasyMock.*;
import static org.hamcrest.MatcherAssert.assertThat;

import java.awt.List;
import java.util.ArrayList;
import java.util.Date;

import org.junit.Test;

public class ResidenRepositoreMock {
	
	private ArrayList<Resident> temp;
	public void test(){
		Date d = new Date();
		d.setTime(50);
		temp.add(new Resident("test","family","teststreet","testcity", d));
		temp.add(new Resident("test1","family1","teststreet1","testcity1", d));
		temp.add(new Resident("test2","family2","teststreet2","testcity2", d));
		
		ResidentRepository rm = createMock(ResidentRepository.class);

		expect(rm.getResidents().containsAll(temp));

	}
}
