package structural.proxy;

import java.util.logging.Logger;

import structural.proxy.domains.NetAccess;

/**
 * 
 * @author abha65
 *
 */

public class RealNetAccess implements NetAccess{
	
	private int empGrade;
	Logger log = Logger.getLogger(this.getClass().getName());
	@Override
	public void grantPermission(){
		
		log.info("Granted Permission");
		log.info("Open the browser and start");
	}
	
	@Override
	public void setEmpGrade(int empGrade){
		this.empGrade = empGrade;
	}
}
