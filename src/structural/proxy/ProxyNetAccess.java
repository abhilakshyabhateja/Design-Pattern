package structural.proxy;

import java.util.logging.Logger;

import structural.proxy.domains.NetAccess;

public class ProxyNetAccess implements NetAccess {

	private int empGrade;
	private NetAccess real;
	
	Logger log = Logger.getLogger(this.getClass().getName());
	
	@Override
	public void grantPermission() {
		// TODO Auto-generated method stub

		if(empGrade > 5)
		{
			real = new RealNetAccess();
			real.grantPermission();
		}
		else
		{
			log.warning("Not authorised to access");
		}
	}

	@Override
	public void setEmpGrade(int empGrade) {
		// TODO Auto-generated method stub
		this.empGrade = empGrade;
	}

}
