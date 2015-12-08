package meldeauskunft;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;

public class BaseResidenRepositoryStub implements ResidentRepository{

	public List<Resident> getResidents() {
		Date d = new Date();
		d.setTime(50);
		List<Resident> rl = new ArrayList <Resident>();
		rl.add(new Resident("test","family","teststreet","testcity", d));
		rl.add(new Resident("test1","family1","teststreet1","testcity1", d));
		rl.add(new Resident("test2","family2","teststreet2","testcity2", d));

		// TODO Auto-generated method stub
		return rl;
	}

}

